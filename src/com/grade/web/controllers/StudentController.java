package com.grade.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.pool.Constants;


@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("dest");
		switch (request.getParameter("action")) {
		case "move":
			RequestDispatcher rd = request.getRequestDispatcher(String.format(Constants.VIEWPATH, "student",a));
			rd.forward(request, response);
			break;
		case "register":
			rd = request.getRequestDispatcher(String.format(Constants.VIEWPATH, "student",a));
			rd.forward(request, response);
			break;
		case "login":
			
			break;



		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
