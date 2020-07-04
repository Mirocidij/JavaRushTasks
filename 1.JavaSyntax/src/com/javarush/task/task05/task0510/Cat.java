package com.javarush.task.task05.task0510;

/* 
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.color = "";
        this.age = 10;
        this.weight = 10;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = "";
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.color = "";
        this.age = age;
        this.weight = 10;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 10;
        this.address = address;
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
