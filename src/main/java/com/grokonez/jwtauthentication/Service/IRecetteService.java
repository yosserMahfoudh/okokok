package com.grokonez.jwtauthentication.Service;

import java.util.List;

import com.grokonez.jwtauthentication.model.Recette; 



public interface IRecetteService {
	
	public Recette getRecetteById(Long id);
	public List<Recette> getAllRecette();
	public Recette save(Recette rec);
	public Recette update(Recette rec);
	public void delete(Long id);
	

}
