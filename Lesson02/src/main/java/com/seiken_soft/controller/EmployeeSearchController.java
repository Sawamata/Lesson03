package com.seiken_soft.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seiken_soft.beans.Beans;
import com.seiken_soft.model.impl.EmployeeSearchModelImpl;

@WebServlet(urlPatterns = "/search")

public class EmployeeSearchController extends HttpServlet{


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 		フォワード先の指定
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp");

		// 		フォワードの実行
		dispatcher.forward(request, response);
	}

 	public void doPost(HttpServletRequest request ,HttpServletResponse response)
 	throws ServletException ,IOException{
 
 		String error = "";
 
 		try{
 			//パラメータの取得
 			String id = request.getParameter("id");
 			String name = request.getParameter("name");
 			//配列宣言
 			ArrayList<Beans> list = new ArrayList<Beans>();
 
 			//オブジェクト宣言
 			EmployeeSearchModelImpl objDao2 = new EmployeeSearchModelImpl();
 
 			//全検索メソッドを呼び出し
 			list = objDao2.search(id , name);
// 			list = objDao2.search(id);
 
 			//検索結果を持ってlist.jspにフォワード
 			request.setAttribute("list", list);
 
 		}catch (IllegalStateException e) {
 			error ="DB接続エラーの為、一覧表示はできませんでした。";
 
 		}catch(Exception e){
 			error ="予期せぬエラーが発生しました。<br>"+e;
 
 		}finally{
 			request.setAttribute("error", error);
 			request.getRequestDispatcher("/WEB-INF/view/searchEmployee.jsp").forward(request, response);
 		}
 	}
 }