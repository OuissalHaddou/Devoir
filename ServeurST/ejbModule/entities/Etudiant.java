package entities;

import java.io.Serializable;
import jakarta.persistence.Entity;

@Entity
public class Etudiant extends User implements Serializable{

	private String prenom;
	private String nom;
	private String telefon;
	private static final long serialVersionUID = 1L;
	
	public Etudiant() {
		super();
	}   
	
	
	
	public Etudiant(String prenom, String nom, String telefon) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.telefon = telefon;
	}



	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
}
