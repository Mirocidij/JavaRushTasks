package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(in.readLine());

        int comaCount = 0;
        while (inputStream.available() > 0) {
            char inChar = (char) inputStream.read();
            if (inChar == ',') comaCount++;
        }

        System.out.println(comaCount);

        in.close();
        inputStream.close();
    }
}
