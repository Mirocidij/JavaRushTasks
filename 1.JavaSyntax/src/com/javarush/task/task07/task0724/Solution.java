package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("", true, 60);
        Human grandpa2 = new Human("", true, 60);
        Human grandma1 = new Human("", false, 60);
        Human grandma2 = new Human("", false, 60);
        Human father = new Human("", true, 40, grandpa1, grandma1);
        Human mother = new Human("", false, 40, grandpa2, grandma2);
        Human children1 = new Human("", true, 20, father, mother);
        Human children2 = new Human("", true, 20, father, mother);
        Human children3 = new Human("", true, 20, father, mother);

        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
    }

//        Требования:
//        1. Программа не должна считывать данные с клавиатуры.
//        2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//        3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
//        4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//        5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//        6. Выведи созданные объекты на экран.

    public static class Human {
        String name;
        boolean sex;
        Human father;
        Human mother;
        int age;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}