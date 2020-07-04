package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int count = Integer.parseInt(reader.readLine());
        int tmp;

        if (count <= 0) return;

        for (int i = 0; i < count; i++) {
            tmp = Integer.parseInt(reader.readLine());

            if (tmp > maximum) maximum = tmp;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
