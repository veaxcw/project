package com.chengw.tiafs.controller;


import com.chengw.tiafs.po.Research;
import com.chengw.tiafs.po.TeacherBean;
import com.chengw.tiafs.services.ResearchService;
import com.chengw.tiafs.util.CommonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ResearchController {

    @Resource
    private ResearchService researchService;

    private List<Research> researches = null;//存储research的结果集

    Map<String,String> info = null;//用来存储表单中的数据

    @RequestMapping("/findByCondition")
    public String findByCondition(HttpServletRequest request, Model model){

        int rid = Integer.parseInt(request.getParameter("rid"));
        String rname = request.getParameter("rname");

        researches = researchService.findByCondition(rid,rname);

        HttpSession session = request.getSession();
        session.removeAttribute("researches");//移除旧的researches
        session.setAttribute("researches",researches);//添加新的

        return "/research/research";
    }

    @RequestMapping("/findByUserCode")
    public String findByUserCode(HttpServletRequest request){

        updateResearches(request);

        return "/research/research";

    }

    @RequestMapping("/findByRid")
    public String findByRid(HttpServletRequest request){//根据rid查找科研项目

        int rid = Integer.parseInt(request.getParameter("rid"));

        researches = researchService.findByRid(rid);

        return "/research/update_research";//返回到修改科研项目页面
    }


    @RequestMapping("/update")
    public String updateResearch(HttpServletRequest request){//修改research

        info = CommonUtils.saveForm(request,"/research");//获取form表单map

        Research modifyResearch = CommonUtils.toBean(info,Research.class);//通过工具类将form表单封装成对象

        researchService.updateResearch(modifyResearch);//写入数据库

        researches = researchService.findByRid(Integer.parseInt(info.get("usercode")));//更新查找

        updateResearches(request);

        return "/research/research";
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest request ){
        int rid = Integer.parseInt(request.getParameter("rid"));
        researchService.deleteResearch(rid);

        updateResearches(request);

        return "/research/research";

    }

    @RequestMapping("/save")
    public String save(HttpServletRequest request){

        info = CommonUtils.saveForm(request,"/research");
        Research newResearch = CommonUtils.toBean(info,Research.class);

        researchService.saveResearch(newResearch);

        updateResearches(request);

        return "/research/research";

    }

    private void updateResearches(HttpServletRequest request){//用来更新session中的research集合
        HttpSession session = request.getSession();
        session.removeAttribute("researches");//移除旧的researches


        TeacherBean teacherBean = (TeacherBean)session.getAttribute("teacherBean");

        researches = researchService.findByUserCode(teacherBean.getUserCode());
        session.setAttribute("researches",researches);//添加新的

    }
}
