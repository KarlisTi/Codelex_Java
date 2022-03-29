package io.codelex.classesandobjects.practice.Exercise4;

public class Movie {
    private String title;
    private String studio;
    private List<Movie> mov;


    public Movie(List<Movie> mov) {
        this.mov = mov;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public List<Movie> getMov() {
        return mov;
    }

    public void setMov(List<Movie> mov) {
        this.mov = mov;
    }

    public String getTitle() {
        return title;
    }

    public List<Movie> getPG(List<Movie> mov) {
        List<Movie> newMovie = new ArrayList<>();
        for (Movie eachMovie : mov) {
            if (eachMovie.rating.equals("PG")) {
                newMovie.add(eachMovie);
            }
        }
        return newMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equals(movie.title) && studio.equals(movie.studio) && rating.equals(movie.rating) && mov.equals(movie.mov);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, studio, rating, mov);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                ", mov=" + mov +
                '}';
    }

}
