package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(in.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(in.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(in.readLine());

        int half = (int)Math.round(inputStream1.available() / 2.0);
        byte[] buffer = new byte[half];
        inputStream1.read(buffer, 0, half);
        outputStream2.write(buffer);
        int count = inputStream1.read(buffer);
        outputStream3.write(buffer, 0, count);


/*
file.txt
file2.txt
file3.txt
*/

        in.close();
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
