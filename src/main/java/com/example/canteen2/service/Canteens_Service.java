package com.example.canteen2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.canteen2.jpa.Canteens_Jpa;
import com.example.canteen2.model.Canteen;

@Service
public class Canteens_Service {
	@Autowired
	private Canteens_Jpa jpa;

	public Canteen save(Canteen entity) {
		return jpa.save(entity);
	}

	public List<Canteen> findAll() {
		return jpa.findAll();
	}

	public Canteen findById(Integer id) {
		return jpa.findById(id).orElse(null);
	}

	public long count() {
		return jpa.count();
	}

	public void deleteById(Integer id) {
		jpa.deleteById(id);
	}
	

}
