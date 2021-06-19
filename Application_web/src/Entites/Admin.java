package Entites;

import java.sql.Date;

public class Admin extends User{
     private int ida;

	public Admin() {
		super();
		
	}

	public Admin(int ida,String nom, String prenom, String login, String password, String date_naissance, String adresse, String cin
			) {
		super(nom, prenom, login, password, date_naissance, adresse, cin);
		this.ida = ida;
	}

	public Admin(String nom, String prenom, String login, String password,String date_naissance, String adresse,
			String cin) {
		super(nom, prenom, login, password, date_naissance, adresse, cin);
	}

	public int getIda() {
		return ida;
	}

	public void setIda(int ida) {
		this.ida = ida;
	}

	@Override
	public String toString() {
		return "Admin [ida=" + ida + "]";
	}
     
     
}
