package Entites;

import java.sql.Date;

public class Publication {
     private int idpub;
     private Date datepub;
	
	public Publication() {
		super();
	}

	public Publication(int idpub, Date datepub) {
		super();
		this.idpub = idpub;
		this.datepub = datepub;
	}

	public int getIdpub() {
		return idpub;
	}

	public void setIdpub(int idpub) {
		this.idpub = idpub;
	}

	public Date getDatepub() {
		return datepub;
	}

	public void setDatepub(Date datepub) {
		this.datepub = datepub;
	}

	@Override
	public String toString() {
		return "Publication [idpub=" + idpub + ", datepub=" + datepub + "]";
	}
     
     
}
