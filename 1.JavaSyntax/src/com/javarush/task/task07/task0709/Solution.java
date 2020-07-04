package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(in.readLine());
        }

        int minSize = Integer.MAX_VALUE;

        for (String string : strings) {
            if (string.length() < minSize) minSize = string.length();
        }

        int finalMinSize = minSize;
        strings.forEach(s -> {
            if (s.length() == finalMinSize) System.out.println(s);
        });
    }
}
