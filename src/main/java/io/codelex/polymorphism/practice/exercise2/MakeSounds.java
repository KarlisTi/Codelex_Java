package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> newSound = new ArrayList<>();
        Parrot newParrot = new Parrot();
        Radio newRadio = new Radio();
        Firework newFirework = new Firework();

        newSound.add(newParrot);
        newSound.add(newRadio);
        newSound.add(newFirework);

        for (Sound noise : newSound) {
            noise.playSound();
        }
        ;

    }
}
