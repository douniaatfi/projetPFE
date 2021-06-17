package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entites.Entreprise;
import Entites.User;

@WebServlet("/authentification_user")

public class authentification_user extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	public authentification_user() {
	        super();
	        
	    }

	   
		protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	            	this.getServletContext().getRequestDispatcher("/pages/page_authentification.jsp").include(request, response);
	            }
	     protected void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException {
	    	 
	    	 String login=request.getParameter("login");
	         String password=request.getParameter("password");
	    	// Authentification User
	    	 String role=null;
	    	   try {
				 role=Services.ser_user.returnrole(login,password);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	         User en =null;
	         try {
	      	   en = Services.ser_user.AuthentificationUser(login, password);		
	  	} catch (ClassNotFoundException | SQLException e) {
	  		e.printStackTrace();
	  	}
	         if(en==null) {
	        	 System.out.println("page d'inscription");
	      	      // response.sendRedirect("http://localhost:8080/Application_web/authentification_etudiant");
	  	} else {
	  		if(role.equals("admin")) {
	  			System.out.println("page admin");
	  		}else if(role.equals("etudiant")) {
	  			System.out.println("page d'etudiant");
	  		}else if(role.equals("professeur")) {
	  			System.out.println("page de professeur");
	  		}else {
	  			System.out.println("page d'entreprise");
	  		}
	            }
	  
	         
}
}