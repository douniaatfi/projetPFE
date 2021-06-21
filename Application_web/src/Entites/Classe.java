package Entites;

public class Classe extends Groupe {
        private int idclasse;
        
        public Classe( String nom, String photogr, String description) {
			super( nom,photogr,description);
		} 

		public Classe(int idclasse, String nom, String photogr, String description) {
			super(nom,photogr,description);
			this.idclasse = idclasse;
		}

		public Classe() {
			super();
		}

		public int getIdclasse() {
			return idclasse;
		}

		public void setIdclasse(int idclasse) {
			this.idclasse = idclasse;
		}

		@Override
		public String toString() {
			return "Classe [idclasse=" + idclasse + "]";
		}
        
	    
	
	
}
