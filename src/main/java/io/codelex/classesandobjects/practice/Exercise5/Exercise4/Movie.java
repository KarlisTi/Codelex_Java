package io.codelex.classesandobjects.practice.Exercise5.Exercise4;

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

    public Movie[] getPG(Movie[] mov) {
        Movie[] newMovie = new Movie[mov.length];
        int newArrayIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                ;
            }
        }
        return newMovie;
    }

}