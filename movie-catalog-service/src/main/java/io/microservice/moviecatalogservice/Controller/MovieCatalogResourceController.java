package io.microservice.moviecatalogservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.nio.file.WatchEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResourceController {

    @Autowired
    private RestTemplate restTemplate;

/*
    @Autowired
    private WebClient.Builder webClientBuilder;
*/

    @GetMapping("/{userId}")
    public List<CatalogItems> getCatalogs(@PathVariable("userId") String userId) {

        WebClient.Builder builder = WebClient.builder();

        //get movies with ratings
        List<Rating> ratings = Arrays.asList(
                new Rating("123", "4"),
                new Rating("1235", "4")
        );

        //call movie info service
        return ratings.stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + rating.getMovie(), Movie.class);
            return new CatalogItems(movie.getMovieId(), "desc", rating.getRating());
        }).collect(Collectors.toList());


/*        return Collections.singletonList(
                new CatalogItems("The Shining", "A movie based on the novel by stephen king", "5")
        );*/
    }



}
