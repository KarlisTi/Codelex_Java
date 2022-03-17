package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;

    private boolean checkOut = false;
    private int rating = 0;

    public Video(String title, boolean checkOut, int averageRating) {
        this.title = title;
        this.checkOut = checkOut;
        this.rating = averageRating;
    }

    public Video(String title, boolean checkOut) {
        this.title = title;
        this.checkOut = checkOut;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public void doCheckedOut() {
        if (!checkOut) {
            checkOut = true;
            System.out.println("Video " + getTitle() + " has checked out");
        } else {
            System.out.println("Movie already taken");
        }
    }

    public void receiveRating(int raiting) {
        this.rating = raiting;

    }
}



