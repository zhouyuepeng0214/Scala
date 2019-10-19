package com.atguigu.bigdata.java.chapter01;

import java.util.HashMap;

public class Java_Exer {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("no1", 100);
        hm.put("no2", 200);
        hm.put("no3", 300);
        hm.put("no4", 400);
        System.out.println(hm);
        System.out.println(hm.get("no2"));

    }
}
