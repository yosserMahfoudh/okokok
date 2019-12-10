package com.grokonez.jwtauthentication.Service;

import java.util.List;

import com.grokonez.jwtauthentication.model.Recette_Ingredient; 



public interface IRecette_IngredientService {
	public List<Recette_Ingredient> getAll();

	public Recette_Ingredient getById(Long id);

	public Recette_Ingredient saveorupdate(Recette_Ingredient recincr);

	public void DeleteById(Long id);

}
