package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(in.readLine());
        FileOutputStream outputStream = new FileOutputStream(in.readLine());

        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        for (int i = buffer.length - 1; i >= 0; i--) {
            outputStream.write(buffer[i]);
        }

        in.close();
        inputStream.close();
        outputStream.close();
    }
}
