package com.codewithumair.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StoreController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to the Store Application!";
    }

    @GetMapping("/status")
    public String status() {
        return "Store Application is running successfully!";
    }
}
