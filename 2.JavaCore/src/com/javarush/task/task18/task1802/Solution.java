package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = in.readLine();
        FileInputStream fis = new FileInputStream(inputFileName);
        int minByte = Integer.MAX_VALUE;

        while (fis.available() > 0) {
            int iByte = fis.read();
            if (iByte < minByte) minByte = iByte;
        }

        System.out.println(minByte);

        in.close();
        fis.close();
    }
}
