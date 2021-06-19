package Entites;

import java.sql.Date;

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

	public Professeur(String nom, String prenom, String login, String password, String date_naissance, String adresse, String cin) {
		super(nom, prenom, login, password, date_naissance, adresse, cin);
		
	}

	public Professeur(int idp, String nom, String prenom, String login, String password,String date_naissance, String adresse,
			String cin) {
		super(nom, prenom, login, password, date_naissance, adresse, cin);
		this.idp = idp;
	}

	
	@Override
	public String toString() {
		return "Professeur [idp=" + idp + "]";
	}
     
}
