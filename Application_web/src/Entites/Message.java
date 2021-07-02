package Entites;

public class Message {
      private int idmsg;
      private int ide;
      private int idr;
      private String text;
      private String date;
      
      
	
	public Message(int idmsg, int ide, int idr, String text, String date) {
		super();
		this.idmsg = idmsg;
		this.ide = ide;
		this.idr = idr;
		this.text = text;
		this.date = date;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int idmsg, String text, String date) {
		super();
		this.idmsg = idmsg;
		this.text = text;
		this.date = date;
	}
	public Message( String text, String date) {
		super();
		this.text = text;
		this.date = date;
	}
	public Message(int ide,int idr, String text, String date) {
		super();
		this.ide = ide;
		this.idr = idr;
		this.text = text;
		this.date = date;
	}
	
	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public int getIdr() {
		return idr;
	}
	public void setIdr(int idr) {
		this.idr = idr;
	}
	public int getIdmsg() {
		return idmsg;
	}
	public void setIdmsg(int idmsg) {
		this.idmsg = idmsg;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Message [idmsg=" + idmsg + ", ide=" + ide + ", idr=" + idr + ", text=" + text + ", date=" + date + "]";
	}
	
      
      
}
