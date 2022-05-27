package com.example.pruebaNTTDATA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name ="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 40)
    private  String name;
    @Column(nullable = false, length = 40)
    private  String date;

    public Task() {
    }

    public Task(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
}
