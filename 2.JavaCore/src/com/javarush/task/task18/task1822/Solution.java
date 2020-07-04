package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileIn = new BufferedReader(new FileReader(in.readLine()));

        String anotherLine;
        while ((anotherLine = fileIn.readLine()) != null) {
            String[] fields = anotherLine.split(" ");
            if (fields[0].equals(args[0])) {
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);
                }
            }
        }

        in.close();
        fileIn.close();
    }
}
