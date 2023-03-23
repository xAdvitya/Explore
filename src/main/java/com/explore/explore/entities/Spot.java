package com.explore.explore.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Spot {
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private String location;

    public Spot(long id, String name, String location) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Spot() {
        super();
    }

    // getters and setters here
}
