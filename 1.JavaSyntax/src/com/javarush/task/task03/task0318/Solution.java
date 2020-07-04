package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int ages = Integer.parseInt(in.readLine());
        String name = in.readLine();
        System.out.println(name + " захватит мир через " + ages + " лет. Му-ха-ха!");
    }
}
