package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        age = 100;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 10;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        color = "";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "";
    }

    public Cat(String name) {
        this.name = name;
        color = "";
        age = 10;
        weight = 10;
    }

    public static void main(String[] args) {

    }
}
