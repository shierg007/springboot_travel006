package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbPermissions;
import com.qf.j1904.pojo.TbPermissionsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPermissionsMapper {
    int countByExample(TbPermissionsExample example);

    int deleteByExample(TbPermissionsExample example);

    int deleteByPrimaryKey(Integer permissionid);

    int insert(TbPermissions record);

    int insertSelective(TbPermissions record);

    List<TbPermissions> selectByExample(TbPermissionsExample example);

    TbPermissions selectByPrimaryKey(Integer permissionid);

    int updateByExampleSelective(@Param("record") TbPermissions record, @Param("example") TbPermissionsExample example);

    int updateByExample(@Param("record") TbPermissions record, @Param("example") TbPermissionsExample example);

    int updateByPrimaryKeySelective(TbPermissions record);

    int updateByPrimaryKey(TbPermissions record);
}