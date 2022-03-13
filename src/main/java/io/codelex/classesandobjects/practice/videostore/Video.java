package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;
    private Boolean checkout;
    private int averageUserRating;

    public Video(String name) {
        title = name;
    }

    public String getName() {
        return title;
    }

    public int getRating() {
        return averageUserRating;
    }

    public boolean getCheckout() {
        return checkout;
    }

    public void receiveRating(int rating) {
        averageUserRating = rating;
    }

    public void doCheckout() {
        System.out.println("Video " + '"' + getName() + '"' + " checked out successfully.");
    }

    public void doReturn() {
        if (checkout) {
            System.out.println("Video " + '"' + getName() + '"' + " returned successfully.");
        }
    }

}
