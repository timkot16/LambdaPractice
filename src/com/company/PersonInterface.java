package com.company;

public interface PersonInterface<T> {
    void sortByName(T o);

    void sortBySurname(T o);

    void findAllByName(T o, String name);

    void countNameLength(T o);

    void changeCollection(T o);

    void findMenForMilitary(T o);

    void countAverageAge(T o);

    void countPeopleWhoCanWork(T o);

    void addSomethingToManName(T o);
}
