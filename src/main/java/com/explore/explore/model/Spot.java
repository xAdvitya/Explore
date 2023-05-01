package com.explore.explore.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("spots")
public class Spot {

    @Id
    private String id;

    private String name;

    private String location;

    private String image;

    private String description;

    private List<String> category = new ArrayList<String>();

    private List<Review> review = new ArrayList<Review>();

    public Spot(String id, String name, String location, String image, List<Review> review, List<String> category,
            String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.image = image;
        this.review = review;
        this.category = category;
        this.description = description;
    }

    // getters and setters here

    public Spot() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getImage() {
        return image;
    }

    public List<Review> getReview() {
        return review;
    }

    public List<String> getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
