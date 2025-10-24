package com.example.lab7_20221747.repository;

import com.example.lab7_20221747.entity.Trabajadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrabajadoresRepository extends JpaRepository<Trabajadores, Integer> {
    public List<Trabajadores> findByCargo(String cargo);
}
