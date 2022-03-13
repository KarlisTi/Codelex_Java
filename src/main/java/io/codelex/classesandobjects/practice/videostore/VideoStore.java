package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore extends Video {

    private ArrayList inventory;

    public VideoStore(String name, ArrayList inventory) {
        super(name);
        this.inventory = inventory;
    }

    public void addANewVideo(String title) {
        this.inventory.add(title);
    }

    public void checkOutVideo(String title) {
        this.inventory.remove(title);
    }

    public void returnVideo(String title) {
        this.inventory.add(title);
    }

    public void rateAVideo(String name, int rating) {
        Video.receiveRating(rating);

    }

    public void showListOfVideos() {
        this.inventory.iterator();


    }
}

