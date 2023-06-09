package com.explore.explore.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.explore.explore.model.Spot;

@Repository
public interface SpotRepository extends MongoRepository<Spot, String> {
    List<Spot> findByCategory(String category);
}
