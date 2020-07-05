package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(in.readLine()))) {
            int count = 0;

            String[] tmp;
            while (fileIn.ready()) {
                tmp = fileIn.readLine().replaceAll("\\p{Punct}", " ").split(" ");
                for (String s : tmp) {
                    if (s.equals("world")) count++;
                }
            }

            System.out.println(count);

        } catch (IOException ignored) { }
    }
}
