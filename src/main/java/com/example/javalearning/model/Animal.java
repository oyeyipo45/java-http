package com.example.javalearning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;
import java.util.UUID;

@Table(name = "animal")
@Entity
public class Animal {
    @Id
    private UUID id;

    private OffsetDateTime created_at;

    private String name;

    private String scientific_name;

}
