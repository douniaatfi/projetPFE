package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entites.Message;
import Entites.User;
import Services.ser_message;

@WebServlet("/message")
public class message extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public message() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/pages/message.jsp").include(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0;
		  HttpSession s=  request.getSession();
		  User u = (User)s.getAttribute("user");
		  int id = u.getId();
		  int idr = Integer.parseInt(request.getParameter("idconv")) ;
		  String msg = request.getParameter("Message");
		
		  try {
			res = ser_message.ajout_message(idr, id, msg);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

}
