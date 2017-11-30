package com.web.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.put("test", "ABC"));
        System.out.println(map.put("test", "ABCD"));
    }
}
