package com.example.pruebaNTTDATA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 40)
    private  String name;
    @Column(nullable = false, length = 40)
    private  String lastName;
    @Column(nullable = false, length = 20)
    private  int phoneNumber;
    @Column(nullable = false, length = 40)
    private  String address;
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Task task;

    public User() {
    }

    public User(int id, String name, String lastName, int phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
