package Entites;

public class Entreprise extends User {
	private int identreprise; 
    private int tele;
    private String tempdispo;
    
	public Entreprise(int identreprise, String nom, String login, String password, String adresse, int tele , String tempdispo) {
		   super(nom ,login,password,adresse);
		this.identreprise = identreprise;
		this.tele = tele;
		this.tempdispo = tempdispo;
	}
    
	public Entreprise( String nom, String login, String password, String adresse, int tele, String tempdispo) {
		super();
		this.tele = tele;
		this.tempdispo = tempdispo;
	}

	public Entreprise() {
		super();
	}

	public String getTempdispo() {
		return tempdispo;
	}

	public void setTempdispo(String tempdispo) {
		this.tempdispo = tempdispo;
	}

	public int getIdentreprise() {
		return identreprise;
	}

	public void setIdentreprise(int identreprise) {
		this.identreprise = identreprise;
	}

	
	public int getTele() {
		return tele;
	}

	public void setTele(int tele) {
		this.tele = tele;
	}

	@Override
	public String toString() {
		return "Entreprise [identreprise=" + identreprise + ", tele=" + tele +",tempsdisponible="+ tempdispo+ "]";
	}
	
	
}
