package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(in.readLine()));
        }

        int maxSeq = 0;
        int curSeq = 1;
        int prevVal = list.get(0);
        int curVal;

        for (int i = 1; i < list.size(); i++) {
            curVal = list.get(i);
            if (curVal == prevVal) {
                curSeq++;
            } else {
                curSeq = 1;
            }

            prevVal = curVal;
            if (curSeq > maxSeq) maxSeq = curSeq;
        }

        System.out.println(maxSeq);
    }
}