package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j<= i + 1; j++) {
                System.out.print(8);
            }

            System.out.println();
        }
    }
}