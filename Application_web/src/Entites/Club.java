package Entites;

public class Club extends Groupe{
     private int idclub;

	public Club() {
		super();
		
	}
	 public Club( String nom, String photogr, String description) {
			super(nom, photogr, description);
			
		}
	
    public Club( int idclub, String nom, String photogr, String description) {
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
