package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
Напишите метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
"Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //напишите тут ваш код
        System.out.println(a >= 50 && a < 100 ? "Число " + a + " содержится в интервале." : "Число " + a + " не содержится в интервале.");
    }
}