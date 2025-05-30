package com.csc340.crud_jpa_demo.foxes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class FoxService {

    @Autowired
    private FoxRepository repository;

    public List<Fox> getAllFoxes() {
        return this.repository.findAll();
    }

    public Optional<Fox> getFoxById(@PathVariable Long id) {
        return this.repository.findById(id);
    }

    public List<Fox> getFoxesByName(String name) {
        return this.repository.getFoxesByName(name);
    }

    public List<Fox> getFoxesByColour(String colour) {
        return this.repository.getFoxesByColour(colour);
    }

    public List<Fox> getFoxesBySpecies(String species) {
        return this.repository.getFoxesBySpecies(species);
    }

    public List<Fox> getFoxesByDescription(String description) {
        return this.repository.getFoxesByDescription(description);
    }

}
