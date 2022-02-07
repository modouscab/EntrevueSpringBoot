package com.example.entrevueSpringBoot.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "acteur")
//@SequenceGenerator(name="seqa", initialValue=1, allocationSize=1)
public class Acteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "acteur_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public String nom;
	public String prenom;
	@ManyToMany(mappedBy = "acteurs", cascade = { CascadeType.ALL })
	private List<Film> films = new ArrayList<Film>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Film> getFilms() {
		return films;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	

}
