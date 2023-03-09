package co.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class DefaultController {
    @GetMapping
    public String hello(){
        return "Hello";
    }


}
