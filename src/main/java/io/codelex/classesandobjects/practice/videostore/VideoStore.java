package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    ArrayList<String> inventory = new ArrayList<String>();

    public void addVideo(String name) {
        inventory.add(name);
    }

    public void doCheckout(String name) {
        inventory.remove(name);
    }

    public void receiveRaiting(String name, int raiting) {
        if (inventory.contains(name)) {

        }

    }

}





