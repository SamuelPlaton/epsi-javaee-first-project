package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Connexion() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// If the user clicked on the disconnect button, disconnect
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("surname")) request.setAttribute("surname", cookie.getValue());
			if(cookie.getName().equals("name")) request.setAttribute("name", cookie.getValue());
			if(cookie.getName().equals("rememberLogin")) request.setAttribute("rememberLogin", cookie.getValue());
		}
		if(request.getParameter("disconnect") != null && request.getParameter("disconnect").equals("true")) {
			HttpSession session = request.getSession();
	    	session.invalidate();
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
