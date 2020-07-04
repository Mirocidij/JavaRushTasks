package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int balance = 0;
        if (this.age > anotherCat.age)
            balance++;
        else if (this.age < anotherCat.age)
            balance--;

        if (this.weight > anotherCat.weight)
            balance++;
        else if (this.weight < anotherCat.weight)
            balance--;

        if (this.strength > anotherCat.strength)
            balance++;
        else if (this.strength < anotherCat.strength)
            balance--;

        if (balance > 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    }
}
