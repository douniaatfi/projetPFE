package Entites;



public class User {
     private int id;
     private String nom;
     private String login;
     private String password;
     private String adresse;
    
     
     
     
	
	public User(int id, String nom, String login, String password, String adresse) {
		super();
		this.id = id;
		this.nom = nom;		
		this.login = login;
		this.password = password;
		this.adresse = adresse;
     }
	
	public User( String nom, String login, String password, String adresse) {
		super();
		this.nom = nom;
		this.login = login;
		this.password = password;
		this.adresse = adresse;
	}
	
	public User() {
		super();
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
     @Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ",  login=" + login + ", password=" + password
				+ ", adresse=" + adresse +
				"]";
	}

	public int getIdentreprise() {
		// TODO Auto-generated method stub
		return 0;
	}

	
     
}
