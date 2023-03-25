package com.explore.explore.model;

public class Review {
    private int rating;
    private String description;
    private String userName;

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public String getUserName() {
        return userName;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int rating) {
        this.rating = rating;
    }

    public void setName(String description) {
        this.description = description;
    }

    public void setUserName(String name) {
        this.userName = name;
    }
}
