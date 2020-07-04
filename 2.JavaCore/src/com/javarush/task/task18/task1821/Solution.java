package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        SortedMap<Character, Integer> map = new TreeMap<>();

        char tmp;

        while (inputStream.available() > 0) {
            tmp = (char) inputStream.read();

            if (map.containsKey(tmp)) {
                int count = map.get(tmp);
                map.put(tmp, ++count);
            } else {
                map.put(tmp, 1);
            }
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        inputStream.close();
    }
}
