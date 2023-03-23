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
    // public List<Integer> getSpots() {
    // List<Integer> list;
    // list = new ArrayList<>();
    // list.add(3);
    // list.add(5);
    // return this.SpotService.getSpots();
    // }

    public List<Spot> getSpots() {
        
        List<Spot> list;
        list = new ArrayList<>();
        list.add(new Spot(1, "38 Block", "Near 38"));
        list.add(new Spot(0, "UNIMAll", "Near Me"));
        return list;
    }
}
