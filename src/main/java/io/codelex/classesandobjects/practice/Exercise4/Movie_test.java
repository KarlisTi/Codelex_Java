package io.codelex.classesandobjects.practice.Exercise4;

public class Movie_test {
    public static void main(String[] args) {
            List<Movie> mov = new ArrayList<>();
        Movie newMovie = new Movie(mov);
        Movie firstMovie = new Movie("Casino Royale", "Eon Productions", "PGSHY13");
        Movie secondMovie = new Movie("Glass", "Vista International", "PGSHY13");
        Movie thirdMovie = new Movie("Spider-man: Into the Spider-Verse", "Columbia Pictures", "PG");
        mov.add(firstMovie);
        mov.add(secondMovie);
        mov.add(thirdMovie);
        System.out.println(newMovie.getPG(mov));
    }
}

