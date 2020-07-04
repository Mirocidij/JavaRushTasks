package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(in.readLine());
        FileWriter fileWriter = new FileWriter(in.readLine());

        int count = 1;
        while (fileReader.ready()) {
            int iByte = fileReader.read();
            if (count % 2 == 0) {
                fileWriter.write(iByte);
            }

            count++;
        }

        in.close();
        fileReader.close();
        fileWriter.close();
    }
}
