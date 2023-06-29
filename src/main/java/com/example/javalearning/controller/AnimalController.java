package com.example.javalearning.controller;

import com.example.javalearning.dto.AnimalDTO;
import com.example.javalearning.model.Animal;
import com.example.javalearning.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
@RequiredArgsConstructor
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> getAnimals() {

        List<Animal> animals = animalService.getAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Animal> createAnimals(@RequestBody AnimalDTO animalDto) {

        return new ResponseEntity<>(animalService.createAnimals(animalDto), HttpStatus.CREATED);
    }
}
