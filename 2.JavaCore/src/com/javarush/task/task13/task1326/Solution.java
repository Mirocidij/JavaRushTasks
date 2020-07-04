package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = in.readLine();
        BufferedReader fileIn = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
        ArrayList<Integer> integers = new ArrayList<>();

        while (fileIn.ready()) {
            String line = fileIn.readLine();
            int tmp = Integer.parseInt(line);
            if (tmp % 2 == 0) integers.add(tmp);
        }
        Collections.sort(integers);

        integers.forEach(System.out::println);

        in.close();
        fileIn.close();
    }
}
