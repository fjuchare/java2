package ru.nesterenko;

/**
 * Anton Nesterenko
 */
public class Main {
    public static void main(String[] args) {

        Course c = new Course(100);
        Team team = new Team("Command", new Person[]{
                new Person("John", 100),
                new Person("Josh", 60),
                new Person("Jane", 30),
                new Person("Rassel", 50)
        });
        c.doIt(team);
        team.showResults();
    }
}