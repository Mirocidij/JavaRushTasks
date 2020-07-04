package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("" + i, "Name" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        if (map.containsValue(name)) {
            int counter = 0;
            for (String value : map.values()) {
                if (value.equals(name)) counter++;
            }
            return counter;
        } else {
            return 0;
        }
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        if (map.containsKey(lastName)) {
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {

    }
}
