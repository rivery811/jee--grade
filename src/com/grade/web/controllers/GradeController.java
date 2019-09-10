package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.serviceimpls.GradeServiceImpl;
import com.grade.web.services.GradeService;


@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ssn = request.getParameter("ssn");
		String name = request.getParameter("name");
		int kor =Integer.parseInt( request.getParameter("kor"));
		int eng =Integer.parseInt( request.getParameter("eng"));
		int math =Integer.parseInt( request.getParameter("math"));
		int soc =Integer.parseInt( request.getParameter("soc"));
		GradeBean grade = new GradeBean();
	//	grade.setName(name);
		grade.setEng(eng);
		grade.setKor(kor);
		grade.setMath(math);
		grade.setSoc(soc);
	//  grade.setSsn(ssn);
		GradeService service =new GradeServiceImpl();
		
	//	service.createStudentNum(grade);
	//	service.sum(grade);
	//	service.avg(grade);
		System.out.println("컨트롤러"+grade.toString());
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
