package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Сталлоне" + i, dateFormat.parse("MAY " + i + " 2012"));
        }
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        ArrayList<String> keysToRemove = new ArrayList<>(map.size());

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8) {
                keysToRemove.add(pair.getKey());
            }
        }

        for (String s : keysToRemove) {
            map.remove(s);
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
