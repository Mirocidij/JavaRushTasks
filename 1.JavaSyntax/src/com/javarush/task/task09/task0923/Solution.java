package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonats = new ArrayList<>();

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (isVowel(aChar)) {
                vowels.add(aChar);
            } else {
                if (aChar == ' ') continue;

                consonats.add(aChar);
            }
        }

        vowels.forEach(character -> System.out.print(character + " "));
        System.out.println();
        consonats.forEach(character -> System.out.print(character + " "));
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}