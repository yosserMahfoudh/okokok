package com.grokonez.jwtauthentication.Service;

import java.util.List;

import com.grokonez.jwtauthentication.model.Ingredient; 





public interface IingredientService {
	 public List<Ingredient> getAllIncredient();
	   
	   public Ingredient getIncredientById(Long id);
	   
	    public Ingredient saveorupdateIncredient(Ingredient incr);
	    
	   public void  DeleteById(Long id);
}
