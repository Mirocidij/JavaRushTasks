package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(in.readLine());
        }

        int minLength = Integer.MAX_VALUE, minIndex = 0;
        int maxLength = Integer.MIN_VALUE, maxIndex = 0;
        String tmp;

        for (int i = 0; i < strings.size(); i++) {
            tmp = strings.get(i);
            if (tmp.length() < minLength) {
                minLength = tmp.length();
                minIndex = i;
            }

            if (tmp.length() > maxLength) {
                maxLength = tmp.length();
                maxIndex = i;
            }
        }

        System.out.println(minIndex < maxIndex ? strings.get(minIndex) : strings.get(maxIndex));
    }
}
