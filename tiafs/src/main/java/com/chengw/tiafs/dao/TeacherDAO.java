package com.chengw.tiafs.dao;

import com.chengw.tiafs.po.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


//@Repository
@Mapper
public interface TeacherDAO{

    Teacher getTeacherByUsername(@Param("userName") String userName);

    List<Teacher> getAllTeacher();



}
