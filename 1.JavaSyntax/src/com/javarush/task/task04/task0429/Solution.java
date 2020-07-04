package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < 3; i++) {
            int tmp = Integer.parseInt(in.readLine());

            if (tmp > 0) positiveCounter++;
            if (tmp < 0) negativeCounter++;
        }

        System.out.println("количество отрицательных чисел: " + negativeCounter);
        System.out.println("количество положительных чисел: " + positiveCounter);
    }
}
