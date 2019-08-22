package com.qf.j1904.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.j1904.mapper.TbRolesMapper;
import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
