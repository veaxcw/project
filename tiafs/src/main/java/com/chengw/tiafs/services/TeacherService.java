package com.chengw.tiafs.services;


import com.chengw.tiafs.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherService {
    Teacher getTeacherByUsername(@Param("username") String username);
    List<Teacher> getAllTeacher();


}
