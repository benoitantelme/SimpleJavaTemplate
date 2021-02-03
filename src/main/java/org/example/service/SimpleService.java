package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleService implements IService{
    public static final String NAME = "Simple Service";

    @Override
    public String getName() {
        return NAME;
    }

}
