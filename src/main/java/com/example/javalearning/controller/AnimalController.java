package com.example.javalearning.controller;

import com.example.javalearning.dto.AnimalDTO;
import com.example.javalearning.model.Animal;
import com.example.javalearning.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;
    @GetMapping
    public ResponseEntity<List<Animal>> getAnimals() {

        List<Animal> animals = animalRepository.findAll();
        System.out.println(animals.size() + "fkkvfnkvd");
        return new ResponseEntity<>(animals, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Animal> createAnimals(@RequestBody AnimalDTO animalDto) {
     Animal animal = new Animal();
     animal.setName(animalDto.getName());
     animal.setScientificName(animalDto.getScientificName());
     animal.setId(UUID.randomUUID());
     animal.setCreated_at(OffsetDateTime.now());

     animalRepository.save(animal);

     return new ResponseEntity<>(animal, HttpStatus.CREATED);

    }
}
