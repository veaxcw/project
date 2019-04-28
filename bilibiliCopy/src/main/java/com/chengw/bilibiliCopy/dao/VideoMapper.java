package com.bilibili.main.dao;

import com.bilibili.main.model.Video;
import com.bilibili.main.model.VideoExample;
import com.bilibili.main.model.VideoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int insert(VideoWithBLOBs record);

    int insertSelective(VideoWithBLOBs record);

    List<VideoWithBLOBs> selectByExampleWithBLOBs(VideoExample example);

    List<Video> selectByExample(VideoExample example);

    int updateByExampleSelective(@Param("record") VideoWithBLOBs record, @Param("example") VideoExample example);

    int updateByExampleWithBLOBs(@Param("record") VideoWithBLOBs record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);
}