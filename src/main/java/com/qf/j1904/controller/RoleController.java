package com.qf.j1904.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {

    @RequiresPermissions(value = {"角色维护"})
    @RequestMapping("/role_handler")
    public String showRoles(){
        return "role";
    }

    @RequestMapping("/assignpermission")
    public String assignPermission(){
        return "assignPermission";
    }
}
