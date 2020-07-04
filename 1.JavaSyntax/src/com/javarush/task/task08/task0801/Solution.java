package com.javarush.task.task08.task0801;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(Arrays.asList(
            "арбуз",
            "банан",
            "вишня",
            "груша",
            "дыня",
            "ежевика",
            "женьшень",
            "земляника",
            "ирис",
            "картофель"
        ));

        stringSet.forEach(System.out::println);
    }
}
