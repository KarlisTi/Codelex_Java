package io.codelex.trainingExercises.generics;

public class Bottle<T extends Liquid> {
    private final T contents;

    public Bottle(T contents) {
        this.contents = contents;
    }

    public void printOutContents() {
        System.out.println(contents.getName() + " has been pured out!");
    }

}
