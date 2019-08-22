package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbRoles;
import com.qf.j1904.pojo.TbRolesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRolesMapper {
    int countByExample(TbRolesExample example);

    int deleteByExample(TbRolesExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(TbRoles record);

    int insertSelective(TbRoles record);

    List<TbRoles> selectByExample(TbRolesExample example);

    TbRoles selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") TbRoles record, @Param("example") TbRolesExample example);

    int updateByExample(@Param("record") TbRoles record, @Param("example") TbRolesExample example);

    int updateByPrimaryKeySelective(TbRoles record);

    int updateByPrimaryKey(TbRoles record);
}