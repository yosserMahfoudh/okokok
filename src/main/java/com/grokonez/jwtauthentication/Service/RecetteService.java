package com.grokonez.jwtauthentication.Service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grokonez.jwtauthentication.model.Recette;
import com.grokonez.jwtauthentication.repository.IRecetteRepository;



@Service
public class RecetteService implements IRecetteService{
	
	@Autowired
	IRecetteRepository recette;

	@Override
	public Recette getRecetteById(Long id) {
		
	return recette.findById(id).get();
	}

	@Override
	public List<Recette> getAllRecette() {
		
		return (List<Recette>) recette.findAll();
	}

	@Override
	public Recette save(Recette rec ) {
		recette.save(rec);
		return rec;
	}

	
	@Override
	public Recette update(Recette rec ) {
		recette.save(rec);
		return rec;
	}
	@Override
	public void delete(Long id) {
	recette.deleteById(id);
		
	}

	
	

}
