package com.grokonez.jwtauthentication.model;

import java.util.List;  

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "recettes")
public class Recette {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RecetteId;

	private String nom;

	private String commentaire;
	private Integer temP;
	private Integer tempc;
	private Float cout;
	private String diff;
	private Integer nbrepersonne;
	public String etapes;

	@ManyToOne
	@JoinColumn(name = "UserId")
	// avoid showing a many lists of users
	@JsonIgnoreProperties("recettes")
	private User user;

	
	@OneToMany(mappedBy = "recette")
	private List<Recette_Ingredient> resIngs;

	
	public Recette(String nom, String commentaire, Integer temP, Integer tempc, Float cout, String diff,
			Integer nbrepersonne, String etapes, User user, List<Recette_Ingredient> resIngs) {
		super();
		this.nom = nom;
		this.commentaire = commentaire;
		this.temP = temP;
		this.tempc = tempc;
		this.cout = cout;
		this.diff = diff;
		this.nbrepersonne = nbrepersonne;
		this.etapes = etapes;
		this.user = user;
		this.resIngs = resIngs;
	}

	// private List<Incredient> incredients;
	
	public List<Recette_Ingredient> getResIngs() {
		return resIngs;
	}

	public void setResIngs(List<Recette_Ingredient> resIngs) {
		this.resIngs = resIngs;
	}
  

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Integer getTempc() {
		return tempc;
	}

	public void setTempc(Integer tempc) {
		this.tempc = tempc;
	}

	public String getDiff() {
		return diff;
	}

	public void setDiff(String diff) {
		this.diff = diff;
	}

	public Integer getNbrepersonne() {
		return nbrepersonne;
	}

	public void setNbrepersonne(Integer nbrepersonne) {
		this.nbrepersonne = nbrepersonne;
	}

	public Recette() {
		super();

	}

	public String getEtapes() {
		return etapes;
	}

	public void setEtapes(String etapes) {
		this.etapes = etapes;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public Long getRecetteId() {
		return RecetteId;
	}

	public void setRecetteId(Long recetteId) {
		RecetteId = recetteId;
	}




	public Float getCout() {
		return cout;
	}

	public void setCout(Float cout) {
		this.cout = cout;
	}



	public Integer getTemP() {
		return temP;
	}

	public void setTemP(Integer temP) {
		this.temP = temP;
	}
}
