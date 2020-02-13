package com.adaming.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Etudiant {

	@Id
	@Column(name="Id_Etudiant")
	private long idEtudiant;
	@Column
	private String nomEtudiant;
	@Column
	private String prenomEtudiant;
	
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + "]";
	}
	public Etudiant() {
		super();
	}
	public Etudiant(long idEtudiant, String nomEtudiant, String prenomEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
	}
	public long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	
}
