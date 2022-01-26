package com.seiken_soft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mainte")

public class EmployeeMainteController extends HttpServlet{


 	public void doPost(HttpServletRequest request ,HttpServletResponse response)
 	throws ServletException ,IOException{
 		String mainteid = request.getParameter("mainteid");
 		System.out.println(mainteid);
 		request.setAttribute("mainteid", mainteid); 
 		request.getRequestDispatcher("/WEB-INF/view/mainteEmployee.jsp").forward(request, response);
 	}
 }