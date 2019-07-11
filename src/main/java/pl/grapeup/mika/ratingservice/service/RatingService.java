package pl.grapeup.mika.ratingservice.service;

import pl.grapeup.mika.ratingservice.model.Rating;

public interface RatingService {
    Rating getRatingForRoom(Long roomId);
}
