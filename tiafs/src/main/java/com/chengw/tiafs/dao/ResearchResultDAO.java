package com.chengw.tiafs.dao;
import com.chengw.tiafs.model.Research;
import com.chengw.tiafs.model.Researchresult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Mapper
public interface ResearchResultDAO {
    List<Researchresult> findByUserCode(@Param("userCode") String userCode);//根据UserCode查找

    Researchresult findByRrId(@Param("rrId") int rrId);

    void updateResearchResult(@Param("research") Research research);

    void deleteResearchResult(@Param("rrId") int rrId);

    void saveResearchResult(@Param("research") Research research);
}
