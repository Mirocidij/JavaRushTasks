package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(in.readLine());
        }

        int[] littleN_1 = new int[10];
        int[] littleN_2 = new int[10];

        for (int i = 0; i < 10; i++) {
            littleN_1[i] = n[i];
            littleN_2[i] = n[i + 10];
        }

        for (int i : littleN_2) {
            System.out.println(i);
        }
    }
}
