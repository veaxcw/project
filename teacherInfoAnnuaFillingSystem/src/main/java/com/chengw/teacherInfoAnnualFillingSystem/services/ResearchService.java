package com.chengw.teacherInfoAnnualFillingSystem.services;


import com.chengw.teacherInfoAnnualFillingSystem.model.Research;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ResearchService {
    List<Research> findByUserCode(@Param("userCode") String userCode );
    List<Research> findByRid(@Param("rid") int rid);
    List<Research> findByCondition(@Param("rid") int rid,@Param("rname")String rname);
    void updateResearch(@Param("research") Research research);
    void deleteResearch(@Param("rid") int rid);
    void saveResearch(@Param("research") Research research);
}
