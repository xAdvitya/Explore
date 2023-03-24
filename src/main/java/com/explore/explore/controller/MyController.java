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
import org.springframework.web.bind.annotation.RequestMapping;

import com.explore.explore.model.Spot;
import com.explore.explore.repository.SpotRepository;
import com.explore.explore.repository.SpotService;

@RestController
@RequestMapping("/spot")
public class MyController {

    @Autowired
    public SpotRepository spotRepository;


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

}
