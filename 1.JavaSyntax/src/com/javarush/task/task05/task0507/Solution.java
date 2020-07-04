package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double counter = 0;
        int sum = 0;
        int tmp;

        while (true) {
            tmp = Integer.parseInt(in.readLine());
            if (tmp == -1) break;

            counter++;
            sum += tmp;
        }

        System.out.println(sum / counter);
    }
}

