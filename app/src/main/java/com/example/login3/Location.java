package com.example.login3;

public class Location {
    private int id;
    private String name;

    public Location() {
    }

    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;  // <-- fixed here
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;  // <-- and here
    }
}
