package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private ArrayList<Human> children;
        private ArrayList<Human> parents;
        private HashMap<String, String> friendAddresses;

        public Human(String name, HashMap<String, String> friendAddresses) {
            this.name = name;
            this.friendAddresses = friendAddresses;
        }

        public Human(String name, boolean sex, ArrayList<Human> children, ArrayList<Human> parents) {
            this.name = name;
            this.sex = sex;
            this.children = children;
            this.parents = parents;
        }

        public Human(String name, ArrayList<Human> children) {
            this.name = name;
            this.children = children;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, ArrayList<Human> children, ArrayList<Human> parents, HashMap<String, String> friendAddresses) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
            this.parents = parents;
            this.friendAddresses = friendAddresses;
        }

        public Human(String name, int age, boolean sex, ArrayList<Human> children, ArrayList<Human> parents) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
            this.parents = parents;
        }

        public Human(String name, int age, boolean sex, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}
