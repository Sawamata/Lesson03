package com.seiken_soft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seiken_soft.model.impl.EmployeeUpdateModelImpl;

@WebServlet(urlPatterns = "/update")

public class EmployeeUpdateController extends HttpServlet{
	
 	public void doPost(HttpServletRequest request ,HttpServletResponse response)
 	throws ServletException ,IOException{
 		
 		EmployeeUpdateModelImpl model = new EmployeeUpdateModelImpl();

		// フォームから送信されるデータは文字列扱いなので、
		// 一旦 String 型で受け取ります
		String s_id = request.getParameter("id");
		String name = request.getParameter("name");
		String s_email = request.getParameter("email");

		// 変数を初期化
		String id = "";
		String email = "";
		
	if(request.getParameter("name") != null){
		// データ更新ボタンを押された場合
		try {
//			model.updateItem(id, name, email);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}finally{
 			request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp").forward(request, response);
 		}
 	}
 }
}