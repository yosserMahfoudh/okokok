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

import com.grokonez.jwtauthentication.Service.Recette_IngredientService;
import com.grokonez.jwtauthentication.model.Ingredient;
import com.grokonez.jwtauthentication.model.Recette;
import com.grokonez.jwtauthentication.model.Recette_Ingredient;
import com.grokonez.jwtauthentication.repository.IIncredientRepository;
import com.grokonez.jwtauthentication.repository.IRecetteRepository;


@RestController
@EnableAutoConfiguration
@RequestMapping("/recIng")
public class RecetteIngredientController {
	
	@Autowired 
	Recette_IngredientService recing;
	
	@Autowired
	IRecetteRepository recette;
	
	@Autowired
	IIncredientRepository incredient;
	
	
	@PostMapping("/save/{idRecette}/{idIngredient}")
	 public Recette_Ingredient save(@RequestBody Recette_Ingredient incr, @PathVariable String idRecette,@PathVariable String idIngredient)
	 { 
		Recette rc=recette.findById(Long.valueOf(idRecette)).get();
		incr.setRecette(rc);
		
		Ingredient ingre = incredient.findById(Long.valueOf(idIngredient)).get();
		incr.setIngredient(ingre);
        return recing.saveorupdate(incr);
	 }
	 
	@DeleteMapping("/delete/{id}")
	 public void delete(@PathVariable Long id)
	 { recing.DeleteById(id);;
	 
	 }
	 
	@GetMapping("/getAll")
	 public List<Recette_Ingredient> findALL(){
		return recing.getAll();
		 
	 }
	 
	@GetMapping("/getById/{id}")
	 public Recette_Ingredient findById( @PathVariable Long id) {
		 return recing.getById(id);
	 }

}
