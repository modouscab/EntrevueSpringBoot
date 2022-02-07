/**
 * 
 */
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

/**
 * @author ndiay
 *
 */
@Entity
@Table(name = "film")
//@SequenceGenerator(name="seqf", initialValue=1, allocationSize=1)

public class Film implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "film_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titre;
	private String description; 
	
	
	  @ManyToMany(cascade = {
		        CascadeType.ALL
		    })
		    @JoinTable(
		        name = "film_acteurs",
		        joinColumns = {
		            @JoinColumn(name = "film_id")
		        },
		        inverseJoinColumns = {
		            @JoinColumn(name = "acteur_id")
		        }
		    )
	private List<Acteur> acteurs = new ArrayList<Acteur>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Acteur> getActeurs() {
		return acteurs;
	}


	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
	
	

}
