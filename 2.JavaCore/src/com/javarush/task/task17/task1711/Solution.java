package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    private static final DateFormat inputDateFormat = new SimpleDateFormat(
        "dd/MM/yyyy", Locale.ENGLISH);
    private static final DateFormat outputDateFormat = new SimpleDateFormat(
        "dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args.length == 0) return;
        String flag = args[0];
        if (flag.isEmpty()) return;

        switch (args[0]) {
            case Flags.CREATE:
                synchronized (allPeople) {
                    parseCreate(args);
                }
                break;
            case Flags.UPDATE:
                synchronized (allPeople) {
                    parseUpdate(args);
                }
                break;
            case Flags.DELETE:
                synchronized (allPeople) {
                    parseDelete(args);
                }
                break;
            case Flags.INFO:
                synchronized (allPeople) {
                    parseInfo(args);
                }
                break;
        }
    }

    public static void parseCreate(String[] args) throws ParseException {
        if ((args.length - 1) % 3 != 0) return;

        Person person;
        for (int i = 0; i < args.length - 1; i += 3) {
            String name = args[i + 1];
            String sex = args[i + 2];
            Date date = inputDateFormat.parse(args[i + 3]);

            if (sex.equals("м")) {
                person = Person.createMale(name, date);
            } else {
                person = Person.createFemale(name, date);
            }

            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }
    }

    public static void parseUpdate(String[] args) throws ParseException {

        for (int i = 1; i < args.length; i += 4) {
            int id = Integer.parseInt(args[i]);
            Person person = allPeople.get(id);
            person.setName(args[i + 1]);
            person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
            person.setBirthDate(inputDateFormat.parse(args[i + 3]));
        }
    }

    public static void parseDelete(String[] args) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt(args[i]);
            Person deletable = allPeople.get(id);
            deletable.setBirthDate(null);
            deletable.setName(null);
            deletable.setSex(null);
        }
    }

    public static void parseInfo(String[] args) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt(args[i]);
            Person person = allPeople.get(id);
            String name = person.getName();
            String sex = person.getSex() == Sex.FEMALE ? "ж" : "м";
            String date = outputDateFormat.format(person.getBirthDate());
            System.out.println(String.format("%s %s %s", name, sex, date));
        }
    }

    private interface Flags {
        String CREATE = "-c";
        String UPDATE = "-u";
        String DELETE = "-d";
        String INFO = "-i";
    }

}