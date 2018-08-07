package com.example.controller;

import com.example.domain.LearnResouce;
import com.example.service.LearnService;
import com.github.pagehelper.PageInfo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping("/learn")
public class LearnController {
    @Autowired
    private LearnService learnService;
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @RequestMapping("")
    public String learn() {
        return "learn-resource";
    }

    @RequestMapping(value = "/queryLeanList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void queryLearnList(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page"); // 取得当前页数,注意这是jqgrid自身的参数
        String rows = request.getParameter("rows"); // 取得每页显示行数，,注意这是jqgrid自身的参数
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", page);
        params.put("rows", rows);
        params.put("author", author);
        params.put("title", title);
        List<LearnResouce> learnList = learnService.queryLearnResouceList(params);
        PageInfo<LearnResouce> pageInfo = new PageInfo<LearnResouce>(learnList);
        // 提交测试
    }
}
