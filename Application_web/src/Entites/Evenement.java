package Entites;


public class Evenement {
      private int idevenm;
      private String contenuEven;
      private String date;
      private String Urlimg;
      
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evenement(int idevenm, String contenuEven, String date, String urlimg) {
		super();
		this.idevenm = idevenm;
		this.contenuEven = contenuEven;
		this.date = date;
		this.Urlimg = urlimg;
	}
	public Evenement(String contenuev, String date, String urlimg) {
		super();
		this.contenuEven = contenuev;
		this.date = date;
		this.Urlimg = urlimg;
	}
	public Evenement(String contenuev, String urlimg) {
		super();
		this.contenuEven = contenuev;
		this.Urlimg = urlimg;
	}
	public int getIdevenm() {
		return idevenm;
	}
	public void setIdevenm(int idevenm) {
		this.idevenm = idevenm;
	}
	public String getContenuEven() {
		return contenuEven;
	}
	public void setContenuEven(String contenuev) {
		this.contenuEven = contenuev;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getUrlimg() {
		return Urlimg;
	}
	public void setUrlimg(String urlimg) {
		this.Urlimg = urlimg;
	}
	@Override
	public String toString() {
		return "Evenement [idevenm=" + idevenm + ", contenuEven=" + contenuEven + ", date=" + date + ", Urlimage="+ Urlimg + "]";
	}  
      
}
