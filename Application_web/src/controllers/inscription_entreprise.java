package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entites.Entreprise;
import Services.ser_entreprise;

@WebServlet("/inscription_entreprise")
public class inscription_entreprise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public inscription_entreprise() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  this.getServletContext().getRequestDispatcher("/pages/inscri_entreprise.jsp").include(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean res = false;
		PrintWriter out=response.getWriter();
		Entreprise e=new Entreprise(request.getParameter("nom"),request.getParameter("login"),request.getParameter("password"),request.getParameter("adresse"),Integer.parseInt(request.getParameter("tele")),request.getParameter("tempdispo"));
	    try {
		  res=ser_entreprise.AjouterEntreprise(e);  
		  
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    if(res) {out.print("votre inscription est bien fait");}
	    else {out.print("votre inscription a été échoué");}
	    
	}
		
		
		

}
