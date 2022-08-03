package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Иван", "Быстрый", 19, "male"),
                new Person("Иван", "Иванов", 43, "male"),
                new Person("Игорь", "Ловкий", 20, "male"),
                new Person("Сергей", "Смелый", 65, "male"),
                new Person("Андрей", "Отважный", 36, "male"),
                new Person("Дмитрий", "Важный", 27, "male"),
                new Person("Валерий", "Неуклюжий", 42, "male"),
                new Person("Антон", "Старый", 78, "male"),
                new Person("Анатолий", "Молодой", 18, "male"),
                new Person("Евгений", "Школьник", 16, "male"),
                new Person("Елена", "Прекрасная", 21, "female"),
                new Person("Екатерина", "Вторая", 33, "female"),
                new Person("Ольга", "Афанасева", 48, "female"),
                new Person("Алла", "Белая", 29, "female"),
                new Person("Валерия", "Дождик", 63, "female"));

        PersonInterface<List<Person>> personInterface = new PersonInterfaceImpl();
//        personInterface.sortByName(people);
//        personInterface.sortBySurname(people);
//        personInterface.findAllByName(people, "иван");
//        personInterface.countNameLength(people);
//        personInterface.changeCollection(people);
//        personInterface.findMenForMilitary(people);
//        personInterface.countAverageAge(people);
//        personInterface.countPeopleWhoCanWork(people);
//        personInterface.addSomethingToManName(people);
    }
}
