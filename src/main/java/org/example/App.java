package org.example;

import org.example.service.IService;
import org.example.service.SimpleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple App
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        IService service = ctx.getBean(SimpleService.class);
        System.out.println("This is a " + service.getName());
    }

}
