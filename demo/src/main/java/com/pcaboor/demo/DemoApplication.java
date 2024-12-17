// Pour rappel, un bean est une classe au sein du contexte Spring (l’IoC container).

package com.pcaboor.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Déclencher tout le mécanisme de Spring
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // <--- Démarrer l'application
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World! Ceci est mon premier test");
	}

}
