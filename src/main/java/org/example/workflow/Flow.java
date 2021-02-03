package org.example.workflow;

import org.example.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Flow {
    @Autowired
    private IService service;

    public void run(){
        System.out.println("This is a " + service.getName());
    }
}
