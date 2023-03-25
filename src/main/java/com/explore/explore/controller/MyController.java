package com.explore.explore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RestController
// @RequestMapping("/spot")
public class MyController {

    @Autowired
    public SpotRepository spotRepository;
    @Autowired
    public UserRepository userRepository;

    // get

    @GetMapping("/")
    public ResponseEntity<?> getSpots() {
        return ResponseEntity.ok(this.spotRepository.findAll());

    }

    // post spots
    @PostMapping("/")
    public ResponseEntity<?> addSpots(@RequestBody Spot spot) {
        Spot save = this.spotRepository.save(spot);
        return ResponseEntity.ok(save);
    }

    // get
    @GetMapping("/auth/{userName}")
    public ResponseEntity<?> getUser(@PathVariable String userName) {
        // return ResponseEntity.ok(this.userRepository.findOne({"userName":"admin"}));
        User user = this.userRepository.findByUserName(userName);
        if (user == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(user);
        }

    }

    // post user
    @PostMapping("/auth")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        User save = this.userRepository.save(user);
        return ResponseEntity.ok(save);
    }


    //post reviews
    // @PostMapping("/{userName}/{spotId}")
    // public ResponseEntity<?> addReview(@RequestBody Review review){
    //     Review re = this.spotRepository.
    // }

}
