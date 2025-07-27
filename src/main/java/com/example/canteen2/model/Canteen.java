package com.example.canteen2.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Canteen {
	@Id
	@GeneratedValue
	private int id;
	private String enrolment;
	private String item;
	private int quantity;
	private Date  date=new Date();
	
	

}
