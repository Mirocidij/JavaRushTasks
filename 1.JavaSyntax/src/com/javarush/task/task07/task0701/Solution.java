package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }

        return arr;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > max) max = i;
        }

        return max;
    }
}
