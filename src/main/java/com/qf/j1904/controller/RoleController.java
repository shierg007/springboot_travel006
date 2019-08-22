package com.qf.j1904.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoleController {

    @RequiresPermissions(value = {"角色维护"})
    @RequestMapping("/role_handler")
    public String showRoles(@RequestParam(defaultValue = "8",required = false) int rows,
                            @RequestParam(defaultValue = "1",required = false) int page,
                            Model model){

        return "role";
    }

    @RequestMapping("/assign_permission")
    public String assignPermission(){
        return "assignPermission";
    }
}
