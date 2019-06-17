package com.chengw.tiafs.controller;

import com.chengw.tiafs.po.Teacher;
import com.chengw.tiafs.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.List;

@Controller
@RequestMapping("/teacherServlet")
public class TeacherController {

    @Resource
    private TeacherService teacherService;
    List<Teacher> teachers = null;

    @RequestMapping("/findByCondition")
    public String findByCondition(HttpServletRequest request){

        teachers = teacherService.getAllTeacher();
        request.setAttribute("teachers",teachers);

      return "teaching/teacher";
    }

    public void test(){

        int n = 5;
        BigInteger first = BigInteger.valueOf(1);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger third = BigInteger.valueOf(0);
        long start = System.currentTimeMillis();
        for(int i = 0;i < n; i++){
            third = first.add(second);
            first = second;
            second = third;
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("第" + n + "个数：" + third);
        System.out.println("time:" + end);

    }


}
