package com.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.entity.User;
import com.web.service.ITestService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test")
public class WebTestController
{
    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/doTest/{param}/{p}",method = RequestMethod.GET)
    public String doTest(Map<String,Object> map,Model model,HttpServletRequest request)
    {
        testService.doTest();
        map.put("name", "你是傻逼");
        model.addAttribute("age", 22);
        request.setAttribute("sex", "男");
        return "test/doTest";
    }

    @RequestMapping(value = "/doTest/abc",method = RequestMethod.GET)
    public String doTest1(Map<String,Object> map,Model model,HttpServletRequest request)
    {
        testService.doTest();
        map.put("name", "你是傻逼");
        model.addAttribute("age", 22);
        request.setAttribute("sex", "男");
        return "test/doTest";
    }

    @RequestMapping(value = "postTest",method = RequestMethod.POST)
    @ResponseBody
    public Double postTest(String name)
    {
        User user = new User();
        user.setHair(2.5D);
        user.setName(name);
        Double d = 2.5;
        return d;
    }

}

