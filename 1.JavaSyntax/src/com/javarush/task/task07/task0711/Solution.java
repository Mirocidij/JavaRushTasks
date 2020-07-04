package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
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

        String tmp;
        for (int i = 0; i < 13; i++) {
            String str = strings.remove(4);
            strings.add(0, str);
        }

        strings.forEach(System.out::println);
    }
}
