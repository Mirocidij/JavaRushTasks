package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(in.readLine()));
             BufferedWriter fileOut = new BufferedWriter(new FileWriter(in.readLine()))) {

            String tmp;
            while (fileIn.ready()) {
                tmp = fileIn.readLine().replaceAll("\\p{Punct}", "");
                fileOut.write(tmp);
            }

        } catch (IOException ignored) { }
    }
}
