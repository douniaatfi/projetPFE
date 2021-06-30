package controllers;

import java.io.IOException;
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
		int res = 0;
				Entreprise e=new Entreprise(request.getParameter("nom"),request.getParameter("login"),request.getParameter("password"),request.getParameter("adresse"),Integer.parseInt(request.getParameter("tele")),request.getParameter("tempdispo"));
			   try {
				  res=ser_entreprise.AjouterEntreprise(e);  
				  System.out.println("l entreprise"+e);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    if(res==1) { response.sendRedirect("http://localhost:8080/Application_web/authentification_user");}
			    else { response.sendRedirect("http://localhost:8080/Application_web/inscription_entreprise");}
			    
		}

}
