package com.qf.j1904.service;

import com.qf.j1904.pojo.TbPermissions;

import java.util.List;

public interface PermissionService {
    /**
     * 查找所有权限信息
     * @return 所有权限信息集合
     */
    List<TbPermissions> loadAllPermission();

    /**
     * 某角色拥有的权限
     * @param roleId 角色id
     * @return 权限集合
     */
    List<TbPermissions> loadPermissionByRoleId(int roleId);

    /**
     * 删除角色所有权限
     * @param roleId 角色id
     * @return 是否成功
     */
    boolean deleteAllPermission(int roleId);

    /**
     * 分配权限
     * @param rid roleId
     * @param pid permissionId
     * @return 是否成功
     */
    boolean assignPermission(int rid, int pid);
}
