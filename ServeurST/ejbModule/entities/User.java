package entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	private String password;
	private String login;
	
	public User() {
		super();
	}
	

	public User(String password, String login) {
		this.password = password;
		this.login = login;
	}
	
	 @ManyToMany(cascade = { CascadeType.ALL })
	 @JoinTable(name = "user_role",joinColumns = @JoinColumn( name = "idUser" ),inverseJoinColumns = @JoinColumn( name = "idRole" ) )
	 private List<Role> roles = new ArrayList<>();


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public List<Role> getRoles() {
		return roles;
	}



	@Override
	public String toString() {
		return "User [id=" + idUser + ", password=" + password + ", login=" + login + "]";
	}
	
	
}
