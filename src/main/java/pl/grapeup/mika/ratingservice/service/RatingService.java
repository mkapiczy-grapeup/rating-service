package pl.grapeup.mika.ratingservice.service;

import pl.grapeup.mika.ratingservice.model.Rating;

import java.util.List;

public interface RatingService {
    List<Rating> getAllRatings();
    Rating getRatingForRoom(Long roomId);
}
