package com.chengw.tiafs.services;

import com.chengw.tiafs.dao.TeacherDAO;
import com.chengw.tiafs.po.Teacher;
import com.chengw.tiafs.vo.LoginEntity;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class AuthService {

    @Resource
    private TeacherDAO teacherDAO;

    public boolean check(LoginEntity userInfo){
        return true;
    }


//    //todo
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//
//        log.info("当前用户：",s);
//
//        //Teacher teacherInfo = teacherDAO.getTeacherByUsername(s);
//
//        User user = new User(s,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//
//        return user;
//    }
}
