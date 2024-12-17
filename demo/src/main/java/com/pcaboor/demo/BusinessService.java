package com.pcaboor.demo;

import org.springframework.stereotype.Component;

// Pour qu’une classe soit déclarée en tant que bean, on l’annote @Component.

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
