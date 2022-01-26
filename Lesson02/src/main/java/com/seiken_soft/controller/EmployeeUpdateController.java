package com.seiken_soft.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seiken_soft.beans.Beans;
import com.seiken_soft.model.impl.EmployeeUpdateModelImpl;

@WebServlet(urlPatterns = "/update")

public class EmployeeUpdateController extends HttpServlet{
	
 	public void doPost(HttpServletRequest request ,HttpServletResponse response)
 	throws ServletException ,IOException{
 
 		String error = "";
 
 		try{
 
 			//DTOオブジェクト宣言
 			Beans beans = new Beans();
 
 			//パラメータの取得
 			String id = request.getParameter("id");
 			String name = request.getParameter("name");
 			String email = request.getParameter("email");
 	        System.out.println(name);
 	        System.out.println(id);

			beans.setId(id);
			beans.setName(name);
			beans.setEmail(email);
			
 			//オブジェクト宣言
 			EmployeeUpdateModelImpl objDao3 = new EmployeeUpdateModelImpl();
 
 			//更新メソッドを呼び出し
 			int count = objDao3.update(beans);
 
 			//更新件数をリクエストスコープに登録
 			request.setAttribute("count", count);
 			request.setAttribute("id", id);
 			request.setAttribute("name", name);
 			request.setAttribute("email", email);
 
 		}catch (SQLException e) {
 			error ="SQL構文エラー";
 
 		}catch(Exception e){
 			error ="予期せぬエラーが発生しました。<br>"+e;
 
 		}finally{
 			request.setAttribute("error", error);
 			request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp").forward(request, response);
 		}
 	}
}