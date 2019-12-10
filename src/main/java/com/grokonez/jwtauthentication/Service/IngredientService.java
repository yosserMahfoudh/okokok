package com.grokonez.jwtauthentication.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Ingredient;
import com.grokonez.jwtauthentication.repository.*;



@Service
public class IngredientService implements IingredientService {
   
	@Autowired
	IIncredientRepository repository;
	
	
	@Override
	public List<Ingredient> getAllIncredient() {
	    
		return (List<Ingredient>) repository.findAll();
	}

	@Override
	public Ingredient getIncredientById(Long id) {
		
		return repository.findById(id).get();
	}

	@Override
	public Ingredient saveorupdateIncredient(Ingredient incr) {
	repository.save(incr);
		return incr ;
	}

	@Override
	public void DeleteById(Long id) {
		repository.deleteById(id);
		
	}
	


}
