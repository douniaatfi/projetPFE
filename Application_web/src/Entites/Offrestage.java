package Entites;

import java.sql.Date;

public class Offrestage extends Offre {
     private int idofrstg;
 
     
	public Offrestage() {
		super();
		
	}

	public Offrestage(int idofrstg,String nom, String description, String date, String contrainte) {
 		super( nom, description, date, contrainte);
 		this.idofrstg = idofrstg;
 	}

 	public Offrestage(String nom, String description, String date, String contrainte) {
 		super( nom, description, date,  contrainte);
 	}

	public int getIdofrstg() {
		return idofrstg;
	}

	public void setIdofrstg(int idofrstg) {
		this.idofrstg = idofrstg;
	}
     
     @Override
	public String toString() {
		return "Offrestage [idofrstg=" + idofrstg + "]";
	}

}
