package com.example.canteen2.jpa;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.canteen2.model.Menu;

public interface Canteen_Menu extends JpaRepository<Menu, Integer> {

}
