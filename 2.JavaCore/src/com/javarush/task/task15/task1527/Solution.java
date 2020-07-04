package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String url = in.readLine();
        String param = url.substring(url.indexOf("?") + 1);
        String[] params = param.split("&");
        ArrayList<ParamPair> paramPairs = new ArrayList<>();

        for (int i = 0; i < params.length; i++) {
            String[] paramPair = params[i].split("=");
            if (paramPair.length == 2) {
                paramPairs.add(new ParamPair(paramPair[0], paramPair[1]));
            } else {
                paramPairs.add(new ParamPair(paramPair[0], ""));
            }
        }

        paramPairs.forEach(paramPair -> {
            System.out.print(paramPair.command + " ");
        });
        System.out.println();
        paramPairs.forEach(p -> {
            if (p.command.equals("obj")) {
                if (!p.arg.equals("")) {
                    try {
                        alert(Double.parseDouble(p.arg));
                    } catch (NumberFormatException e) {
                        alert(p.arg);
                    }
                }
            }
        });
    }

    public static class ParamPair {
        String command;
        String arg;

        public ParamPair(String command, String arg) {
            this.command = command;
            this.arg = arg;
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
