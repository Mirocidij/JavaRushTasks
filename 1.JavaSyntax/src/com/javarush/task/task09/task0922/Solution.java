package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = inputDateFormat.parse(in.readLine());
        System.out.println(outputDateFormat.format(date).toUpperCase());
    }
}
