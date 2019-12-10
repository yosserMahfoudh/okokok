package com.grokonez.jwtauthentication.repository;

import org.springframework.data.repository.CrudRepository;

import com.grokonez.jwtauthentication.model.Ingredient; 



public interface IIncredientRepository  extends CrudRepository<Ingredient,Long>{

}
