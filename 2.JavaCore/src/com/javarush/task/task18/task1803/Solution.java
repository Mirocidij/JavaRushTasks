package com.javarush.task.task18.task1803;

/* 
Самые частые байты
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

        int maxSize = Integer.MIN_VALUE;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            byte input = (byte) fileInputStream.read();

            if (map.containsKey(input)) {
                int count = map.get(input);
                count++;
                if (count > maxSize) maxSize = count;
                map.put(input, count);
            } else {
                map.put(input, 1);
            }
        }

        for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxSize) {
                System.out.print(pair.getKey() + " ");
            }
        }

        in.close();
        fileInputStream.close();
    }
}
