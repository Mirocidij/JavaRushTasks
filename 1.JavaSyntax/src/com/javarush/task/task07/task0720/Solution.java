package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int m = Integer.parseInt(in.readLine());

        ArrayList<String> strings = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            strings.add(in.readLine());
        }

        String tmp;
        for (int i = 0; i < m; i++) {
            tmp = strings.remove(0);
            strings.add(tmp);
        }

        strings.forEach(System.out::println);
    }
}
