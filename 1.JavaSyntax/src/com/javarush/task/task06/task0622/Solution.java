package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] nums = {
            Integer.parseInt(in.readLine()),
            Integer.parseInt(in.readLine()),
            Integer.parseInt(in.readLine()),
            Integer.parseInt(in.readLine()),
            Integer.parseInt(in.readLine())
        };

        int tmp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < (nums.length - 1) - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
