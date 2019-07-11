package pl.grapeup.mika.ratingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.grapeup.mika.ratingservice.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long>{
    Rating getByExternalId(Long externalId);
}
