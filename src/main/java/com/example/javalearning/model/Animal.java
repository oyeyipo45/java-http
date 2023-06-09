package com.example.javalearning.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Table(name = "animal")
@Entity
@Data
public class Animal {
    @Id
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("created_at")
    private OffsetDateTime created_at;
    @JsonProperty("name")
    private String name;
    @JsonProperty("scientificName")
    private String scientificName;

}
