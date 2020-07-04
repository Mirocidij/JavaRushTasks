package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int tmp = 0;
        for (;;) {
            tmp = Integer.parseInt(in.readLine());
            sum += tmp;
            if (tmp == -1) break;
        }

        System.out.println(sum);
    }
}
