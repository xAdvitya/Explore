package com.explore.explore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.explore.explore.model.Spot;
import com.explore.explore.model.User;
import com.explore.explore.model.Review;
import com.explore.explore.repository.SpotRepository;
import com.explore.explore.repository.UserRepository;
import com.explore.explore.utility.PasswordRequest;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MyController {

    @Autowired
    public SpotRepository spotRepository;
    @Autowired
    public UserRepository userRepository;

    // get
    @GetMapping("/spots")
    public ResponseEntity<?> getSpots() {
        return ResponseEntity.ok(this.spotRepository.findAll());

    }

    // get a particular spot
    @GetMapping("/spot/{spotId}")
    public ResponseEntity<?> getSpot(@PathVariable Long spotId) {
        Optional<Spot> optionalSpot = this.spotRepository.findById(spotId);
        Spot spot = optionalSpot.orElse(new Spot());
        return ResponseEntity.ok(spot);
    }

    // post spots
    @PostMapping("/spots")
    public ResponseEntity<?> addSpots(@RequestBody Spot spot) {
        Spot save = this.spotRepository.save(spot);
        return ResponseEntity.ok(save);
    }

    // get user , authenticate
    @PostMapping("/auth/{userName}")
    public ResponseEntity<?> getUser(@PathVariable String userName, @RequestBody PasswordRequest passwordRequest) {

        User user = this.userRepository.findByUserName(userName);
        if (user == null) {
            return ResponseEntity.notFound().build();
        } else {

            if (user.getPassword().equals(passwordRequest.getPassword())) {
                return ResponseEntity.ok(user);
            }
            return ResponseEntity.notFound().build();
        }

    }

    // post user
    // signup
    @PostMapping("/auth")
    public ResponseEntity<?> addUser(@RequestBody User userRequest) {

        String userName = userRequest.getUserName();

        User user = this.userRepository.findByUserName(userName);

        if (user != null) {
            return ResponseEntity.notFound().build();
        }
        User newUser = new User(UUID.randomUUID().toString(), userName, userRequest.getPassword());

        User save = this.userRepository.save(newUser);
        return ResponseEntity.ok(save);
    }

    // post reviews
    @PostMapping("/review/{spotId}/{userName}")
    public ResponseEntity<?> addReview(@PathVariable Long spotId, @PathVariable String userName,
            @RequestBody Review reviewReq) {

        String reviewText = reviewReq.getreviewText();
        Double rating = reviewReq.getRating();

        Optional<Spot> optionalSpot = this.spotRepository.findById(spotId);
        Spot spot = optionalSpot.orElse(new Spot());

        Review review = new Review(userName, reviewText, rating);

        spot.getReview().add(review);
        this.spotRepository.save(spot);

        return ResponseEntity.ok(review);
    }

    // get by category

    @GetMapping("/spots/category/{category}")
    public ResponseEntity<?> getSpotsByCate(@PathVariable String category) {
        List<Spot> spots = this.spotRepository.findByCategory(category);
        return ResponseEntity.ok(spots);
    }

}
