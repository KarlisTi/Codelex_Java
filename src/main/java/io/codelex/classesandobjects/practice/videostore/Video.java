package io.codelex.classesandobjects.practice.videostore;

public class Video extends VideoStore {

    private String title;

    private boolean checkOut = false;
    private int averageRating = 0;

    public Video(String title, boolean checkOut, int averageRating) {
        this.title = title;
        this.checkOut = checkOut;
        this.averageRating = averageRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public int getRating() {
        return averageRating;
    }

    public void setRating(int rating) {
        this.averageRating = rating;
    }


    public void doCheckedOut() {
        if (checkOut) {
            System.out.println("Video " + getTitle() + " has checked out");
        }
    }

    public void receiveRating(int raiting) {
        int coutAppraiser = 0;
        if (raiting > 0) {
            coutAppraiser++;
            averageRating += raiting / coutAppraiser;
        }
    }


}
