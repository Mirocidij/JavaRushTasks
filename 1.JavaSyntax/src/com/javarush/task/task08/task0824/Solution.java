package com.javarush.task.task08.task0824;

/* 
Собираем семейство
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();

        Human father = new Human();
        father.children.addAll(Arrays.asList(child1, child2, child3));
        Human mother = new Human();
        mother.children.addAll(Arrays.asList(child1, child2, child3));

        Human ded1 = new Human();
        ded1.children.addAll(Arrays.asList(father));
        Human bab1 = new Human();
        bab1.children.addAll(Arrays.asList(father));
        Human ded2 = new Human();
        ded2.children.addAll(Arrays.asList(mother));
        Human bab2 = new Human();
        bab2.children.addAll(Arrays.asList(mother));

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(ded2);
        System.out.println(bab2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
