package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("asdf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[2];
            System.out.println(arr[2]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList<String> strings = new ArrayList<>();
            strings.get(10);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = new Double(12D);
            Float fl = (Float) o;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Map<String, String> map = new HashMap<>();
            map.put("1", "");
            map.forEach((k, v) -> map.remove(k));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = null;
            o.getClass();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayStoreException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalAccessException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
