package com.chengw.tiafs.services.support;

import com.chengw.tiafs.dao.TeacherDAO;
import com.chengw.tiafs.model.Teacher;
import com.chengw.tiafs.services.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherDAO teacherDAO;


    public Teacher getTeacherByUsername(String username) {
        return teacherDAO.getTeacherByUsername(username);
    }

    public List<Teacher> getAllTeacher() {
        return teacherDAO.getAllTeacher();
    }


}
