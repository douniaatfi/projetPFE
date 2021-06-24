package Entites;

import java.util.ArrayList;

public class Groupe {
   private int idgroupe;
   private String nom;
   private String photogr;
   private String description;
   private ArrayList<User> members;
   public Groupe() {
	      super();
	// TODO Auto-generated constructor stub
    }

   public Groupe(int idgroupe, String nom, String photogr, String description ) {
	super();
	this.idgroupe = idgroupe;
	this.nom = nom;
	this.photogr = photogr;
	this.description = description;
	this. members = new ArrayList<User>();
    }

   public Groupe(String nom, String photogr, String description) {
	super();
	this.nom = nom;
	this.photogr = photogr;
	this.description = description;
	this. members = new ArrayList<User>();
    }

public int getIdgroupe() {
	return idgroupe;
}

public void setIdgroupe(int idgroupe) {
	this.idgroupe = idgroupe;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPhotogr() {
	return photogr;
}

public void setPhotogr(String photogr) {
	this.photogr = photogr;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "Groupe [idgroupe=" + idgroupe + ", nom=" + nom + ", photogr=" + photogr + ", description=" + description
			+ "]";
}
    
   
}
