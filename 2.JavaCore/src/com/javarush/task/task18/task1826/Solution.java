package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);


        byte[] data = new byte[inputStream.available()];
        inputStream.read(data);

        switch (args[0]) {
            case "-e":
                Encode(data);
                break;
            case "-d":
                Decode(data);
                break;
        }

        outputStream.write(data);


        inputStream.close();
        outputStream.close();
    }

    public static void Encode(byte[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] += 128;
        }
    }

    public static void Decode(byte[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] -= 128;
        }
    }

}
