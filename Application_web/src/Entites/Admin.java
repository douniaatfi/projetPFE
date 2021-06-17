package Entites;

public class Admin extends User{
     private int ida;

	public Admin() {
		super();
		
	}

	public Admin(int ida,String nom, String prenom, String login, String password, int age, String adresse, String cin
			) {
		super(nom, prenom, login, password, age, adresse, cin);
		this.ida = ida;
	}

	public Admin(String nom, String prenom, String login, String password, int age, String adresse,
			String cin) {
		super(nom, prenom, login, password, age, adresse, cin);
	}

	public int getIda() {
		return ida;
	}

	public void setIda(int ida) {
		this.ida = ida;
	}
     
     
}
