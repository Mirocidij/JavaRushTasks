package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Human implements CanRun, CanSwim {
    }

    public interface CanRun {
        void Run();
    }

    public interface CanSwim {
        void Swim();
    }
}