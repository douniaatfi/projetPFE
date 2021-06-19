package Entites;

import java.sql.Date;

public class User {
     private int id;
     private String nom;
     private String prenom;
     private String login;
     private String password;
     private String date_naissance;
     private String adresse;
     private String cin;
     
     
     
	
	public User(int id, String nom, String prenom, String login, String password,String date_naissance, String adresse,String cin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.date_naissance = date_naissance;
		this.adresse = adresse;
        this.cin = cin;
	}
	
	public User( String nom, String prenom, String login, String password, String date_naissance, String adresse, String cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.date_naissance = date_naissance;
		this.adresse = adresse;
		this.cin = cin;
	}
	
	public User() {
		super();
	}
	
	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
	
     @Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password
				+ ", date_naissance=" + date_naissance + ", adresse=" + adresse +
				"]";
	}

	
     
}
