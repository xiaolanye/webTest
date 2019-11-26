package com.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.web.service.impl.TestServiceImpl;
import com.web.util.ChuangLanSmsUtil;
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
    private TestServiceImpl testService;

    @RequestMapping(value = "/doTest/{param}/{p}",method = RequestMethod.GET)
    public String doTest(Map<String,Object> map,Model model,HttpServletRequest request)
    {
        testService.doTest();
        map.put("name", "我我我");
        model.addAttribute("age", 22);
        request.setAttribute("sex", "a");
        return "test/doTest";
    }

    @RequestMapping(value = "/doTest/abc",method = RequestMethod.GET)
    public String doTest1(Map<String,Object> map,Model model,HttpServletRequest request)
    {
        testService.doTest();
        map.put("name", "我我我");
        model.addAttribute("age", 22);
        request.setAttribute("sex", "b");
        String result = ChuangLanSmsUtil.sendSmsByPost("http://2.32.40.34:8088/EpointSzSfj/rest/szsfj/getTjInfo", "{\"params\":{\"areaguid\":\"b3fd6ac3-0afe-413a-bcee-78062f85b544\",\"updatestart\":\"2019-10-29\",\"updateend\":\"2019-10-30\",\"batch\":\"1\"}}");
//        SzMtptDetailRes res = JSONOb
        return "test/doTest";
    }

    @RequestMapping(value = "postTest",method = RequestMethod.POST)
    @ResponseBody
    public String postTest(String name)
    {
        User user = new User();
        user.setHair(2.5D);
        user.setName(name);
        Double d = 2.5;
        TestServiceImpl testService1 = new TestServiceImpl();
        System.out.println(testService + "===" +testService1);
        return "response:" + name;
    }

}

