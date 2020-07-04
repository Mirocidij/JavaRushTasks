package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    //    1. Считать с консоли данные, пока не введено слово "exit".
    //    2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
    //    2.1. содержит точку '.', то вызвать метод print для Double;
    //    2.2. больше нуля, но меньше 128, то вызвать метод print для short;
    //    2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
    //    2.4. иначе, вызвать метод print для String.


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while (!((str = in.readLine()).equals("exit"))) {
            try {
                if (str.contains(".")) {
                    print(new Double(str));
                } else {
                    int a = Integer.parseInt(str);

                    if (a > 0 && a < 128) {
                        print((short) a);
                    } else {
                        print(a);
                    }
                }
            } catch (Exception e) {
                print(str);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
