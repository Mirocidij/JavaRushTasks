package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {
                Integer.parseInt(in.readLine()),
                Integer.parseInt(in.readLine()),
                Integer.parseInt(in.readLine())
        };

        Arrays.sort(nums);

        System.out.println(nums[1]);
    }
}
