package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String outputFileName = in.readLine();
        BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName));

        while (true) {
            String tmp = in.readLine();
            out.write(tmp + '\n');

            if (tmp.equals("exit")) break;
        }

        in.close();
        out.close();
    }
}
