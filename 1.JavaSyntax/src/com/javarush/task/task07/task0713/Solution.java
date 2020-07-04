package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> allNums = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            allNums.add(new Integer(in.readLine()));
        }

        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        for (Integer num : allNums) {
            if (num % 3 == 0 || num % 2 == 0) {
                if (num % 3 == 0) div3.add(num);
                if (num % 2 == 0) div2.add(num);

                continue;
            }

            others.add(num);
        }

        printList(div3);
        printList(div2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(System.out::println);
    }
}
