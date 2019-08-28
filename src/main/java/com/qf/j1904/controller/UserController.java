package com.qf.j1904.controller;

import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.service.UserService;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;
import java.util.Random;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * ajax验证账户名是否已存在
     * @param loginName 账户名
     * @return 1：是 0：否
     */
    @ResponseBody
    @RequestMapping("/checkLoginName")
    public int checkLoginName(@RequestParam(value = "loginName")
                                      String loginName){
        List<TbUsers> users= userService.selectByLoginName(loginName);
        if (users.size()==0){
            return 0;
        }
        return 1;
    }

    /**
     * ajax验证昵称是否已存在
     * @param nickName
     * @return  1是0否
     */
    @ResponseBody
    @RequestMapping("/checkNickName")
    public int checkNickName(@RequestParam(value = "nickName")
                                     String nickName){
        List<TbUsers> tbUsers = userService.selectByNickName(nickName);
        if (tbUsers.size()==0){
            return 0;
        }
        return 1;
    }

    /**
     * 注册的处理，注册的角色类型默认是member（只有会员注册对外开放，管理员账号只能后台添加）
     * @param user loginname，password
     * @return 登陆页/错误页
     */
    @RequestMapping("/register")
    public String reg(TbUsers user){
            ByteSource credentialsSalt = ByteSource.Util.bytes(user.getLoginname());//使用登录名做为salt
            SimpleHash simpleHash = new SimpleHash("MD5", user.getPassword(), credentialsSalt, 1024);
            user.setPassword(simpleHash.toString());
            boolean b = userService.reg(user);
            return b ? "login" : "error";
    }

    /**
     * 登录
     * @param loginName 账户名
     * @param password 密码
     * @param roleType 用户的角色类型
     * @return 可以访问的页面
     */
    @RequestMapping(value = "/dealLogin",method = RequestMethod.POST)
    public String login(@RequestParam(value = "loginName") String loginName,
                        @RequestParam(value = "password") String password,
                        @RequestParam(value = "roleType") String roleType,
                        RedirectAttributes attributes){
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
            subject.login(token);
            if (subject.isAuthenticated()){
                if (roleType.equals("member")){
                    attributes.addAttribute("loginName",loginName);
                    return "redirect:member";
                }
                if (roleType.equals("admin")) {
                    return "redirect:main";
                }
            }
        } catch (IncorrectCredentialsException e){
            System.out.println("密码错误");
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return "redirect:login";
    }

    /**
     * 加载所有用户信息（权限控制）
     * @param page 页码
     * @param rows 每页的行数
     * @param model 放入用户信息，当前页码，最大页码
     * @return 用户管理页面
     */
    @RequiresPermissions(value={"用户维护"})
    @RequestMapping("/user_handler")
    public String loadAllUser(@RequestParam(defaultValue = "1",required = false)int page,
                              @RequestParam(defaultValue = "8",required = false)int rows,
                              @RequestParam("userId")Integer userId,
                              @RequestParam("nickName")String nickName,
                              Model model){
        int calcMaxPage = userService.calcMaxPage(rows);
        if (page<1){
            page = calcMaxPage;
        }
        if (page>calcMaxPage){
            page = 1;
        }
        List<TbUsers> tbUsers = userService.loadAllUser(page, rows);
        model.addAttribute("users",tbUsers);
        model.addAttribute("currentPage",page);
        model.addAttribute("calcMaxPage",calcMaxPage);
        model.addAttribute("userId",userId);
        model.addAttribute("nickName",nickName);
        return "user";
    }

    /**
     * 显示用户的角色信息（已拥有和为拥有）
     * @param uid 用户id
     * @param model model放入已拥有角色信息和为拥有的角色信息，用户id
     * @return 分配角色页面
     */
    @RequestMapping("/assign_role")
    public String assignRole(@RequestParam(value = "userId") Integer uid,
                             Model model){
        List<TbRoles> roles = userService.selectCurrentRole(uid);
        List<TbRoles> noroles = userService.selectNoHaveRole(uid);
        model.addAttribute("uid",uid);
        model.addAttribute("roles",roles);
        model.addAttribute("noroles",noroles);
        return "assignRole";
    }

    /**
     * 对用户完成添加移除角色信息
     * @param uid 用户id
     * @param norid 添加的角色id
     * @param rid 移除的角色id
     * @return 分配角色的页面
     */
    @RequestMapping("/move_role")
    public String moveRole(@RequestParam("uid") Integer uid,
                           @RequestParam(value = "noRoles",required = false,defaultValue = "0") Integer norid,
                           @RequestParam(value = "currentRoles",required = false,defaultValue = "0")Integer rid
                           ){
        if (norid == 0){
            userService.removeRole(uid,rid);
        }else{
            userService.addRole(uid,norid);
        }
        return "redirect:assign_role?userId="+uid;
    }

    /**
     * 模糊查询
     * @param page 页码
     * @param rows 行数
     * @param keywords 关键字
     * @param model 查询结果，当前页，最大页，关键字
     * @return 查询结果的显示
     */
    @RequestMapping("/fuzzy_query_user")
    public String fuzzyQueryUser(@RequestParam(defaultValue = "1",required = false)int page,
                                 @RequestParam(defaultValue = "8",required = false)int rows,
                                 @RequestParam("userId")Integer userId,
                                 @RequestParam("nickName")String nickName,
                                 String keywords,Model model){
        int calcMaxPage = userService.calcFuzzyQueryUserMaxPage(rows,keywords);
        if (page<1){
            page = calcMaxPage;
        }
        if (page>calcMaxPage){
            page = 1;
        }
        List<TbUsers> tbUsers = userService.fuzzyQueryUser(page, rows, keywords);
        model.addAttribute("users",tbUsers);
        model.addAttribute("currentPage",page);
        model.addAttribute("calcMaxPage",calcMaxPage);
        model.addAttribute("keywords",keywords);
        model.addAttribute("userId",userId);
        model.addAttribute("nickName",nickName);
        return "fq_user";
    }

    @RequestMapping("/add_user")
    public String addUserOfAdmin(@RequestParam("roleId")int roleId,
                                 @RequestParam("userId")Integer userId,
                                 @RequestParam("nickName")String nickName,
                                 TbUsers user, RedirectAttributes attributes){
        boolean b = userService.addUserOfAdmin(user, roleId);
        attributes.addAttribute("userId",userId);
        attributes.addAttribute("nickName",nickName);
        return b ? "redirect:user_handler" : "error";
    }

    /**
     * 会员查看自己的资料
     * @param userId 会员id
     * @param model 放入会员信息
     * @return 会员信息页
     */
    @RequestMapping("/memberinfo")
    public String memberInfo(@RequestParam("userId")Integer userId,Model model){
        TbUsers user = userService.selectById(userId);
        model.addAttribute("user",user);
        return "memberinfo";
    }

    /**
     * 给邮箱发送验证码
     * @param emailAddress 邮箱地址
     * @return 失败返回0，成功返回验证码内容
     */
    @ResponseBody
    @RequestMapping("/sendEmailCode")
    public int sendEmailCode(String emailAddress){
        HtmlEmail htmlEmail = new HtmlEmail();
        htmlEmail.setHostName("smtp.163.com");
        htmlEmail.setAuthentication("shierg007@163.com","xGq5741963");
        htmlEmail.setSubject("实名认证验证码");
        htmlEmail.setCharset("UTF-8");
        Random r = new Random();
        Integer emailContext=r.nextInt(999999);
        try {
            htmlEmail.setFrom("shierg007@163.com","千峰旅游网");
            htmlEmail.setHtmlMsg(String.valueOf(emailContext));
            htmlEmail.addTo(emailAddress);
            htmlEmail.send();
        } catch (EmailException e) {
            e.printStackTrace();
            return 0;
        }
        return emailContext;
    }

