package com.web.test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class LambdaTest {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        String wordsStr = words.stream().collect(joining(","));
        System.out.println(wordsStr);
    }
}
