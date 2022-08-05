package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class PersonInterfaceImpl implements PersonInterface<List<Person>> {

    @Override
    public void findByName(List<Person> o, String name) {
        o.stream().filter(person -> person.getName().equals(name))
                .forEach(System.out::println);
    }

    @Override
    public void findBySurname(List<Person> o, String surname) {
        o.stream().filter(person -> person.getSurname().equals(surname))
                .forEach(System.out::println);
    }

    @Override
    public void countAllByName(List<Person> o, String name) {
        System.out.println(o.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .count());
    }

    @Override
    public void countNameLength(List<Person> o) {
        o.forEach(person -> System.out.println(person.getName() + "-" + person.getName().length()));
    }

    @Override
    public void changeCollection(List<Person> o) {
        o.stream().collect(Collectors.toList());
    }

    @Override
    public void findMenForMilitary(List<Person> o) {
        o.stream()
                .filter(person -> person.getSex().equalsIgnoreCase("male"))
                .filter(person -> person.getAge() >= 18 && person.getAge() < 27)
                .forEach(System.out::println);
    }

    @Override
    public void countAverageAge(List<Person> o) {
        double average = o.stream()
                .filter(person -> person.getSex().equalsIgnoreCase("male"))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println("Средний возраст всех мужчин: " + Math.round(average));
    }

    @Override
    public void countPeopleWhoCanWork(List<Person> o) {
        long count = o.stream()
                .filter(
                        person -> person.getSex().equals("female") && person.getAge() >= 18 && person.getAge() < 55 ||
                                person.getSex().equals("male") && person.getAge() >= 18 && person.getAge() < 60)
                .count();
        System.out.println("Количество работоспособных граждан: " + count);
    }

    @Override
    public void addSomethingToManName(List<Person> o) {
        o.stream()
                .filter(person -> person.getSex().equals("male"))
                .forEach(person -> person.setName(person.getName().concat("ADD")));
        System.out.println(o);
    }
}
