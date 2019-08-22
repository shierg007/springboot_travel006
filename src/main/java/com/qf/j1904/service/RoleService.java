package com.qf.j1904.service;

import com.qf.j1904.pojo.TbRoles;

import java.util.List;

public interface RoleService {

    /**
     * 加载所有的角色信息
     * @param page  页码
     * @param rows  每一页显示的行数
     * @return 角色信息的集合
     */
    List<TbRoles> loadRoles(int page,int rows);

}
