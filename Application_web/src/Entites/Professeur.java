package Entites;

public class Professeur extends User {
     private int idp;
     private String prenom;
     private String date_naissance;
     private String cin;
    
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
		super(nom, login, password,adresse);
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.cin = cin;
	}

	public Professeur(int idp, String nom, String prenom, String login, String password,String date_naissance, String adresse, String cin) {
		super(nom, login, password,adresse);
		this.idp = idp;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.cin = cin;
	}

	 
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Override
	public String toString() {
		return "Professeur [idp=" + idp + ", prenom=" + prenom + ", date_naissance=" + date_naissance + ", cin=" + cin
				+ "]";
	}

     
}
