package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(in.readLine()));
             BufferedWriter fileOut = new BufferedWriter(new FileWriter(in.readLine()))) {

            String tmp;
            while (fileIn.ready()) {
                tmp = fileIn.readLine().replaceAll("\\.", "!");
                fileOut.write(tmp);
            }

        } catch (IOException ignored) { }
    }
}
