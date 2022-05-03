package com.freudromero.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // Expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello world! Time on server is " + LocalDateTime.now();
    }

    // Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
       return "Run a hard 5K!";
    }

    // Expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }


}
