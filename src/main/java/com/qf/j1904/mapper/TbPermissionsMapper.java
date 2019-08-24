package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.pojo.TbPermissionsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPermissionsMapper {
    int countByExample(TbPermissionsExample example);

    int deleteByExample(TbPermissionsExample example);

    int deleteByPrimaryKey(Integer permissionid);

    int insert(TbPermissions record);

    int insertSelective(TbPermissions record);

    /**
     * 根据某列查询
     * @param example 非主键列
     * @return 权限信息
     */
    List<TbPermissions> selectByExample(TbPermissionsExample example);

    TbPermissions selectByPrimaryKey(Integer permissionid);

    int updateByExampleSelective(@Param("record") TbPermissions record, @Param("example") TbPermissionsExample example);

    int updateByExample(@Param("record") TbPermissions record, @Param("example") TbPermissionsExample example);

    int updateByPrimaryKeySelective(TbPermissions record);

    int updateByPrimaryKey(TbPermissions record);

    /**
     * 根据角色id查询拥有的权限信息
     * @param roleId 角色id
     * @return 拥有的权限信息
     */
    List<TbPermissions> loadPermissionByRoleId(int roleId);

    /**
     * 删除某角色所有权限
     * @param roleId 角色id
     * @return 数据库状态
     */
    int deleteAllPermission(int roleId);

    /**
     * 重新分配权限
     * @param maps rid，pid
     * @return 数据库状态
     */
    int assignPermission(Map<String,Integer> maps);
}