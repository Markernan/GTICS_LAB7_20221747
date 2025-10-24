package com.example.lab7_20221747.entity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trabajadores")
@Getter
@Setter
public class Trabajadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String nombre;
    @Column
    private String cargo;
}
