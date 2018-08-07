package com.example.dao;

import com.example.domain.LearnResouce;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.*;

//Component注解不添加也没事，只是不加service那边引入LearnMapper会有错误提示，但不影响
@Component
@Mapper
public interface LearnMapper {
    int add(LearnResouce learnResouce);

    int update(LearnResouce learnResouce);

    int deleteById(String[] ids);

    LearnResouce queryLearnResouceList(Long id);

    public List<LearnResouce> queryLearnResouceList(Map<String, String> params);
}
