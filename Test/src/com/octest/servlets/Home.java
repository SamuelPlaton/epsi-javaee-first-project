package com.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Auteur;
import com.octest.forms.ConnectionForm;


@WebServlet("/Test")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;
       

    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	// If the user has no session, redirect him
    	if(session.getAttribute("name") == null ||  session.getAttribute("surname") == null){
    		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
    	}
        this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// When the form is posted, create the user session and redirect him
    	HttpSession session = request.getSession();
		session.setAttribute("name", request.getParameter("name"));
		session.setAttribute("surname", request.getParameter("surname"));
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	
    
    }

}