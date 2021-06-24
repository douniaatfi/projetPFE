package Entites;

public class Grp_Club extends Groupe{
     private int idclub;
     private User president;
	public Grp_Club() {
		super();
		
	}
	 public Grp_Club( String nom, String photogr, String description) {
			super(nom, photogr, description);
			
		}
	
    public Grp_Club( int idclub, String nom, String photogr, String description) {
		super(nom, photogr, description);
		this.idclub = idclub;
	}
	public int getIdclub() {
		return idclub;
	}
	public void setIdclub(int idclub) {
		this.idclub = idclub;
	}
	@Override
	public String toString() {
		return "Club [idclub=" + idclub + "]";
	}

	
     
     
}
