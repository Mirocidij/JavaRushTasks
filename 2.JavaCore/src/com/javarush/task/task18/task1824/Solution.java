package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<FileInputStream> streams = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String fileName = in.readLine();
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                streams.add(fileInputStream);
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }

        for (FileInputStream stream : streams) {
            stream.close();
        }
    }
}
