package com.grokonez.jwtauthentication.controller;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grokonez.jwtauthentication.Service.RecetteService;
import com.grokonez.jwtauthentication.model.Recette;
import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.UserRepository;

@RestController
@EnableAutoConfiguration
@RequestMapping("/recettee")
@CrossOrigin(origins ="*")
public class RecetteController {

	@Autowired
	RecetteService service;
	
	@Autowired
	UserRepository userrepo;
	
	@GetMapping("/getAll")
	@CrossOrigin(origins ="http ://localhost:4200")
	List<Recette> getAllRecette(){
		return service.getAllRecette();
	}
	
	@GetMapping("/getById/{id}")
	Recette getRecetteById(@PathVariable Long id){
		return service.getRecetteById(id);
	}
	
	@PostMapping("/saveOrUpdate/{id}")
	Recette add(@RequestBody Recette recette,@PathVariable String id){
		User user = userrepo.findById(Long.valueOf(id)).get();
		recette.setUser(user);
		return service.save(recette);
	}
	
	@PostMapping("/save")
	Recette add(@RequestBody Recette recette){
		return service.save(recette);
	}
	
	@DeleteMapping("/Delete/{id}")
	String DeleteRecette(@PathVariable Long id){
		 service.delete(id);
		 return "Recette deleted id : "+id;
	}
	
	
	
	
	
	
	
}
