package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        double spaceCount = 0;
        int lettersCount = inputStream.available();
        char letter;

        while (inputStream.available() > 0) {
            letter = (char) inputStream.read();
            if (letter == ' ') spaceCount++;
        }

        System.out.println(String.format("%.2f", spaceCount / lettersCount * 100));

        inputStream.close();
    }
}
