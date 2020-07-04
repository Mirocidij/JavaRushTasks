package com.javarush.task.task04.task0425;

/* 
Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
*/

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Point p = new Point(
                Integer.parseInt(in.readLine()),
                Integer.parseInt(in.readLine())
        );

        if (p.x > 0 && p.y > 0) System.out.println(1);
        else if (p.x < 0 && p.y > 0) System.out.println(2);
        else if (p.x < 0 && p.y < 0) System.out.println(3);
        else if (p.x > 0 && p.y < 0) System.out.println(4);
    }
}
