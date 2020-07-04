package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        if (a == b && a == c) {
            System.out.println(a + " " + a + " " + a);
        } else if (a == b) {
            System.out.println(a + " " + a);
        } else if (a == c) {
            System.out.println(a + " " + a);
        } else if (b == c) {
            System.out.println(b + " " + b);
        }
    }
}