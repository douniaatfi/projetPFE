package Entites;

public class Publication {
     private int idpublication;
     private String DatePu;
     private String caption;
 
     
	public Publication() {
		super();
	}


	public int getIdpublication() {
		return idpublication;
	}


	public void setIdpublication(int idpublication) {
		this.idpublication = idpublication;
	}


	public String getDatePu() {
		return DatePu;
	}


	public void setDatePu(String datePu) {
		DatePu = datePu;
	}


	public String getCaption() {
		return caption;
	}


	public void setCaption(String caption) {
		this.caption = caption;
	}


	public Publication(int idpublication, String datePu, String caption) {
		super();
		this.idpublication = idpublication;
		DatePu = datePu;
		this.caption = caption;
	}
	public Publication (String datePu, String caption) {
		super();
		DatePu = datePu;
		this.caption = caption;
	}
	public Publication (String caption) {
		super();
		this.caption = caption;
	}
	@Override
	public String toString() {
		return "Publication [idpublication=" + idpublication + ", DatePu=" + DatePu + ", caption=" + caption + "]";
	}

	
     
     
}
