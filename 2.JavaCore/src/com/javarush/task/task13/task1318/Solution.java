package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = in.readLine();
        InputStreamReader inputStreamReader = new InputStreamReader(
            new FileInputStream(inputFileName));

        while (inputStreamReader.ready()) {
            System.out.print((char) inputStreamReader.read());
        }

        in.close();
        inputStreamReader.close();
    }
}