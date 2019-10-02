package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    private int id;
    private String name;
    private String release;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

}

