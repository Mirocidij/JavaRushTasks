package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream;
        FileInputStream inputStream;
        String firstFileName = in.readLine();
        String secondFileName = in.readLine();

        inputStream = new FileInputStream(firstFileName);
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        inputStream.close();

        inputStream = new FileInputStream(secondFileName);
        byte[] buffer2 = new byte[inputStream.available()];
        inputStream.read(buffer2);
        inputStream.close();

        outputStream = new FileOutputStream(firstFileName);
        outputStream.write(buffer2);
        outputStream.write(buffer);

        in.close();
        outputStream.close();
    }
}
