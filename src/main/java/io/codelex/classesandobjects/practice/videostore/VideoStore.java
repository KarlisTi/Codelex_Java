package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    ArrayList<Video> inventory = new ArrayList<>();

    public ArrayList<Video> getInventory() {
        return inventory;
    }


    public void addVideo(Video movie) {
        inventory.add(movie);
    }

    public void returnVideo(Video movie) {
        inventory.add(movie);

    }

    public void checkout(String name) {
        for (Video movie : inventory) {
            if (movie.getTitle().equals(name)) {
                movie.doCheckedOut();
                break;
            }
        }
    }


    public void receiveRaiting(String name, int raiting) {
        for (Video movie : inventory) {
            if (movie.getTitle().equals(name)) {
                movie.receiveRating(raiting);
            }
        }
    }

    public void printOutInventory() {
        for (Video movie : inventory) {
            System.out.println(movie);
            {

            }
        }
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "inventory=" + inventory +
                '}';
    }
}



