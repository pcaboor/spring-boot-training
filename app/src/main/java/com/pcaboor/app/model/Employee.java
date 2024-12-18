package com.pcaboor.app.model;

import lombok.Data;

@Data // <-- Gerer auto les getter et setter
public class Employee {

    private Integer id;

    private String firstName;

    private String lastName;

    private String mail;

    private String password;
}
