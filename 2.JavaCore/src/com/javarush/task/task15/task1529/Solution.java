package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (Exception e) {

        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String param = in.readLine();

        if (param.equals("helicopter")) result = new Helicopter();
        else if (param.equals("plane")) {
            int passengers = Integer.parseInt(in.readLine());
            result = new Plane(passengers);
        }

        in.close();
    }
}
