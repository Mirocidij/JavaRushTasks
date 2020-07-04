package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileIn = new BufferedReader(new FileReader(in.readLine()));
             BufferedWriter fileOut = new BufferedWriter(new FileWriter(in.readLine()))) {

            String[] strings = fileIn.readLine().split(" ");
            for (String string : strings) {
                try {
                    int i = Integer.parseInt(string);
                    fileOut.write(i + " ");
                } catch (NumberFormatException ignored) { }
            }

        } catch (IOException e) {

        }
    }
}
