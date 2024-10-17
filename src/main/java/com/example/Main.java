package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] array = {"q", "w", "e", "q", "e", "e", "q", "w"};
        System.out.println(createMap(array));
    }

    public static Map<String, Integer> createMap (String[] array) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : array) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }
}