package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Filiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Fid;
    @ManyToOne
    @JoinColumn(name="idEtudiant")
	private Etudiant Etudiant;

	public Etudiant getEtudiant() {
		return Etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		Etudiant = etudiant;
	}

	private String code;
	private String name ;
	public Long getFId() {
		return Fid;
	}
	public void setFId(Long id) {
		this.Fid = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
