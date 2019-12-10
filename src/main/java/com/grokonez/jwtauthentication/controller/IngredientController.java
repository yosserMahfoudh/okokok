package com.grokonez.jwtauthentication.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.Service.IingredientService;
import com.grokonez.jwtauthentication.model.Ingredient;



@RestController
@EnableAutoConfiguration
@RequestMapping("/Ingredient")
public class IngredientController {
	@Autowired 
	IingredientService ingredient;
	
	@PostMapping("/save")
	 public Ingredient save(@RequestBody Ingredient incr)
	 {
		 return ingredient.saveorupdateIncredient(incr);
	 }
	 
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { ingredient.DeleteById(id);;
	 
	 }
	 
	@GetMapping("/getAll")
	 public List<Ingredient> findALL(){
		return ingredient.getAllIncredient();
		 
	 }
	 
	@GetMapping("/getById/{id}")
	 public Ingredient findById( @PathVariable Long id) {
		 return ingredient.getIncredientById(id);
	 }


}
