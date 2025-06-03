package com.csc340.crud_jpa_demo.foxes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoxController {

    @Autowired
    private FoxService service;

    @GetMapping("/api/foxes")
    public List<Fox> getAllFoxes() {
        return this.service.getAllFoxes();
    }

    @GetMapping("/api/foxes/{id}")
    public Optional<Fox> getFoxById(@PathVariable Long id) {
        return this.service.getFoxById(id);
    }

    @GetMapping("/api/foxes/name")
    public List<Fox> getFoxesByName(@RequestParam Optional<String> key) {
        return key
                .map((query) -> this.service.getFoxesByName(query))
                .orElseGet(() -> this.service.getAllFoxes());
    }

    @GetMapping("/api/foxes/colour")
    public List<Fox> getFoxesByColour(@RequestParam Optional<String> key) {
        return key
                .map((query) -> this.service.getFoxesByColour(query))
                .orElseGet(() -> this.service.getAllFoxes());
    }

    @GetMapping("/api/foxes/species")
    public List<Fox> getFoxesBySpecies(@RequestParam Optional<String> key) {
        return key
                .map((query) -> this.service.getFoxesBySpecies(query))
                .orElseGet(() -> this.service.getAllFoxes());
    }

    @GetMapping("/api/foxes/description")
    public List<Fox> getFoxesByDescription(@RequestParam Optional<String> key) {
        return key
                .map((query) -> this.service.getFoxesByDescription(query))
                .orElseGet(() -> this.service.getAllFoxes());
    }

    @PostMapping("/api/foxes")
    public Fox addFox(@RequestBody Fox fox) {
        return this.service.addFox(fox);
    }

    @PutMapping("/api/foxes/{id}")
    public Fox updateFox(@PathVariable Long id, @RequestBody Fox fox) {
        return this.service.updateFox(id, fox);
    }

    @DeleteMapping("/api/foxes/{id}")
    public void deleteFox(@PathVariable Long id) {
        this.service.deleteFox(id);
    }

}
