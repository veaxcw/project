package com.chengw.teacherInfoAnnualFillingSystem.controller;

import com.chengw.teacherInfoAnnualFillingSystem.model.Researchresult;
import com.chengw.teacherInfoAnnualFillingSystem.model.Teacher;
import com.chengw.teacherInfoAnnualFillingSystem.services.ResearchResultService;
import com.chengw.teacherInfoAnnualFillingSystem.util.CommonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/researchResultServlet")
public class ResearchResultController {//这部分没这么写注释，基本上参照ResearchController*/

    private List<Researchresult> researchResults = null;
    @Resource
    private ResearchResultService researchResultService;
    private Map<String,String> info = null;

    @RequestMapping("/findByCondition")
    public String findByCondition(){
        return "research/researchresult";
    }

    @RequestMapping("/findByUsercode")
    public String findByUsercode(HttpServletRequest request){//查
        updateResearchResults(request);


        return "research/researchresult";

    }


    @RequestMapping("/findByRrid")
    public String findByRrid(HttpServletRequest request){
        int rrid = Integer.parseInt(request.getParameter("rrid"));

        Researchresult researchResult = researchResultService.findByRrid(rrid);

        request.setAttribute("researchResult",researchResult);

        return "research/update_researchresult";

    }

    @RequestMapping("update")
    public String updateResearch(HttpServletRequest request){
        info = CommonUtils.saveForm(request,"/researchresult");
        Researchresult researchresult = CommonUtils.toBean(info,Researchresult.class);
        researchResultService.updateResearchResult(researchresult);

        updateResearchResults(request);

        return "research/researchresult";
    }


    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        int rrid = Integer.parseInt(request.getParameter("rrid"));

        researchResultService.deleteResearchResult(rrid);

        updateResearchResults(request);

        return "research/researchresult";
    }

    @RequestMapping("save")
    public String save(HttpServletRequest request){
        info = CommonUtils.saveForm(request,"/researchresult");

        Researchresult researchresult = CommonUtils.toBean(info,Researchresult.class);

        researchResultService.saveResearchResult(researchresult);

        updateResearchResults(request);

        return "research/researchresult";

    }

    private void updateResearchResults(HttpServletRequest request){//用来更新session中的researchResults集合
        HttpSession session = request.getSession();
        session.removeAttribute("researchResults");//移除旧的researchResults


        Teacher teacher = (Teacher)session.getAttribute("teacher");

        researchResults = researchResultService.findByUserCode(teacher.getUsercode());
        session.setAttribute("researchResults",researchResults);//添加新的

    }
}
