package com.javarush.task.task06.task0605;


/* 
Контролируем массу тела

"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double mib = weight / (height * height);

            if (mib < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (mib >= 18.5 && mib < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            } else if (mib >= 25 && mib < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            } else System.out.println("Ожирение: 30 или больше");
        }
    }
}
