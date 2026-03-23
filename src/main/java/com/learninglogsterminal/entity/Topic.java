package com.learninglogsterminal.entity;

import java.time.LocalDateTime;

public class Topic {

    // ============================================================
    // TODO 1: Declare the fields
    // ============================================================
    private int id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    // ============================================================
    // TODO 2: Create the constructor
    // ============================================================
    public Topic(int id, String name) {
        this.id = id;
        this.name = name;
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.updatedAt = now;
    }


    // ============================================================
    // TODO 3: Create getters and setters
    // ============================================================

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setName(String name) {
        this.name = name;
        this.updatedAt = LocalDateTime.now();
    }


    // ============================================================
    // TODO 4: Override toString()
    // ============================================================
    @Override
    public String toString() {
        return "[" + id + "] " + name + " (Created: " + createdAt + ")";
    }
}