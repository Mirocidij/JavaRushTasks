package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();

        int age = Integer.parseInt(in.readLine());
        if (age > 20) System.out.println("И 18-ти достаточно");

    }
}
