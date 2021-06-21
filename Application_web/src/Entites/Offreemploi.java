package Entites;

import java.sql.Date;

public class Offreemploi extends Offre{
     private int idofremp;
     private String typecontrat;
     private Double salaire;
   
	public Offreemploi() {
		super();
	}
	
	public Offreemploi(int idofremp, String nom, String description, String date, String contrainte,String typecontrat, Double salaire) {
		super(nom, description, date, contrainte);
		this.idofremp = idofremp;
		this.typecontrat = typecontrat;
		this.salaire = salaire;
	}
	public Offreemploi( String nom, String description, String date, String contrainte , String typecontrat, Double salaire) {
		super(nom, description, date, contrainte);
	    this.typecontrat = typecontrat;
		this.salaire = salaire;
	}

	public int getIdofremp() {
		return idofremp;
	}

	public void setIdofremp(int idofremp) {
		this.idofremp = idofremp;
	}

	public String getTypecontrat() {
		return typecontrat;
	}

	public void setTypecontrat(String typecontrat) {
		this.typecontrat = typecontrat;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Offreemploi [idofremp=" + idofremp + ", typecontrat=" + typecontrat + ", salaire=" + salaire + "]";
	}
	

     
}
