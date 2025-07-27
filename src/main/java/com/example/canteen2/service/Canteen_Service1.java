package com.example.canteen2.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.canteen2.jpa.Canteen_Menu;
import com.example.canteen2.model.Menu;

@Service
public class Canteen_Service1 {
	@Autowired
  private Canteen_Menu jpa1;


	    public void save(Menu menu) {
	        jpa1.save(menu);
	    }

	
	

}
