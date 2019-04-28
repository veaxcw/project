package com.bilibili.main.service;

import com.bilibili.main.model.User;
import com.bilibili.main.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserServices {

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}
