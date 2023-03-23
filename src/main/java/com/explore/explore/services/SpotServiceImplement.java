package com.explore.explore.services;

import com.explore.explore.entities.Spot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SpotServiceImplement implements SpotService {

    List<Spot> list;
    public SpotServiceImplement() {
        
        list = new ArrayList<>();
        list.add(new Spot(1, "38 Block", "Near 38"));
        list.add(new Spot(0, "UNIMAll", "Near Me"));
    }

    @Override
    public List<Spot> getSpots() {
        return list;
    }

}
