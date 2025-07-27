package com.example.canteen2.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.canteen2.jpa.Canteen_Jpa;
import com.example.canteen2.model.Register;

@Service
public class Canteen_Service {
	@Autowired
	private Canteen_Jpa jpa;

	public Register save(Register register) {
		return jpa.save(register);
	}

	public List<Register> findAll() {
		return jpa.findAll();
	}

	public void deleteById(Integer id) {
		jpa.deleteById(id);
	}


	
	
	
	

}
