package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean checkOut = true;
    private int averageRating = 0;

    public Video(String title, boolean checkOut, int averageRating) {
        this.title = title;
        this.checkOut = checkOut;
        this.averageRating = averageRating;
    }

    public void checkedOut() {
        if (checkOut) {
            System.out.println(this.title + "Video has checked out");
        }
    }

    public void addRating(int rating) {
        averageRating += rating;
    }


}
