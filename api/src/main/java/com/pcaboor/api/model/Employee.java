package com.pcaboor.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Remplace getter and setter
@Entity // Table de base de donnée
@Table(name = "employees") // Nom de la table de donnée
public class Employee {

    @Id // Identifier
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoIncrement
    private Long id;

    @Column(name = "first_name") // Column pour faire le lien avec la db
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail;

    private String password;

}