package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах

Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int tmp;
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            tmp = Integer.parseInt(in.readLine());
            nums[i] = tmp;

            if (tmp > maximum) maximum = tmp;
            if (tmp < minimum) minimum = tmp;
        }

        System.out.print(maximum + " " + minimum);
    }
}
