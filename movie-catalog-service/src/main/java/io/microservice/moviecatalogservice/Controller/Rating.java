package io.microservice.moviecatalogservice.Controller;

public class Rating {

    private String movie;
    private String rating;

    public Rating(String movie, String rating) {
        this.movie = movie;
        this.rating = rating;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
