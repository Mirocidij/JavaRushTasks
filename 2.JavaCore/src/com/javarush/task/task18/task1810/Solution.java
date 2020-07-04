package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<FileInputStream> streams = new ArrayList<>();
        FileInputStream fileInputStream;
        while (true) {
            fileInputStream = new FileInputStream(in.readLine());
            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                for (FileInputStream stream : streams) {
                    stream.close();
                }
                throw new DownloadException();
            }
            streams.add(fileInputStream);
        }
    }

    public static class DownloadException extends Exception {

    }
}
