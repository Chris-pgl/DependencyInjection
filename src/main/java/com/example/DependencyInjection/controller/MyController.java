package com.example.DependencyInjection.controller;

import com.example.DependencyInjection.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {


    private final MyService service;

    @Autowired
    public MyController(MyService service) {
        System.out.println("MyController è stato chiamato");
        this.service = service;
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("getNamefromMyService in Controller è stato chiamato");
        return service.getName();

    }

    @GetMapping("/")
    public String welcomeMessage(){
        System.out.println("welcomeMessage è stato chiamato");
        return "Benvetuno!";

    }






}
