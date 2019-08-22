package com.qf.j1904.controller;

import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
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

import java.util.List;

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
     * 注册的处理
     * @param roleType 注册的角色类型（只有会员注册对外开放，管理员账号只能后台添加）
     * @param user loginname，password
     * @return 登陆页/错误页
     */
    @RequestMapping("/register")
    public String reg(@RequestParam("roleType") String roleType,TbUsers user){
            ByteSource credentialsSalt = ByteSource.Util.bytes(user.getLoginname());//使用登录名做为salt
            SimpleHash simpleHash = new SimpleHash("MD5", user.getPassword(), credentialsSalt, 1024);
            user.setPassword(simpleHash.toString());
            boolean b = userService.reg(user, roleType);
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
                        @RequestParam(value = "roleType") String roleType){
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
            subject.login(token);
            if (subject.isAuthenticated()){
                if (roleType.equals("member")){
                    return "redirect:member";
                }
                if (roleType.equals("admin")) {
                    return "redirect:main";
                }
            }
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
        return "user";
    }


    @RequestMapping("/assign_role")
    public String assignRole(@RequestParam("userId") Integer userId){
        return "assignRole";
    }
}
