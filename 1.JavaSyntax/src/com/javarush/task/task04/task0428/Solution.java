package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;

        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(in.readLine()) > 0) counter++;
        }

        System.out.println(counter);
    }
}
