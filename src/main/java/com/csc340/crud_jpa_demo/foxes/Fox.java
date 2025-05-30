package com.csc340.crud_jpa_demo.foxes;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "foxes")
public class Fox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    @Getter
    @Setter
    private String name;

    @Nonnull
    @Getter
    @Setter
    private String description;

    public Fox(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
