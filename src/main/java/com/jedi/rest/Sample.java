package com.jedi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping(path = "/hello")
    public String test(){
        return "Hello Weather App";
    }
}
