package com.seiken_soft.model.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.seiken_soft.beans.Beans;
public class EmployeeUpdateModelImpl {

	//接続用の情報をフィールドに定数として定義
	private static String RDB_DRIVE = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/TestDB";
 	private static String USER = "testuser";
 	private static String PASS = "test";
 
 	//データベース接続を行うメソッド
 	public static Connection getConnection(){
 		try{
 			Class.forName(RDB_DRIVE);
 			Connection con = DriverManager.getConnection(URL, USER, PASS);
 			con.setAutoCommit(false);
// 			System.out.println("test2");
 			return con;
 		}catch(Exception e){
// 			System.out.println("test");
 			throw new IllegalStateException(e);
 		}
 	}

 	//データベースへデータを登録するメソッド
 	public int update(Beans beans) throws SQLException{
 		//変数宣言
 		Connection con = null;
 		Statement  smt = null;
 
 		//return用変数
 		int count = 0;
 
 		//SQL文
 		String sql = "UPDATE M_Emploee SET "
 			+ "EMPLOYEE_NAME = '" + beans.getName() + "', "
 			+ "E_MAILADDRESS = '" + beans.getEmail() + "' "
 			+ "WHERE EMPLOYEE_ID = '" + beans.getId() + "'";
        System.out.println(sql);
 
        con = getConnection();
        try{
 			
 			smt = con.createStatement();
 
 			//SQLをDBへ発行
 			count = smt.executeUpdate(sql);
 			
 			con.commit();

 		}catch(SQLException sqle){
 			con.rollback();
 			throw sqle;
 		}catch(Exception e){
 			e.printStackTrace();
			con.rollback();
 			throw e;
 		}finally{
 			//リソースの開放
 			if(smt != null){
 				try{smt.close();}catch(SQLException ignore){}
 			}
 			if(con != null){
 				try{con.close();}catch(SQLException ignore){}
 			}
 		}
 		return count;
 	}
 }