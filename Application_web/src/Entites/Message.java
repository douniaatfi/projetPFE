package Entites;

import java.sql.Date;

public class Message {
      private int idmsg;
      private String text;
      private Date date;
      
      
      
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int idmsg, String text, Date date) {
		super();
		this.idmsg = idmsg;
		this.text = text;
		this.date = date;
	}
	public Message( String text, Date date) {
		super();
		this.text = text;
		this.date = date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Message [idmsg=" + idmsg + ", text=" + text + ", date=" + date + "]";
	}
      
      
}
