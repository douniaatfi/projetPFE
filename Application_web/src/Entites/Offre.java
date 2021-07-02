package Entites;



public class Offre {
      private int idofr;
      private String nom;
      private String description;
      private String date;
      private String contrainte;
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Offre(int idofr, String nom, String description,  String contrainte) {
		super();
		this.idofr = idofr;
		this.nom = nom;
		this.description = description;
		this.contrainte = contrainte;
	}
	public Offre(int idofr, String nom, String description, String date, String contrainte) {
		super();
		this.idofr = idofr;
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.contrainte = contrainte;
	}
	public Offre( String nom, String description, String date, String contrainte) {
		super();
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.contrainte = contrainte;
	}
	public Offre( String nom, String description, String contrainte) {
		super();
		this.nom = nom;
		this.description = description;
		this.contrainte = contrainte;
	}
	public int getIdofr() {
		return idofr;
	}
	public void setIdofr(int idofr) {
		this.idofr = idofr;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContrainte() {
		return contrainte;
	}
	public void setContrainte(String containte) {
		this.contrainte = containte;
	}
	@Override
	public String toString() {
		return "Offre [idofr=" + idofr + ", nom=" + nom + ", description=" + description + ", date=" + date
				+ ", contrainte=" + contrainte + "]";
	}  
      
}
