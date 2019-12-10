package com.grokonez.jwtauthentication.model;

import java.util.List; 

import javax.persistence.*;


@Entity
@Table(name = "ingredients")
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdIngredient;

	private String mesure;
	private String nomingredient;
	
	@OneToMany(mappedBy = "ingredient")
	private List<Recette_Ingredient> resIngs;


	public Ingredient(String mesure, String nomingredient, List<Recette_Ingredient> resIngs) {
		super();
		this.mesure = mesure;
		this.nomingredient = nomingredient;
		this.resIngs = resIngs;
	}





	/*
	 * @OneToMany(mappedBy ="ingr") private List<recetteingr> rectI;
	 */

	/*
	 * @ManyToMany(mappedBy="incredients") private List<Recette> recettes;
	 */

	public String getMesure() {
		return mesure;
	}





	public void setMesure(String mesure) {
		this.mesure = mesure;
	}





	public String getNomingredient() {
		return nomingredient;
	}





	public void setNomingredient(String nomingredient) {
		this.nomingredient = nomingredient;
	}





	public Ingredient() {
		super();

	}





	public Long getIdIngredient() {
		return IdIngredient;
	}


	public void setIdIngredient(Long idIngredient) {
		IdIngredient = idIngredient;
	}



	public List<Recette_Ingredient> getResIngs() {
		return resIngs;
	}


	public void setResIngs(List<Recette_Ingredient> resIngs) {
		this.resIngs = resIngs;
	}
	
	





}
