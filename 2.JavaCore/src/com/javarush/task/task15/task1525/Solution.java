package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            while (in.ready()) {
                lines.add(in.readLine());
            }
        } catch (Exception e) {

        }
    }
}
