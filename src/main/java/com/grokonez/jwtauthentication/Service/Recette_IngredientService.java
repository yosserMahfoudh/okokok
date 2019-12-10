package com.grokonez.jwtauthentication.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Recette_Ingredient;
import com.grokonez.jwtauthentication.repository.IRecette_IncredientRepository;



@Service
public class Recette_IngredientService implements IRecette_IngredientService {
	
	@Autowired
	IRecette_IncredientRepository increct;

	@Override
	public List<Recette_Ingredient> getAll() {
		
		return (List<Recette_Ingredient>) increct.findAll();
	}

	@Override
	public Recette_Ingredient getById(Long id) {
		
		return increct.findById(id).get();
	}

	@Override
	public Recette_Ingredient saveorupdate(Recette_Ingredient recincr) {
		increct.save(recincr);
		return recincr;
	}

	@Override
	public void DeleteById(Long id) {
		increct.deleteById(id);
		
	}

}
