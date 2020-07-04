package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = in.readLine();
        FileInputStream fis = new FileInputStream(inputFileName);
        int maxByte = Integer.MIN_VALUE;

        while (fis.available() > 0) {
            int iByte = fis.read();
            if (iByte > maxByte) maxByte = iByte;
        }

        System.out.println(maxByte);

        in.close();
        fis.close();
    }
}
