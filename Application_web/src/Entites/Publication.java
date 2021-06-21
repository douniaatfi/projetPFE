package Entites;

public class Publication {
     private int idpub;
     private String datepub;
     private String contenupub;
 
     
	public Publication() {
		super();
	}

	public Publication(int idpub, String datepub, String contenupub) {
		super();
		this.idpub = idpub;
		this.datepub = datepub;
		this.contenupub = contenupub;
	}
	public Publication( String datepub, String contenupub) {
		super();
		this.datepub = datepub;
		this.contenupub = contenupub;
	}
	public String getContenupub() {
		return contenupub;
	}

	public void setContenupub(String contenupub) {
		this.contenupub = contenupub;
	}

	public int getIdpub() {
		return idpub;
	}

	public void setIdpub(int idpub) {
		this.idpub = idpub;
	}

	public String getDatepub() {
		return datepub;
	}

	public void setDatepub(String datepub) {
		this.datepub = datepub;
	}

	@Override
	public String toString() {
		return "Publication [idpub=" + idpub + ", datepub=" + datepub + "]";
	}
     
     
}
