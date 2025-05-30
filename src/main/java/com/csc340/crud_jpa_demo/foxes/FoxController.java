package com.csc340.crud_jpa_demo.foxes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoxController {

    @Autowired
    private FoxService foxService;

}
