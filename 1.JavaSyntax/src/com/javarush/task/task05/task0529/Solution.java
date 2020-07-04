package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String tmp;

        while (true) {
            tmp = in.readLine();

            if (tmp.equals("сумма")) {
                break;
            }

            sum += Integer.parseInt(tmp);
        }

        System.out.println(sum);
    }
}
