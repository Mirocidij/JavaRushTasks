package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.toString(i));
        }
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
