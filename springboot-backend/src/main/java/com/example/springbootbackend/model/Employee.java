package com.example.springbootbackend.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity // @Entity annotation specifies that the class is an entity
@Table(name="employees")
public class Employee {

  @Id  //@id annotation specifies the primary key of the entity
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name="first_name",nullable = false)
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="email")
  private String email;

}
