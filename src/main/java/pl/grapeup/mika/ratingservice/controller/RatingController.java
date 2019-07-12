package pl.grapeup.mika.ratingservice.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
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
    @ResponseBody
    public String getAll() {
        return  new Gson().toJson(ratingService.getAllRatings()) + " | " + instance;
    }

    @GetMapping(value = "/{roomId}")
    public String getRating(@PathVariable Long roomId) {
        Rating rating = ratingService.getRatingForRoom(roomId);
        return rating != null ?
                "Room id: " + roomId + "\nRating: " + rating.getRating() + "\nOpinion: " + rating.getOpinion() + " | " + instance :
                "No rating for room " + roomId + " | " + instance;
    }
}
