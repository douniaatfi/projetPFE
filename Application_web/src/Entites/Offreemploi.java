package Entites;



public class Offreemploi extends Offre{
     private int idofremp;
     private String typecontrat;
     private int salaire;
   
	public Offreemploi() {
		super();
	}
	
	public Offreemploi(int idofr, String nom, String description, String contrainte,String typecontrat, int salaire) {
		super(idofr ,nom, description, contrainte);
		
		this.typecontrat = typecontrat;
		this.salaire = salaire;
	}
	public Offreemploi(int idofr, String nom, String description,String date, String contrainte,String typecontrat, int salaire) {
		super(idofr ,nom, description,date, contrainte);
		
		this.typecontrat = typecontrat;
		this.salaire = salaire;
	}
	public Offreemploi( String nom, String description, String contrainte , String typecontrat, int salaire) {
		super(nom, description, contrainte);
	    this.typecontrat = typecontrat;
		this.salaire = salaire;
	}

	

	public int getIdofremp() {
		return super.getIdofr();
	}

	public String getTypecontrat() {
		return typecontrat;
	}
	public String getContrainte2() {
		return super.getContrainte();
	}
	public void setTypecontrat(String typecontrat) {
		this.typecontrat = typecontrat;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Offreemploi [ typecontrat=" + typecontrat + ", salaire=" + salaire + "]";
	}
	

     
}
