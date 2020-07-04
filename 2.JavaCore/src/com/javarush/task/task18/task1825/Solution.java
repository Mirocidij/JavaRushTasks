package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        SortedMap<Integer, byte[]> map = new TreeMap<>();
        String line;
        String fileName = "";

        while (!(line = in.readLine()).equals("end")) {
            int lastIndexOf = line.lastIndexOf('.');
            fileName = line.substring(0, lastIndexOf);
            String partition = line.substring(lastIndexOf + 1);
            String sPartitionCounter = partition.replaceAll("[A-Za-z]", "");
            int partCount = Integer.parseInt(sPartitionCounter);

            FileInputStream inputStream = new FileInputStream(line);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();

            map.put(partCount, buffer);
        }

        FileOutputStream outputStream = new FileOutputStream(fileName);
        ArrayList<byte[]> buffers = new ArrayList<>(map.values());
        for (int i = 0; i < buffers.size(); i++) {
            outputStream.write(buffers.get(i));
        }

        in.close();
        outputStream.close();

    }
}
