package com.explore.explore.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.explore.explore.model.Review;

// import com.fasterxml.jackson.annotation.JsonAutoDetect;
// import com.fasterxml.jackson.annotation.JsonProperty;
// import com.fasterxml.jackson.annotation.JsonInclude;

// @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

@Document("spots")
public class Spot {
    // @JsonProperty("id")
    @Id
    private long id;
    // @JsonProperty("name")
    private String name;
    // @JsonProperty("location")
    private String location;

    private List<String> category = new ArrayList<String>();

    // private Review review;
    private List<Review> review = new ArrayList<Review>();

    public Spot(long id, String name, String location, List<Review> review, List<String> category) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.review = review;
        this.category = category;
    }

    // getters and setters here

    public Spot() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Review> getReview() {
        return review;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
