package com.grokonez.jwtauthentication.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Recette_Ingredient {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRecIng;

	
	@ManyToOne 
	@JoinColumn(name = "IdIngredient")
	@JsonIgnoreProperties("resIngs")
	private  Ingredient ingredient;
	
	@ManyToOne 
	@JoinColumn(name = "RecetteId")
	@JsonIgnoreProperties("resIngs")
	private  Recette recette;
	
	
	private float quantity;
	
	public Recette_Ingredient(float qte, Ingredient ingredient, Recette recette) {
		super();
		this.quantity = qte;
		this.ingredient = ingredient;
		this.recette = recette;
	}
	public Recette_Ingredient() {
		super();
	}
	public Long getIdRecIng() {
		return idRecIng;
	}
	public void setIdRecIng(Long idRecIng) {
		this.idRecIng = idRecIng;
	}
	
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	public Recette getRecette() {
		return recette;
	}
	public void setRecette(Recette recette) {
		this.recette = recette;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	
	
		
}
