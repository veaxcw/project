package com.bilibili.main.dao;

import com.bilibili.main.model.ForumReply;
import com.bilibili.main.model.ForumReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumReplyMapper {
    int countByExample(ForumReplyExample example);

    int deleteByExample(ForumReplyExample example);

    int insert(ForumReply record);

    int insertSelective(ForumReply record);

    List<ForumReply> selectByExampleWithBLOBs(ForumReplyExample example);

    List<ForumReply> selectByExample(ForumReplyExample example);

    int updateByExampleSelective(@Param("record") ForumReply record, @Param("example") ForumReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") ForumReply record, @Param("example") ForumReplyExample example);

    int updateByExample(@Param("record") ForumReply record, @Param("example") ForumReplyExample example);
}