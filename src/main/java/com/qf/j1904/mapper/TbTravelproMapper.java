package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbTravelpro;
import com.qf.j1904.pojo.TbTravelproExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbTravelproMapper {
    int countByExample(TbTravelproExample example);

    int deleteByExample(TbTravelproExample example);

    int deleteByPrimaryKey(Integer travelid);

    int insert(TbTravelpro record);

    int insertSelective(TbTravelpro record);

    List<TbTravelpro> selectByExample(TbTravelproExample example);

    TbTravelpro selectByPrimaryKey(Integer travelid);

    int updateByExampleSelective(@Param("record") TbTravelpro record, @Param("example") TbTravelproExample example);

    int updateByExample(@Param("record") TbTravelpro record, @Param("example") TbTravelproExample example);

    int updateByPrimaryKeySelective(TbTravelpro record);

    int updateByPrimaryKey(TbTravelpro record);
}