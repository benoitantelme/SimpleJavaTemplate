package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleServiceTest {

    @Test
    void getName() {
        SimpleService service = new SimpleService();
        assertTrue(service.getName().equals(SimpleService.NAME));
    }
}