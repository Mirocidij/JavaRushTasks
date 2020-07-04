package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>(6);

        list.add("мама");
        list.add("именно");
        list.add("мыла");
        list.add("именно");
        list.add("раму");
        list.add("именно");

        list.forEach(System.out::println);
    }
}
