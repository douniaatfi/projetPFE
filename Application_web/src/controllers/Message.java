package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Message extends HttpServlet{
	 protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
     	this.getServletContext().getRequestDispatcher("/WEB-INF/Pages/...").include(request, response);
     }
     protected void doPost(HttpServletRequest request ,HttpServletResponse response) {
     	
     }
}