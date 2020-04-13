package com.example.GuestsJava.model;


import java.util.UUID;

public class Guest {
    private final UUID id;
    private final String name;

    public Guest(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
