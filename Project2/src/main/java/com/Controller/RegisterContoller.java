package com.Controller;

import java.io.IOException;

import com.DAOInterface.UserDAO;
import com.Model.Register;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterContoller")
public class RegisterContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String Status = "fail";

	public RegisterContoller() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Welcome to Servlets");

		String username = request.getParameter("username");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");

		Register r = new Register();

//		setting front data to backend DB
		r.setUsername(username);
		r.setFirstname(firstname);
		r.setLastname(lastname);
		r.setPassword(password);

		UserDAO ud = new UserDAO();
		Status = ud.insertuser(r);

		if (Status.equals("success")) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
	}

}
