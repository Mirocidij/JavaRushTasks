package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(in.readLine());
        }

        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
    }
}

