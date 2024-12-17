// Pour rappel, un bean est une classe au sein du contexte Spring (l’IoC container).

package com.pcaboor.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Déclencher tout le mécanisme de Spring
public class DemoApplication implements CommandLineRunner {

	// Pour qu’un bean soit injecté dans un attribut, on annote l’attribut
	// @Autowired.
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // <--- Démarrer l'application
	}

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}

}
