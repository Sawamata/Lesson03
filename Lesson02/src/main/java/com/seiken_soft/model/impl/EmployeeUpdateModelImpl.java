package com.seiken_soft.model.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.seiken_soft.beans.Beans;
public class EmployeeUpdateModelImpl {

	//接続用の情報をフィールドに定数として定義
//	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String RDB_DRIVE = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/TestDB";
//	private static String URL = "jdbc:mysql://localhost/testdb";
//	private static String URL = "jdbc:mysql://localhost/TestDB";
 	private static String USER = "testuser";
// 	private static String USER = "root";
 	private static String PASS = "test";
// 	private static String PASS = "sawamata";
 
 	//データベース接続を行うメソッド
 	public static Connection getConnection(){
 		try{
 			Class.forName(RDB_DRIVE);
 			Connection con = DriverManager.getConnection(URL, USER, PASS);
// 			System.out.println("test2");
 			return con;
 		}catch(Exception e){
// 			System.out.println("test");
 			throw new IllegalStateException(e);
 		}
 	}

 	//データベースから全てのアカウント情報の検索を行うメソッド
 	public ArrayList<Beans> search(String id){
// 	public ArrayList<Beans> search(String id, String name){
 		//変数宣言
 		Connection con = null;
 		PreparedStatement  smt = null;
 
 		//return用オブジェクトの生成
 		ArrayList<Beans> list = new ArrayList<Beans>();
 
 		//SQL文
 		String sql = "UPDATE FROM M_Emploee SET name = ?, email = ?, WHERE id = ?";

//		smt.setString(1, Beans.getName());
//		smt.setString(2, Beans.getEmail());
//		smt.setInt(3, Beans.getId());
// 		String sql = "SELECT * FROM M_Emploee WHERE EMPLOYEE_ID LIKE '%" + id + "%'";
// 		String sql;
//        if (id.equals("0")) {
//            sql = "SELECT * FROM M_Emploee ;" ;
//      } else if (id.equals("0"))   {
//      } else  {
//            sql = "SELECT * FROM sample_01 WHERE id=" + id +  ";" ;
//      }
//        if (name.equals("0")) {
//            sql = "SELECT * FROM M_Emploee ;" ;
//      } else  {
//            sql = "SELECT * FROM M_Emploee WHERE name=" + name +  ";" ;
//      }
 
 		try{
 			con = getConnection();
 			smt = con.prepareStatement(sql);
 
 			//SQLをDBへ発行
 			ResultSet rs = smt.executeQuery(sql);
 
 			//検索結果を配列に格納
 			while(rs.next()){
 				Beans beans =new Beans();
 				beans.setId(rs.getString("EMPLOYEE_ID"));
 				beans.setName(rs.getString("EMPLOYEE_NAME"));
 				beans.setEmail(rs.getString("E_MAILADDRESS"));
 				list.add(beans);
 			}
 
 		}catch(Exception e){
 			throw new IllegalStateException(e);
 		}finally{
 			//リソースの開放
 			if(smt != null){
 				try{smt.close();}catch(SQLException ignore){}
 			}
 			if(con != null){
 				try{con.close();}catch(SQLException ignore){}
 			}
 		}
 		return list;
 	}
 }