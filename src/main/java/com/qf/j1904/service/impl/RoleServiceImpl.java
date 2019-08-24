package com.qf.j1904.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.j1904.mapper.TbRolesMapper;
import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private TbRolesMapper rolesMapper;

    @Override
    public List<TbRoles> loadRoles(int page,int rows) {
        PageHelper.startPage(page, rows);
        return rolesMapper.selectByExample(null);
    }

    @Override
    public int calcMaxPage(int rows) {
        int roleCount = rolesMapper.countByExample(null);
        return roleCount%rows == 0 ? roleCount/rows : roleCount/rows+1;
    }

    @Override
    public boolean insertRole(TbRoles role) {
        return rolesMapper.insertSelective(role)>0;
    }

    @Override
    public List<TbRoles> fuzzyQueryRole(int page, int rows, String keyWords) {
        HashMap<String, String> map = new HashMap<>();
        map.put("roleName","%"+keyWords+"%");
        map.put("roleType","%"+keyWords+"%");
        PageHelper.startPage(page,rows);
        return rolesMapper.fuzzyQueryRole(map);
    }

    @Override
    public int calcFuzzyQueryUserMaxPage(int rows, String keyWords) {
        HashMap<String, String> map = new HashMap<>();
        map.put("roleName","%"+keyWords+"%");
        map.put("roleType","%"+keyWords+"%");
        int count = rolesMapper.fuzzyQueryRoleCount(map);
        return count%rows == 0 ? count/rows : count/rows+1;
    }

}
