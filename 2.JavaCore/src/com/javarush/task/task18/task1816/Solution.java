package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        char letter;
        int count = 0;
        while (inputStream.available() > 0) {
            letter = (char) inputStream.read();
            if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
                count++;
            }
        }

        System.out.println(count);

        inputStream.close();
    }
}
