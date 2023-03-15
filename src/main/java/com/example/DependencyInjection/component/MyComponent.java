package com.example.DependencyInjection.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MyComponent {


    private final String myComponentName;


    @Autowired
    public MyComponent() {
        System.out.println("MyComponent è stato chiamato");
        myComponentName = "myComponent";


    }

    public String getMyComponentName() {
        System.out.println("getMyComponentName è stato chiamato");
        return myComponentName;
    }




}
