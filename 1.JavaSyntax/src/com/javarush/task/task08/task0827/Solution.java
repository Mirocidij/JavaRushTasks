package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date d1 = new Date(date);
        Date start = new Date(d1.getYear(), Calendar.JANUARY, 0);
        long daysAfterYearStart = TimeUnit.DAYS.convert(d1.getTime() - start.getTime(), TimeUnit.MILLISECONDS);

        return daysAfterYearStart % 2 != 0;
    }
}
