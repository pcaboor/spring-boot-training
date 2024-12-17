package com.pcaboor.demo;

public class HelloWorld {

    // String le type
    // Value le nom
    // Hello World la valeur

    private String value = "Test World";

    // Getter pour accéder à la valeur
    public String getValue() {
        return value;
    }

    // Setter pour modifier la valeur
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
