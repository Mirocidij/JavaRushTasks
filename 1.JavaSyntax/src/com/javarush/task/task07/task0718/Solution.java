package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(in.readLine());
        }
        int prevLength = 0;
        String tmp;
        for (int i = 0; i < strings.size(); i++) {
            tmp = strings.get(i);
            if (tmp.length() >= prevLength) prevLength = tmp.length();
            else {
                System.out.println(i);
                return;
            }
        }
    }
}

