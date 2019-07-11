package pl.grapeup.mika.ratingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.grapeup.mika.ratingservice.model.Rating;
import pl.grapeup.mika.ratingservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository repository;

    @Override
    public Rating getRatingForRoom(Long roomId) {
        return repository.getByExternalId(roomId);
    }
}
