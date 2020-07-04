package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName = in.readLine();


        FileInputStream fileInputStream = new FileInputStream(fileName);
        SortedSet<Byte> set = new TreeSet<>();
        while (fileInputStream.available() > 0) {
            set.add((byte)fileInputStream.read());
        }

        for (byte aByte : set) {
            System.out.print(aByte + " ");
        }

        in.close();
        fileInputStream.close();
    }
}
