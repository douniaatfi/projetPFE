package Entites;

public class Entreprise {
	private int identreprise; 
    private String nom;
    private String login;
    private String password;
    private String adresse;
    private int tele;
    
	public Entreprise(int identreprise, String nom, String login, String password, String adresse, int tele) {
		super();
		this.identreprise = identreprise;
		this.nom = nom;
		this.login = login;
		this.password = password;
		this.adresse = adresse;
		this.tele = tele;
	}
    
	public Entreprise( String nom, String login, String password, String adresse, int tele) {
		super();
		this.nom = nom;
		this.login = login;
		this.password = password;
		this.adresse = adresse;
		this.tele = tele;
	}

	public Entreprise() {
		super();
	}

	public int getIdentreprise() {
		return identreprise;
	}

	public void setIdentreprise(int identreprise) {
		this.identreprise = identreprise;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTele() {
		return tele;
	}

	public void setTele(int tele) {
		this.tele = tele;
	}

	@Override
	public String toString() {
		return "Entreprise [identreprise=" + identreprise + ", nom=" + nom + ", login=" + login + ", password="
				+ password + ", adresse=" + adresse + ", tele=" + tele + "]";
	}
	
	
}
