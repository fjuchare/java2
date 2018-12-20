package ru.nesterenko;

import java.text.MessageFormat;

public class Team {
    private String title;
    private Person[] persons = new Person[4];

    public Team(String title, Person[] persons) {
        this.title = title;
        this.persons = persons;
    }

    public void showResults() {
        for (Person person : persons) {
            if (person.isFinished()) {
                System.out.println(MessageFormat.format("Участник {0} прошел", person.getName()));
            } else {
                System.out.println(MessageFormat.format("Участник {0} не прошел", person.getName()));
            }
        }
    }

    public Person[] getPersons() {
        return persons;
    }
}