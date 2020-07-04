package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = in.readLine();
            if (city.isEmpty()) {
                break;
            }

            String family = in.readLine();

            map.put(city, family);
        }

        // Read the house number
        String city = in.readLine();

        if (map.containsKey(city)) System.out.println(map.get(city));
    }
}
