package com.example.DependencyInjection.service;

import com.example.DependencyInjection.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MyService {



    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("MyService è stato chiamato");
        this.myComponent = myComponent;

    }

    public String getName(){
        System.out.println("getName in MyService è stato chiamato");
        return myComponent.getMyComponentName();
    }


}
