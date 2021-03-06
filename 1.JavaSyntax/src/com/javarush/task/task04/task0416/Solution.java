package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int minutes = (int) Double.parseDouble(in.readLine());
        int minutesSpan = (minutes % 5);

        if (minutesSpan >= 0 && minutesSpan < 3) {
            System.out.println("зелёный");
        } else if (minutesSpan == 3) {
            System.out.println("жёлтый");
        } else if (minutesSpan >= 4) {
            System.out.println("красный");
        }
    }
}