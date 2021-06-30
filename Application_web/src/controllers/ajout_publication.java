package controllers;

import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entites.User;
import Services.ser_publication;


@WebServlet("/ajout_publication")
public class ajout_publication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public ajout_publication() {
        super();
        }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0;
		  String text = request.getParameter("caption");
		  HttpSession s=  request.getSession();
		  User u = (User)s.getAttribute("user");
		  int id = u.getId();
         // String urlimg = request.getParameter("urlimg");
         try { 
     			res = ser_publication.ser_ajout_pub(id,text);
     		} catch (ClassNotFoundException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		} catch (SQLException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     		 if(res==1) {
     			response.sendRedirect("http://localhost:8080/Application_web/ajout_publication");
     			
     		 }
     		    else {System.out.println("non ajouter");
     		    	
     		    }
            
}
	}