package org.example.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Simple Web App";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, we Educate";
    }
}
