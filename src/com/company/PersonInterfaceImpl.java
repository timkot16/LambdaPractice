package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;

public class PersonInterfaceImpl implements PersonInterface<List<Person>> {

    @Override
    public void sortByName(List<Person> o) {
        o.stream().map(Person::getName).sorted().forEach(System.out::println);
    }

    @Override
    public void sortBySurname(List<Person> o) {
        o.stream().map(Person::getSurname).sorted().forEach(System.out::println);
    }

    @Override
    public void findAllByName(List<Person> o, String name) {
        o.stream().filter(person -> person.getName().equalsIgnoreCase(name)).forEach(System.out::println);
    }

    @Override
    public void countNameLength(List<Person> o) {
        o.stream().map(person -> person.getName().length()).forEach(System.out::println);
    }

    @Override
    public void changeCollection(List<Person> o) {
        new HashSet<>(o).forEach(System.out::println);
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
        OptionalDouble average = o.stream()
                .filter(person -> person.getSex().equalsIgnoreCase("male"))
                .mapToInt(Person::getAge)
                .average();
        System.out.println("Средний возраст мужчин: " + average);
    }

    @Override
    public void countPeopleWhoCanWork(List<Person> o) {
        long female = o.stream()
                .filter(person -> person.getSex().equals("female"))
                .filter(person -> person.getAge() >= 18 && person.getAge() < 55)
                .count();
        long male = o.stream()
                .filter(person -> person.getSex().equals("male"))
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .count();
        System.out.println("Количество работоспособных граждан: " + (female + male));
    }

    @Override
    public void addSomethingToManName(List<Person> o) {
        o.stream()
                .filter(person -> person.getSex().equals("male"))
                .map(person -> person.getName().concat("ADD"))
                .forEach(System.out::println);
    }
}
