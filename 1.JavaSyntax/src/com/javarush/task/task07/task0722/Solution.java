package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        String tmp;

        for (;;) {
            tmp = in.readLine();
            if (tmp.equals("end")) break;

            strings.add(tmp);
        }

        strings.forEach(System.out::println);
    }
}