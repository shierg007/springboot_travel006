package com.qf.j1904.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PermissionController {

    @RequiresPermissions(value = {"许可维护"})
    @RequestMapping("/permission_handler")
    public String showPermissions(){
        return "permission";
    }
}
