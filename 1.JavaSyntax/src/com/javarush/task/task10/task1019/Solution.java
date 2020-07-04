package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String num = in.readLine();
            if (num.isEmpty()) break;

            int number = Integer.parseInt(num);
            String str = in.readLine();

            map.put(str, number);
        }

        map.forEach((k, v) -> {
            System.out.println(v + " " + k);
        });
    }
}
