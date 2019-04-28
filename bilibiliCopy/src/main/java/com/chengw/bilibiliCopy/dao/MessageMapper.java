package com.bilibili.main.dao;

import com.bilibili.main.model.Message;
import com.bilibili.main.model.MessageExample;
import com.bilibili.main.model.MessageWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int insert(MessageWithBLOBs record);

    int insertSelective(MessageWithBLOBs record);

    List<MessageWithBLOBs> selectByExampleWithBLOBs(MessageExample example);

    List<Message> selectByExample(MessageExample example);

    int updateByExampleSelective(@Param("record") MessageWithBLOBs record, @Param("example") MessageExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageWithBLOBs record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);
}