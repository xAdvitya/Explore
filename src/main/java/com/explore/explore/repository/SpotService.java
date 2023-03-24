package com.explore.explore.repository;
import java.util.List;

import com.explore.explore.model.Spot;

public interface SpotService {
    public List<Spot> getSpots();
    public Spot getSpot(long SpotId);
}
