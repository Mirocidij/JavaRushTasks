package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);

            if (str.contains("р") && str.contains("л")) continue;
            if (str.contains("р")) {
                strings.remove(str);
                i--;
                continue;
            }
            if (str.contains("л")) {
                strings.add(i, str);
                i++;
                continue;
            }
        }
        return strings;
    }
}