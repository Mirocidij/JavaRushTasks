package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(in.readLine());

        StringBuilder str = new StringBuilder();
        int iByte;
        do {
            iByte = fileReader.read();
            if (iByte != -1) {
                str.append((char) iByte);
            }
        } while (iByte != -1);

        int count = 0;
        char[] chars = str.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'w') {
                if ((i + 4) < chars.length) {
                    if (chars[i + 1] == 'o' &&
                        chars[i + 2] == 'r' &&
                        chars[i + 3] == 'l' &&
                        chars[i + 4] == 'd') {
                        count++;
                        i += 4;
                    }
                }
            }
        }

        System.out.println(count);

        in.close();
        fileReader.close();
    }
}
