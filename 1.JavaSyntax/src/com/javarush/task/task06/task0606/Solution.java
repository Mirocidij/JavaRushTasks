package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int tmp;

        while (num > 0) {
            tmp = num % 10;

            if (tmp % 2 == 0) even++;
            else odd++;

            num /= 10;
        }

        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
