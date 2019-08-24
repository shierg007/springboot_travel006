package com.qf.j1904.service.impl;

import com.qf.j1904.mapper.TbPermissionsMapper;
import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private TbPermissionsMapper permissionsMapper;


    @Override
    public List<TbPermissions> loadAllPermission() {
        return permissionsMapper.selectByExample(null);
    }

    @Override
    public List<TbPermissions> loadPermissionByRoleId(int roleId) {
        return permissionsMapper.loadPermissionByRoleId(roleId);
    }

    @Override
    public boolean deleteAllPermission(int roleId) {
        return permissionsMapper.deleteAllPermission(roleId)>0;
    }

    @Override
    public boolean assignPermission(int rid, int pid) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("rid",rid);
        map.put("pid",pid);
        return permissionsMapper.assignPermission(map)>0;
    }
}
