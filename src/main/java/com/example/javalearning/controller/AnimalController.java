package com.example.javalearning.controller;

import com.example.javalearning.model.Animal;
import com.example.javalearning.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;
    @GetMapping
    public ResponseEntity<List<Animal>> getAnimals() {

        List<Animal> animals = animalRepository.findAll();
        System.out.println(animals.size() + "fkkvfnkvd");
        return new ResponseEntity<>(animalRepository.findAll(), HttpStatus.OK);

    }
}
