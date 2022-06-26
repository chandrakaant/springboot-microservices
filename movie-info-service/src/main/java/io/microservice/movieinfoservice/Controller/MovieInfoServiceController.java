package io.microservice.movieinfoservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoServiceController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") int movieId) {
        return new Movie("123", "Gunda");
    }
}
