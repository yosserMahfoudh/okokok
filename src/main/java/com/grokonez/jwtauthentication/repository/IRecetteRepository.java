package com.grokonez.jwtauthentication.repository;

import org.springframework.data.repository.CrudRepository;

import com.grokonez.jwtauthentication.model.Recette;  




public interface IRecetteRepository extends CrudRepository<Recette,Long> {

}
