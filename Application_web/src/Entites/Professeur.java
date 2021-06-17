package Entites;

public class Professeur extends User {
     private int idp;
     
    
	public int getIdp() {
		return idp;
	}

	public void setIdp(int idp) {
		this.idp = idp;
	}
	

	public Professeur() {
		super();
		
	}

	public Professeur(String nom, String prenom, String login, String password, int age, String adresse, String cin) {
		super(nom, prenom, login, password, age, adresse, cin);
		
	}

	public Professeur(int idp, String nom, String prenom, String login, String password, int age, String adresse,
			String cin) {
		super(nom, prenom, login, password, age, adresse, cin);
		this.idp = idp;
	}

	
	@Override
	public String toString() {
		return "Professeur [idp=" + idp + "]";
	}
     
}
