package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        // 5, 2, 4, 7, 0
        ArrayList<int[]> list = new ArrayList<>(5);

        int[] arr1 = new int[5];
        Arrays.fill(arr1, 10);
        int[] arr2 = new int[2];
        Arrays.fill(arr2, 10);
        int[] arr3 = new int[4];
        Arrays.fill(arr3, 10);
        int[] arr4 = new int[7];
        Arrays.fill(arr4, 10);
        int[] arr5 = new int[0];
        Arrays.fill(arr5, 10);

        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
