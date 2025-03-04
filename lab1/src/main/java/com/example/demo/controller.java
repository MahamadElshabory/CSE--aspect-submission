package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from GET!";
    }

    @PostMapping("/hello")
    public String sayPost() {
        return "Hello from POST!";
    }

    @PutMapping("/hello")
    public String sayPut() {
        return "Hello from PUT!";
    }

    @DeleteMapping("/hello")
    public String sayDelete() {
        return "Hello from DELETEE!";
    }
}
