package Entites;

public class Etudiant extends User {
	
    private int ide;
	private String cne;
    private int  code_ap;

	public Etudiant(int ide, String nom, String prenom, String login, String password, int age, String adresse,
			String cin, String cne, int code_ap) {
		super(nom, prenom, login, password, age, adresse, cin);
		this.ide = ide;
		this.cne = cne;
		this.code_ap = code_ap;
	}
	public Etudiant(String nom, String prenom, String login, String password, int age, String adresse,
			String cin, String cne, int code_ap) {
		super(nom, prenom, login, password, age, adresse, cin);
		
		this.cne = cne;
		this.code_ap = code_ap;
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
		return "Etudiant [id=" + ide + ", cne=" + cne + ", code_ap=" + code_ap + "]";
	}
	
}
