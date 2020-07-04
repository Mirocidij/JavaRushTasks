package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {
                Integer.parseInt(in.readLine()),
                Integer.parseInt(in.readLine()),
                Integer.parseInt(in.readLine())
        };

        if (nums[0] == nums[1]) {
            System.out.println(3);
        } else if (nums[0] == nums[2]) {
            System.out.println(2);
        } else if (nums[1] == nums[2]) System.out.println(1);
    }
}
