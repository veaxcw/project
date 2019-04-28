package com.bilibili.main.dao;

import com.bilibili.main.model.Grids;
import com.bilibili.main.model.GridsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GridsMapper {
    int countByExample(GridsExample example);

    int deleteByExample(GridsExample example);

    int insert(Grids record);

    int insertSelective(Grids record);

    List<Grids> selectByExample(GridsExample example);

    int updateByExampleSelective(@Param("record") Grids record, @Param("example") GridsExample example);

    int updateByExample(@Param("record") Grids record, @Param("example") GridsExample example);
}