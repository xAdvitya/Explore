// package com.explore.explore.repository;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.explore.explore.model.Spot;

// @Service
// public class SpotServiceImplement implements SpotService {

//     List<Spot> list;

//     public SpotServiceImplement() {

//         list = new ArrayList<>();
//         list.add(new Spot(1, "38 Block", "Near 38"));
//         list.add(new Spot(0, "UNIMAll", "Near Me"));
//     }

//     @Override
//     public List<Spot> getSpots() {
//         return list;
//     }

//     @Override
//     public Spot getSpot(long spotId) {
//         Spot s = null;

//         for (Spot spot : list) {
//             if (spot.getId() == spotId) {
//                 s = spot;
//                 break;
//             }
//         }
//         return s;

//     }

// }
