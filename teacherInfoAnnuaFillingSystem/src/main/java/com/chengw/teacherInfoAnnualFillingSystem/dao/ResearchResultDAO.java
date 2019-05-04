package com.chengw.teacherInfoAnnualFillingSystem.dao;

import com.chengw.teacherInfoAnnualFillingSystem.model.Research;
import com.chengw.teacherInfoAnnualFillingSystem.model.Researchresult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResearchResultDAO {
    List<Researchresult> findByUserCode(@Param("userCode") String userCode );//根据UserCode查找

    Researchresult findByRrid(@Param("rrid") int rrid);

    void updateResearchResult(@Param("researchResult") Research research);

    void deleteResearchResult(@Param("rrid") int rrid);

    void saveResearchResult(@Param("researchResult") Research research);
}
