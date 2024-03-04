package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {



    @GetMapping("/")
    public String greetings() {
        return "Welcome to the coffee order system!";
    }
}
