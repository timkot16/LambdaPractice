package com.company;

public interface PersonInterface<T> {
    void findByName(T o, String name);

    void findBySurname(T o, String surname);

    void countAllByName(T o, String name);

    void countNameLength(T o);

    void changeCollection(T o);

    void findMenForMilitary(T o);

    void countAverageAge(T o);

    void countPeopleWhoCanWork(T o);

    void addSomethingToManName(T o);
}
