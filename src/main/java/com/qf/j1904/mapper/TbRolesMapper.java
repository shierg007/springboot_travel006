package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbRolesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRolesMapper {
    /**
     * 查询某列的指的数量
     * @param example
     * @return
     */
    int countByExample(TbRolesExample example);

    /**
     * 根据某一列数据删除
     * @param example
     * @return
     */
    int deleteByExample(TbRolesExample example);

    /**
     * 根据主键删除数据
     * @param roleid
     * @return
     */
    int deleteByPrimaryKey(Integer roleid);

    /**
     * 插入数据
     * @param record
     * @return
     */
    int insert(TbRoles record);

    /**
     * 动态插入数据
     * @param record
     * @return
     */
    int insertSelective(TbRoles record);

    /**
     *  非主键查询角色信息
     * @param example   非主键属性
     * @return  满足条件的角色信息集合
     */
    List<TbRoles> selectByExample(TbRolesExample example);

    /**
     * 根据主键查询
     * @param roleid
     * @return
     */
    TbRoles selectByPrimaryKey(Integer roleid);

    /**
     * 根据某列数据动态更新
     * @param record 新用户的信息
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") TbRoles record, @Param("example") TbRolesExample example);

    /**
     * 根据某列数据更新
     * @param record 新用户信息(更新全部数据)
     * @param example
     * @return
     */
    int updateByExample(@Param("record") TbRoles record, @Param("example") TbRolesExample example);

    /**
     * 动态根据主键更新数据
     * @param record 用户信息（部分）
     * @return
     */
    int updateByPrimaryKeySelective(TbRoles record);

    /**
     * 根据主键更新全部数据
     * @param record 新用户信息
     * @return
     */
    int updateByPrimaryKey(TbRoles record);

    /**
     * 多条件模糊查询
     * @param map roleName,roleType等多个条件
     * @return 角色信息
     */
    List<TbRoles> fuzzyQueryRole(Map<String,String> map);

    /**
     * 模糊查询后的数据条数
     * @param map roleName,roleType等多个条件
     * @return 数据条数
     */
    int fuzzyQueryRoleCount(Map<String,String> map);


}