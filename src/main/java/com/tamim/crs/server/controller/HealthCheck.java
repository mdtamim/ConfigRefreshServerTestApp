package com.tamim.crs.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping(value = "/")
    public String index(){
        return "Hello Buddy";
    }
}
