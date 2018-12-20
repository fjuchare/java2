package ru.nesterenko;

import java.util.Random;

public class Course {

    private static final int BARRIERS_COUNT = 5;
    private Barrier[] barriers = new Barrier[BARRIERS_COUNT];

    public Course(int range) {
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = new Barrier(new Random().nextInt(range));
        }
    }

    public void doIt(Team team) {
        for (Barrier barrier : barriers) {
            for (Person person : team.getPersons()) {
                if (person.getAbility() < barrier.getHeight()) {
                    person.setFinished(false);
                    continue;
            } else {
                    person.setFinished(true);

        }
                
            }
        }
    }

    private class Barrier {
        private int height;

        public Barrier(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }
}
