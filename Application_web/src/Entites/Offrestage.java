package Entites;



public class Offrestage extends Offre {
	private int idofrstg;
     
	public Offrestage() {
		super();
		
	}

	public Offrestage(int idofr,String nom, String description, String date, String contrainte) {
 		super(idofr, nom, description, date, contrainte);
 	
 	}

 	public Offrestage(String nom, String description, String date, String contrainte) {
 		super( nom, description, date,  contrainte);
 	}
     
     public int getIdofrstg() {
		return idofrstg;
	}

	@Override
	public String toString() {
		return super.toString();	}

}
