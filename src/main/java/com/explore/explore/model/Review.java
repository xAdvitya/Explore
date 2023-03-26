package com.explore.explore.model;

public class Review {
    private Double rating;
    private String reviewText;
    private String userName;

    public Review(String userName, String reviewText,Double rating) {
        this.userName=userName;
        this.rating = rating;
        this.reviewText = reviewText;
    }

    public Double getRating() {
        return rating;
    }

    public String getUserName() {
        return userName;
    }

    public String getreviewText() {
        return reviewText;
    }

    public void setId(Double rating) {
        this.rating = rating;
    }

    public void setName(String reviewText) {
        this.reviewText = reviewText;
    }

    public void setUserName(String name) {
        this.userName = name;
    }
}
