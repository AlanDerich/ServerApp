package com.example.thunderbolt_108.serverapp.Model;

public class Category {
    private String Name;
    private String Image;

    public Category() {

    }

    public Category(String name,String image) {
        Name=name;
        Image=image;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public String getImage() {
        return Image;
    }
}
