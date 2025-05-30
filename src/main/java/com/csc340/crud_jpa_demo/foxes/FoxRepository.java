package com.csc340.crud_jpa_demo.foxes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends JpaRepository<Fox, Long> {

}
