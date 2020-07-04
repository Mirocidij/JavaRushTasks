package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> n = new ArrayList<>();
        try {
            while (true) {
                n.add(Integer.parseInt(in.readLine()));
            }
        } catch (IOException e) {

        } catch (NumberFormatException e) {
            n.forEach(System.out::println);
        }
    }
}
