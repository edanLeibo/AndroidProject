package com.example.edan.familyalbum.Entities;

import java.util.List;

public class Album {
    private List<Image> images;
    private List<Comment> comments;
    private String name;
    private String date;
    private String location;

    public Album(String name, String date, List<Image> images, List<Comment> comments) {
        this.images = images;
        this.name = name;
        this.date = date;
        location = "London";
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Image> getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}
