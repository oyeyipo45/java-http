package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @GetMapping
    public ResponseEntity<List<String>> getAnimals() {
        return new ResponseEntity<>(List.of("Giraffe", "Lion"), HttpStatus.OK);

    }
}
