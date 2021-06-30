package Entites;



public class Admin extends User{
     private int ida;
     private String prenom;
     private String date_naissance;
     private String cin;
     
	public Admin() {
		super();
		
	}

	public Admin(int ida,String nom, String prenom, String login, String password, String date_naissance, String adresse, String cin
			) {
		super(nom, login, password, adresse);
		this.ida = ida;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.cin = cin;
	}

	public Admin(String nom, String prenom, String login, String password,String date_naissance, String adresse,String cin) {
		super(nom,login, password,adresse);
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public int getIda() {
		return ida;
	}

	public void setIda(int ida) {
		this.ida = ida;
	}
     
	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	@Override
	public String toString() {
		return "Admin [ida=" + ida + ", prenom=" + prenom + ", date_naissance=" + date_naissance + ", cin=" + cin + "]";
	}
	
     
     
}
