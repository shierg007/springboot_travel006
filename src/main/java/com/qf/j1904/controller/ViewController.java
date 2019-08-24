package com.qf.j1904.controller;

import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginView(){
        return "login";
    }

    @RequestMapping("/reg")
    public String regView(){
        return "reg";
    }

    /**
     * 后台页面
     * @param model 将当前登陆的账号信息填入model中（通过subject获得loginName，loginName获得账号所有信息）
     * @return 后台页面
     */
    @RequiresRoles(value = "admin")
    @RequestMapping("/main")
    public String mainView(Model model){
        Object principal = SecurityUtils.getSubject().getPrincipal();
        if (!StringUtils.isEmpty(principal)){
            String loginName = (String) principal;
            List<TbUsers> tbUsers = userService.selectByLoginName(loginName);
            for (TbUsers user:tbUsers
                 ) {
                model.addAttribute("user",user);
            }
        }
        return "main";
    }
    /**
     * 前台页面
     * @param model 将当前登陆的账号信息填入model中（通过subject获得loginName，loginName获得账号所有信息）
     * @return 前台页面
     */
    @RequiresRoles(value = "member")
    @RequestMapping("/member")
    public String memberView(Model model){
        Object principal = SecurityUtils.getSubject().getPrincipal();
        if (!StringUtils.isEmpty(principal)){
            String loginName = (String) principal;
            List<TbUsers> tbUsers = userService.selectByLoginName(loginName);
            for (TbUsers user:tbUsers
            ) {
                model.addAttribute("user",user);
            }
        }
        return "member";
    }

    @RequestMapping("/add_view")
    public String addView(@RequestParam("userId") int userId,
                          Model model){
        List<TbRoles> managedRoles = userService.managedRoles(userId);
        model.addAttribute("managedRoles",managedRoles);
        return "add";
    }
}
