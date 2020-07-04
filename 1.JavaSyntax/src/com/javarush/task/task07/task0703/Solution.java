package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        int[] counters = new int[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = in.readLine();
            counters[i] = strings[i].length();
        }

        for (int counter : counters) {
            System.out.println(counter);
        }
    }
}
