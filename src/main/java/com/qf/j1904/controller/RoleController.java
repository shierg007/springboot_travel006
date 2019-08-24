package com.qf.j1904.controller;

import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.service.RoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequiresPermissions(value = {"角色维护"})
    @RequestMapping("/role_handler")
    public String showRoles(@RequestParam(defaultValue = "8",required = false) int rows,
                            @RequestParam(value = "page",defaultValue = "1",required = false) int page,
                            @RequestParam("userId")Integer userId,
                            @RequestParam("nickName")String nickName,
                            Model model){
        int calcMaxPage = roleService.calcMaxPage(rows);
        if (page<1){
            page = calcMaxPage;
        }
        if (page>calcMaxPage){
            page = 1;
        }
        List<TbRoles> tbRoles = roleService.loadRoles(page, rows);
        model.addAttribute("roles",tbRoles);
        model.addAttribute("currentPage",page);
        model.addAttribute("calcMaxPage",calcMaxPage);
        model.addAttribute("userId",userId);
        model.addAttribute("nickName",nickName);
        return "role";
    }

    @RequestMapping("/assign_permission")
    public String assignPermission(){
        return "assignPermission";
    }
    @RequestMapping("/addroleview")
    public String addRoleView(@RequestParam("userId")Integer userId,
                              @RequestParam("nickName")String nickName,
                              Model model){
        model.addAttribute("userId",userId);
        model.addAttribute("nickName",nickName);
        return "addrole";
    }
    @RequestMapping("/add_role")
    public String addRoleView(TbRoles role,
                              @RequestParam("userId")Integer userId,
                              @RequestParam("nickName")String nickName,
                              RedirectAttributes attributes){
        boolean b = roleService.insertRole(role);
        attributes.addAttribute("userId",userId);
        attributes.addAttribute("nickName",nickName);
        return b ? "redirect:role_handler" : "error";
    }
}
