package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;
    private String studio;
    private String rating;


    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

//    public static String[] getPG(String[] mov) {
//        Movie[] newMovie = new Movie[mov.length];
//        int newArrayIndex = 0;
//        for (int i = 0; i < mov.length; i++) {
//            if (mov[i].rating.equals("PG")) {
//              ;
//            }
//        }
//        return newMovie;
//    }

    public static void main(String[] args) {
        Movie firstMovie = new Movie("Casino Royale", "Eon Productions", "PGSHY13");
        Movie secondMovie = new Movie("Glass", "Vista International", "PGSHY13");
        Movie thirdMovie = new Movie("Spider-man: Into the Spider-Verse", "Columbia Pictures", "PG");

    }
}