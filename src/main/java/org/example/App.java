package org.example;

import org.example.workflow.Flow;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Flow flow = ctx.getBean(Flow.class);
        flow.run();
    }

}
