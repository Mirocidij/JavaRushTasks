package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        int year = Integer.parseInt(in.readLine()),
                month = Integer.parseInt(in.readLine()),
                day = Integer.parseInt(in.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.printf("Я родился %s.%s.%s", day, month, year);
    }
}
