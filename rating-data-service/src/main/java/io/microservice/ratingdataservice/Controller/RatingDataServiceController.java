package io.microservice.ratingdataservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingDataServiceController {

    @GetMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating("Gunda", "Cult Classic");
    }

}
