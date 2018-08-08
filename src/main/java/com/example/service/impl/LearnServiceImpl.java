package com.example.service.impl;

import com.example.dao.LearnMapper;
import com.example.domain.LearnResouce;
import com.example.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class LearnServiceImpl implements LearnService {
    @Autowired
    LearnMapper learnMapper;

    @Override
    public int add(LearnResouce learnResouce) {
        return 0;
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return 0;
    }

    @Override
    public int deleteByIds(String[] ids) {
        return 0;
    }

    @Override
    public LearnResouce queryLearnResouceById(Long learnResouce) {
        return null;
    }

    @Override
    public List<LearnResouce> queryLearnResouceList(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<Map<String, String>> queryDemoList(Map<String, String> param) {
        return this.learnMapper.queryDemoList(param);
//        return new ArrayList<Map<String, String>>();
    }
}
