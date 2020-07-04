package com.javarush.task.task04.task0414;

/* 
Количество дней в году
Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());

        int dayInTheYear = 0;

        if (num % 400 == 0) {
            dayInTheYear = 366;
        } else if (num % 100 == 0) {
            dayInTheYear = 365;
        } else if (num % 4 == 0) {
            dayInTheYear = 366;
        } else {
            dayInTheYear = 365;
        }

        System.out.printf("количество дней в году: %d", dayInTheYear);
    }
}