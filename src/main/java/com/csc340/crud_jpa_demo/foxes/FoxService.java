package com.csc340.crud_jpa_demo.foxes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

    @Autowired
    private FoxRepository foxRepository;

}
