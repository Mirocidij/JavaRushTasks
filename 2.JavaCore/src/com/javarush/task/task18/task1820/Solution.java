package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fIn = new BufferedReader(new FileReader(in.readLine()));
        BufferedWriter out = new BufferedWriter(new FileWriter(in.readLine()));


        String line = fIn.readLine();
        String[] sDoubles = line.split(" ");

        for (int i = 0; i < sDoubles.length; i++) {
            double dbl = Double.parseDouble(sDoubles[i]);
            out.write((int) Math.round(dbl) + " ");
        }

        in.close();
        fIn.close();
        out.close();
    }
}
