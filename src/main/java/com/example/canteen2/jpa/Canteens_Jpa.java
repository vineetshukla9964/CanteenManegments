package com.example.canteen2.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.canteen2.model.Canteen;

public interface Canteens_Jpa extends JpaRepository<Canteen, Integer>{

}
