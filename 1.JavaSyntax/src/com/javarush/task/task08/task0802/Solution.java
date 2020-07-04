package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("арбуз", "ягода");
        stringMap.put("банан", "трава");
        stringMap.put("вишня", "ягода");
        stringMap.put("груша", "фрукт");
        stringMap.put("дыня", "овощ");
        stringMap.put("ежевика", "куст");
        stringMap.put("жень-шень", "корень");
        stringMap.put("земляника", "ягода");
        stringMap.put("ирис", "цветок");
        stringMap.put("картофель", "клубень");

        stringMap.forEach((key, val) -> {
            System.out.println(key + " - " + val);
        });
    }
}
