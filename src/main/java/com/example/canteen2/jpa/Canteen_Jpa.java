package com.example.canteen2.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.canteen2.model.Register;

public interface Canteen_Jpa extends JpaRepository<Register, Integer> {

}
