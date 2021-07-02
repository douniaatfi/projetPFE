package Entites;

public class Etudiant extends User {
	
    private int ide;
    private String prenom;
    private String date_naissance;
    private String cin;
	private String cne;
    private int  code_ap;

	public Etudiant(int ide, String nom, String prenom, String login, String password, String date_naissance, String adresse , String cne, int  code_ap, String cin) {
		super(nom,login, password,adresse);
			this.ide = ide;
			this.prenom = prenom;
			this.date_naissance=date_naissance;
			this.cne = cne;
			this.code_ap = code_ap;
			this.cin = cin;
			
	}
	public Etudiant(String nom, String prenom, String login, String password, String date_naissance, String adresse,
			 String cne ,int  code_ap,String cin) {
		super(nom,login, password,adresse);	
		this.prenom = prenom;
		this.date_naissance=date_naissance;
		this.cne = cne;
		this.code_ap = code_ap;
		this.cin = cin;
	}
	
	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return super.getNom();
	}
	
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public int getId() {
		return ide;
	}
	public void setId(int id) {
		this.ide = id;
	}
	
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	public int getCode_ap() {
		return code_ap;
	}
	public void setCode_ap(int code_ap) {
		this.code_ap = code_ap;
	}
	@Override
	public String toString() {
		return super.toString()+" [ ide=" + ide + ", prenom=" + prenom + ", date_naissance=" + date_naissance + ", cin=" + cin
				+ ", cne=" + cne + ", code_ap=" + code_ap + "]";
	}
	public void affiche() {
		super.toString();
	}
	
}
