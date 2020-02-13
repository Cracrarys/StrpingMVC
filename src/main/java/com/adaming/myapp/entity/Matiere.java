package com.adaming.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Matiere {
	@Id
	@Column(name="Id_Matiere")
	private long idMatiere;
	@Column
	private String nomMatiere;
	
	public Matiere() {
		super();
	}
	public Matiere(long idMatiere, String nomMatiere) {
		super();
		this.idMatiere = idMatiere;
		this.nomMatiere = nomMatiere;
	}
	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", nomMatiere=" + nomMatiere + "]";
	}
	public long getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(long idMatiere) {
		this.idMatiere = idMatiere;
	}
	public String getNomMatiere() {
		return nomMatiere;
	}
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
	
}
