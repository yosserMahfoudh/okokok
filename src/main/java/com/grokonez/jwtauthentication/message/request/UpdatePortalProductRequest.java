package com.grokonez.jwtauthentication.message.request;

import java.util.List;

import com.grokonez.jwtauthentication.model.Recette_Ingredient; 



public class UpdatePortalProductRequest {

	private String NameRecette;
	private String Commentaires;
	private Integer TempsPreparation;
	private Integer TempsCuisson;
	private Float cout;
	private String Difficulte;
	private Integer NbrePersonne;
	private String etapes;
	private String cin;
	private List<Recette_Ingredient> resIngs;

	private Long id;

	public String getNameRecette() {
		return NameRecette;
	}

	public void setNameRecette(String nameRecette) {
		NameRecette = nameRecette;
	}

	public String getCommentaires() {
		return Commentaires;
	}

	public void setCommentaires(String commentaires) {
		Commentaires = commentaires;
	}

	public Integer getTempsPreparation() {
		return TempsPreparation;
	}

	public void setTempsPreparation(Integer tempsPreparation) {
		TempsPreparation = tempsPreparation;
	}

	public Integer getTempsCuisson() {
		return TempsCuisson;
	}

	public void setTempsCuisson(Integer tempsCuisson) {
		TempsCuisson = tempsCuisson;
	}

	public Float getCout() {
		return cout;
	}

	public void setCout(Float cout) {
		this.cout = cout;
	}

	public String getDifficulte() {
		return Difficulte;
	}

	public void setDifficulte(String difficulte) {
		Difficulte = difficulte;
	}

	public Integer getNbrePersonne() {
		return NbrePersonne;
	}

	public void setNbrePersonne(Integer nbrePersonne) {
		NbrePersonne = nbrePersonne;
	}

	public String getEtapes() {
		return etapes;
	}

	public void setEtapes(String etapes) {
		this.etapes = etapes;
	}

	public List<Recette_Ingredient> getResIngs() {
		return resIngs;
	}

	public void setResIngs(List<Recette_Ingredient> resIngs) {
		this.resIngs = resIngs;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

}