//    @RequestMapping("/dealApply")
//    public String apply(TbUsers user, MultipartFile file,
//                        HttpServletRequest request, RedirectAttributes attributes){
//        boolean b = userService.updateByPrimaryKeySelective(user);
//        String nickname = user.getNickname();
//        String path = request.getServletContext().getRealPath("/upload"+"/"+nickname);
//        File uploadRoot = new File(path);
//        if (!uploadRoot.exists()) {
//            uploadRoot.mkdirs();
//        }
//        try {
//            if (file!=null) {
//                InputStream inputStream = file.getInputStream();
//                byte[] bs = new byte[inputStream.available()];
//                inputStream.read(bs, 0, bs.length);
//                inputStream.close();
//                OutputStream outputStream = new FileOutputStream(uploadRoot + "/" + file.getOriginalFilename());
//                outputStream.write(bs, 0, bs.length);
//                outputStream.flush();
//                outputStream.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        attributes.addAttribute("userId",user.getUserid());
//        return b?"redirect:memberinfo":"error";
//    }
    @RequestMapping("uploadhandler")
    public String uploadHandler(MultipartFile uploadFile, Integer userId,
                                HttpServletRequest request,Model model){
        TbUsers user = userService.selectById(userId);
        String path = request.getServletContext().getRealPath("/upload"+"/"+user.getNickname());
        File uploadRoot = new File(path);
        if (!uploadRoot.exists()) {
            uploadRoot.mkdirs();
        }
        try {
            InputStream inputStream = uploadFile.getInputStream();
            byte[] bs = new byte[inputStream.available()];
            inputStream.read(bs, 0, bs.length);
            inputStream.close();
            OutputStream outputStream = new FileOutputStream(uploadRoot + "/" + uploadFile.getOriginalFilename());
            outputStream.write(bs, 0, bs.length);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "apply";
    }
}
