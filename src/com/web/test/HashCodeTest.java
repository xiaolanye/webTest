package com.web.test;

import java.util.ArrayList;
import java.util.List;
 
public class HashCodeTest
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 300000; i++)
        {
        	HashCodeTest p = new HashCodeTest();
            if (!list.contains(p.hashCode()))
                list.add(p.hashCode());
        }
        System.out.println(list.size());
    }
}