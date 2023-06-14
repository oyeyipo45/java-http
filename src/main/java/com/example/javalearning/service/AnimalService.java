package com.example.javalearning.service;

import com.example.javalearning.dto.AnimalDTO;
import com.example.javalearning.model.Animal;
import com.example.javalearning.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public List<Animal> getAnimals(){
        return animalRepository.findAll();
    }

    public Animal createAnimals(AnimalDTO animalDto) {
        Animal animal = new Animal();
        animal.setName(animalDto.getName());
        animal.setScientificName(animalDto.getScientificName());
        animal.setId(UUID.randomUUID());
        animal.setCreated_at(OffsetDateTime.now());

        animalRepository.save(animal);
        return animal;

    }
}
