package com.explore.explore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.explore.explore.entities.Spot;
import com.explore.explore.services.SpotService;

@RestController
public class MyController {

    @Autowired
    public SpotService SpotService;

    @GetMapping("/hello")
    public String home() {
        return "hello";
    }

    // get spots
    @GetMapping("/spots")
    public List<Spot> getSpots() {
        return this.SpotService.getSpots();
    }

}
