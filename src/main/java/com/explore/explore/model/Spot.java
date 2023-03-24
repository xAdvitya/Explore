package com.explore.explore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

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

    public Spot(long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    // getters and setters here

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String location) {
        this.location = location;
    }
}
