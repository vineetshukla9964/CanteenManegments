package com.example.canteen2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;
   private String food;
   private int count;

}
