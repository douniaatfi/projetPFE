package Entites;

import java.sql.Date;

public class Evenement {
      private int idevenm;
      private String contenuev;
      private String date;
      private String urlimg;
      
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(int idevenm, String contenuev, String date, String urlimg) {
		super();
		this.idevenm = idevenm;
		this.contenuev = contenuev;
		this.date = date;
		this.urlimg = urlimg;
	}
	public Evenement(String contenuev, String date, String urlimg) {
		super();
		this.contenuev = contenuev;
		this.date = date;
		this.urlimg = urlimg;
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
	
	public String getUrlimg() {
		return urlimg;
	}
	public void setUrlimg(String urlimg) {
		this.urlimg = urlimg;
	}
	@Override
	public String toString() {
		return "Evenement [idevenm=" + idevenm + ", contenuev=" + contenuev + ", date=" + date + ", urlimage="+ urlimg + "]";
	}  
      
}
