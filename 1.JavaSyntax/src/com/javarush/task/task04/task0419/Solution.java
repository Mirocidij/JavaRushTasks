package com.javarush.task.task04.task0419;
import static java.lang.Math.max;
/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        int d = Integer.parseInt(in.readLine());

        System.out.println(max(max(a, b), max(c, d)));
    }
}
