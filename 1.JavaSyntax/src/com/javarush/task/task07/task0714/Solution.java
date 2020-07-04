package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            words.add(in.readLine());
        }
        words.remove(2);

        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
    }
}
