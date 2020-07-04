package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(in.readLine());
        }

        int maxSize = Integer.MIN_VALUE;

        for (String string : strings) {
            if (string.length() > maxSize) maxSize = string.length();
        }

        int finalMaxSize = maxSize;
        strings.forEach(s -> {
            if (s.length() == finalMaxSize) System.out.println(s);
        });
    }
}
