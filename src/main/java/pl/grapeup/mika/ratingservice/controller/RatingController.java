package pl.grapeup.mika.ratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.grapeup.mika.ratingservice.model.Rating;
import pl.grapeup.mika.ratingservice.service.RatingService;

@RestController
@RequestMapping("api/v1/ratings")
public class RatingController {

    @Value("${service.instance.name}")
    private String instance;

    @Autowired
    private RatingService ratingService;

    @GetMapping
    public String getInstance() {
        return instance;
    }

    @GetMapping(value = "/{roomId}")
    public String getRating(@PathVariable Long roomId) {
        Rating rating = ratingService.getRatingForRoom(roomId);
        return "Room id: " + roomId + "\nRating: " + rating.getRating() + "\nOpinion: " + rating.getOpinion() + " | " + instance;
    }
}
