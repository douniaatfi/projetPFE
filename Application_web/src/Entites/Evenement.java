package Entites;

import java.sql.Date;

public class Evenement {
      private int idevenm;
      private String contenuev;
      private String date;
      
      
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(int idevenm, String contenuev, String date) {
		super();
		this.idevenm = idevenm;
		this.contenuev = contenuev;
		this.date = date;
	}
	public Evenement(String contenuev, String date) {
		super();
		
		this.contenuev = contenuev;
		this.date = date;
	}
	public int getIdevenm() {
		return idevenm;
	}
	public void setIdevenm(int idevenm) {
		this.idevenm = idevenm;
	}
	public String getContenuev() {
		return contenuev;
	}
	public void setContenuev(String contenuev) {
		this.contenuev = contenuev;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Evenement [idevenm=" + idevenm + ", contenuev=" + contenuev + ", date=" + date + "]";
	}  
      
}
