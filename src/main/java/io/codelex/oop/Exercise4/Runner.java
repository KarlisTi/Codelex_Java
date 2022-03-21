package io.codelex.oop.Exercise4;

public enum Runner {

    BEGINNER(25, 35),
    INTERMEDIATE(15, 25),
    ADVANCED(10, 15);

    int minimumTime;
    int maximumTime;


    Runner(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    static void getFitnessLevel(int time) {
        if (time >= BEGINNER.minimumTime) {
            System.out.println("Runner is " + BEGINNER);
        } else if (time >= INTERMEDIATE.minimumTime && time <= INTERMEDIATE.maximumTime) {
            System.out.println("Runner is " + INTERMEDIATE);
        } else {
            System.out.println("Runner is " + ADVANCED);
        }

    }

}
