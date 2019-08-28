package com.qf.j1904.mapper;

import com.qf.j1904.pojo.TbEvaluation;
import com.qf.j1904.pojo.TbEvaluationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbEvaluationMapper {
    int countByExample(TbEvaluationExample example);

    int deleteByExample(TbEvaluationExample example);

    int deleteByPrimaryKey(Integer evaluationid);

    int insert(TbEvaluation record);

    int insertSelective(TbEvaluation record);

    List<TbEvaluation> selectByExample(TbEvaluationExample example);

    TbEvaluation selectByPrimaryKey(Integer evaluationid);

    int updateByExampleSelective(@Param("record") TbEvaluation record, @Param("example") TbEvaluationExample example);

    int updateByExample(@Param("record") TbEvaluation record, @Param("example") TbEvaluationExample example);

    int updateByPrimaryKeySelective(TbEvaluation record);

    int updateByPrimaryKey(TbEvaluation record);
}