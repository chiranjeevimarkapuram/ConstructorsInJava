package com.Controller;

import java.io.IOException;

import com.DAOInterface.UserDAO;
import com.Model.UserLogin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Logincontroller() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginController Called ..!");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserLogin l = new UserLogin();
		
		l.setUsername(username);
		l.setPassword(password);
		
		
		UserDAO ud = new UserDAO();
		String Status = ud.selectloginUser(l);
		
		if(Status.equals("success")) {
			RequestDispatcher rd  = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}

	}

}
