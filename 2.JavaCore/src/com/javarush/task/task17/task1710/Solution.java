package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
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

        parse(flag, args);
    }

    public static void parse(String flag, String[] args) throws ParseException {
        switch (flag) {
            case Flags.CREATE:
                parseCreate(args[1], args[2], args[3]);
                break;
            case Flags.UPDATE:
                parseUpdate(args[1], args[2], args[3], args[4]);
                break;
            case Flags.DELETE:
                parseDelete(args[1]);
                break;
            case Flags.INFO:
                parseInfo(args[1]);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void parseCreate(String name, String sex, String date) throws ParseException {
        Person person;

        if (sex.equals("м")) {
            person = Person.createMale(name, inputDateFormat.parse(date));
        } else {
            person = Person.createFemale(name, inputDateFormat.parse(date));
        }

        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }

    public static void parseUpdate(String sId, String name, String sex, String date)
        throws ParseException {
        int id = Integer.parseInt(sId);

        Person person = allPeople.get(id);
        person.setName(name);
        person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
        person.setBirthDate(inputDateFormat.parse(date));
    }

    public static void parseDelete(String sId) {
        int id = Integer.parseInt(sId);

        Person deletable = allPeople.get(id);
        deletable.setBirthDate(null);
        deletable.setName(null);
        deletable.setSex(null);
    }

    public static void parseInfo(String sId) {
        int id = Integer.parseInt(sId);

        Person person = allPeople.get(id);
        String name = person.getName();
        String sex = person.getSex() == Sex.FEMALE
            ? "ж"
            : "м";
        String date = outputDateFormat.format(person.getBirthDate());

        System.out.println(String.format("%s %s %s", name, sex, date));
    }

    private interface Flags {
        String CREATE = "-c";
        String UPDATE = "-u";
        String DELETE = "-d";
        String INFO = "-i";
    }

}
/*
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
*/