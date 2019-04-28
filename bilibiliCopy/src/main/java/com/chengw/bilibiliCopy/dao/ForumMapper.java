package com.bilibili.main.dao;

import com.bilibili.main.model.Forum;
import com.bilibili.main.model.ForumExample;
import com.bilibili.main.model.ForumWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumMapper {
    int countByExample(ForumExample example);

    int deleteByExample(ForumExample example);

    int insert(ForumWithBLOBs record);

    int insertSelective(ForumWithBLOBs record);

    List<ForumWithBLOBs> selectByExampleWithBLOBs(ForumExample example);

    List<Forum> selectByExample(ForumExample example);

    int updateByExampleSelective(@Param("record") ForumWithBLOBs record, @Param("example") ForumExample example);

    int updateByExampleWithBLOBs(@Param("record") ForumWithBLOBs record, @Param("example") ForumExample example);

    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);
}