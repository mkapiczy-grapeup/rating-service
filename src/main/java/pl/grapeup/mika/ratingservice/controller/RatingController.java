package pl.grapeup.mika.ratingservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ratings")
public class RatingController {

    @Value("${service.instance.name}")
    private String instance;

    @GetMapping
    public String getInstance() {
        return instance;
    }

    @GetMapping(value = "/{id}")
    public String getRating(@PathVariable Long id) {
        return "5";
    }
}
