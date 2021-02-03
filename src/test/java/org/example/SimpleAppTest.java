package org.example;


import org.example.service.IService;
import org.example.service.SimpleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class SimpleAppTest
{
    @Autowired
    IService service;

    @Test
    public void getSimpleServiceNameTest() {
        assertEquals(SimpleService.NAME, service.getName());
    }

}
