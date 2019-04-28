package main.dao;

import main.controller.LoginController;
import main.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        TeacherDAO teacherMapper = (TeacherDAO)context.getBean("teacherDAO");
        System.out.println(teacherMapper);
        Teacher t = teacherMapper.getTeacherByUsername("admin");
        System.out.println(t);

        LoginController c=(LoginController)context.getBean("loginController");


    }
}
