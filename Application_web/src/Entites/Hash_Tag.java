package Entites;

public class Hash_Tag {
      private int idhtag;
      private String nomhtag;
      
      
	public Hash_Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hash_Tag(int idhtag, String nomhtag) {
		super();
		this.idhtag = idhtag;
		this.nomhtag = nomhtag;
	}
	public Hash_Tag(String nomhtag) {
		super();
		this.nomhtag = nomhtag;
	}
	public int getIdhtag() {
		return idhtag;
	}
	public void setIdhtag(int idhtag) {
		this.idhtag = idhtag;
	}
	public String getNomhtag() {
		return nomhtag;
	}
	public void setNomhtag(String nomhtag) {
		this.nomhtag = nomhtag;
	}
	@Override
	public String toString() {
		return "Hash_Tag [idhtag=" + idhtag + ", nomhtag=" + nomhtag + "]";
	}
      
      
}
