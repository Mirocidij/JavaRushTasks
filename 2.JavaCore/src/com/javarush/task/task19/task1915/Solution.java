package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fileOut = new FileOutputStream(in.readLine())) {

            PrintStream printStream = System.out;

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream1 = new PrintStream(byteArrayOutputStream);
            System.setOut(printStream1);

            testString.printSomething();

            String result = byteArrayOutputStream.toString();

            System.setOut(printStream);

            System.out.println(result);
            fileOut.write(byteArrayOutputStream.toByteArray());

        } catch (IOException ignored) { }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

