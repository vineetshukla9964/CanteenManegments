package com.example.canteen2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Register {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private Long number;
	private String  pass;
	
	

}

