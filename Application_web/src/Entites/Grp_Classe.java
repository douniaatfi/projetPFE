package Entites;

public class Grp_Classe extends Groupe {
     
        private int idclasse;
        public Grp_Classe( String nom, String photogr, String description) {
			super( nom,photogr,description);
		} 

		public Grp_Classe(int idclasse, String nom, String photogr, String description) {
			super(nom,photogr,description);
			this.idclasse = idclasse;
		}

		public Grp_Classe() {
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
