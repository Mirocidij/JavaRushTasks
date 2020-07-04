package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(in.readLine());
        FileInputStream inputStream1 = new FileInputStream(in.readLine());
        FileInputStream inputStream2 = new FileInputStream(in.readLine());

        byte[] buffer = new byte[1000];
        while (inputStream1.available() > 0) {
            int count = inputStream1.read(buffer, 0, buffer.length);
            outputStream.write(buffer, 0, count);
        }
        while (inputStream2.available() > 0) {
            int count = inputStream2.read(buffer, 0, buffer.length);
            outputStream.write(buffer, 0, count);
        }

        in.close();
        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
