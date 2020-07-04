package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = in.readLine()).equals("exit")) {
            new ReadThread(fileName);
        }
    }

    public static class ReadThread extends Thread {
        Map<Integer, Integer> map = new HashMap<>();
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            start();
        }

        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);

                int max = 0;
                int tmp;
                while (inputStream.available() > 0) {
                    tmp = inputStream.read();

                    if (map.containsKey(tmp)) {
                        int count = map.get(tmp);
                        count++;
                        map.put(tmp, count);

                        if (count > max) max = count;
                    } else {
                        map.put(tmp, 1);
                    }
                }

                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    if (pair.getValue() == max) {
                        resultMap.put(fileName, pair.getKey());
                    }
                }

                inputStream.close();
            } catch (Exception e) {
            }
        }
    }
}
