package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Map<Byte, Integer> map = new HashMap<>();
        String fileName = in.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0) {
            byte inByte = (byte)fileInputStream.read();

            if (map.containsKey(inByte)) {
                int count = map.get(inByte);
                map.put(inByte, ++count);
            } else {
                map.put(inByte, 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if (value < min) min = value;
        }
        for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
            if (pair.getValue() == min) {
                System.out.print(pair.getKey() + " ");
            }
        }

        in.close();
        fileInputStream.close();
    }
}
