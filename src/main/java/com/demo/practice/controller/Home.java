package com.demo.practice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.practice.model.Employee;


@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("in get method of home page");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	RequestDispatcher rd = request.getRequestDispatcher("view/Home.jsp");
//	request.setAttribute("key1", name);
//	request.setAttribute("key2", age);
	Employee e = new Employee();
	e.setAge(Integer.parseInt(age));
	e.setName(name);
	request.setAttribute("employee", e);
	rd.forward(request, response);
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
