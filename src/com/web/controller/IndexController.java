package com.web.controller;

import com.web.entity.Person;
import com.web.service.ILambdaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
        ILambdaService lambdaService = String::toUpperCase;
        ILambdaService lambdaService1 = str -> str.toUpperCase();
        List<Person> personList = new ArrayList<>();
        personList.stream().map(Person::getName).collect(toList());

        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());

        return "index";
    }
}
