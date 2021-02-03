package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleService implements IService{

    @Override
    public String getName() {
        return "Simple Service";
    }

}
