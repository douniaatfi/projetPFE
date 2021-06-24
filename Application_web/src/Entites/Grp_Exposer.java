package Entites;

public class Grp_Exposer extends Groupe {
      private int idexp;
      private String date_creation;
      private String date_expiration;
      
	  public Grp_Exposer() {
		super();
		
	  }

	public Grp_Exposer(int idexp,String nom, String photogr, String description ,String date_creation, String date_expiration) {
		super(nom,photogr,description);
		this.idexp = idexp;
		this.date_creation = date_creation;
		this.date_expiration = date_expiration;
	}
	public Grp_Exposer(String nom, String photogr, String description ,String date_creation, String date_expiration) {
		super(nom,photogr,description);
		this.date_creation = date_creation;
		this.date_expiration = date_expiration;
	}

	public int getIdexp() {
		return idexp;
	}

	public void setIdexp(int idexp) {
		this.idexp = idexp;
	}

	public String getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}

	public String getDate_expiration() {
		return date_expiration;
	}

	public void setDate_expiration(String date_expiration) {
		this.date_expiration = date_expiration;
	}


	@Override
	public String toString() {
		return "Exposer [idexp=" + idexp + ", date_creation=" + date_creation + ", date_expiration=" + date_expiration
				+ "]";
	}
      
      
}
