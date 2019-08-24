package com.qf.j1904.controller;

import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.service.PermissionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    /**
     * 权限维护页面跳转
     * @param userId 当前用户id
     * @param nickName 当前用户昵称
     * @param model 当前用户信息
     * @return 权限维护页面
     */
    @RequiresPermissions(value = {"许可维护"})
    @RequestMapping("/permission_handler")
    public String permissionsView(@RequestParam("userId")Integer userId,
                                  @RequestParam("nickName")String nickName,
                                  Model model){
        model.addAttribute("userId",userId);
        model.addAttribute("nickName",nickName);
        return "permission";
    }

    /**
     * 加载所有权限信息（ajax）
     * @return 权限信息的集合
     */
    @ResponseBody
    @RequestMapping("/loadAllPermission")
    public List<TbPermissions> showPermissions(){
        return permissionService.loadAllPermission();
    }

    @ResponseBody
    @RequestMapping("/currentPermission")
    public List<TbPermissions> loadPermissionByRoleId(int roleId){
        List<TbPermissions> currentPermission = permissionService.loadPermissionByRoleId(roleId);
        List<TbPermissions> allPermission = permissionService.loadAllPermission();

        for (TbPermissions currentP:currentPermission){
            for (TbPermissions allP:allPermission){
                if (currentP.getId() == allP.getId()){
                    allP.setChecked("true");
                    break;
                }
            }
                    }
                    return allPermission;
                    }

@ResponseBody
@RequestMapping("/assignPermission")
public String assignPermission(int roleId,String pids){
        String[] pid = pids.split("-");
        boolean b = false;
        permissionService.deleteAllPermission(roleId);
        for (String s : pid) {
        b = permissionService.assignPermission(roleId,Integer.parseInt(s));
        }
        return b?"true":"false";
        }

        }
