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

    /**
     * 计算展示角色信息的最大页码
     * @param rows 每页显示的行数
     * @return 最大页码
     */
    int calcMaxPage(int rows);

    /**
     * 添加新角色
     * @param role 新角色的名称
     * @return 是否成功
     */
    boolean insertRole(TbRoles role);

    /**
     * 多条件模糊查询角色信息
     * @param page 页码
     * @param rows  每页显示的行数
     * @param keyWords 模糊查询的关键字
     * @return 满足条件的角色信息
     */
    List<TbRoles> fuzzyQueryRole(int page,int rows,String keyWords);

    /**
     * 模糊查询后显示的最大页码数
     * @param rows 每页显示的行数
     * @param keyWords
     * @return 最大页码
     */
    int calcFuzzyQueryUserMaxPage(int rows,String keyWords);
}
