package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream1 = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream1);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();
        String[] operands = result.split(" ");

        System.setOut(printStream);

        int a = Integer.parseInt(operands[0]);
        int b = Integer.parseInt(operands[2]);
        char operations = operands[1].toCharArray()[0];

        System.out.print(operands[0] + " " + operands[1] + " " + operands[2] + " = ");

        if (operations == '+') {
            System.out.print(a + b);
        } else if (operations == '-') {
            System.out.print(a - b);
        } else if (operations == '*') {
            System.out.print(a * b);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

