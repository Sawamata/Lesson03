<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,com.seiken_soft.beans.Beans"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
Beans id = (Beans)request.getAttribute("id");
%>
<html>
	<head>
		<title>社員情報更新画面</title>
	</head>
	<body style="max-width: 1600px; width: 100%; text-align; center;">
		<div style="text-align:center">
			<h2 style="text-align:center">修正したい社員名・メールアドレスを入力してください</h2>
			<hr style="height:3; background-color:#0000ff" />
			<br>
	<form action="update" method=post>
		<div style=" display: flex; width: 800px; text-align: center; margin: 0 auto;">
			<div style=" flex: 1;　width: 200px;">
 			<table style="margin:0 auto">
 				<tr>
 					<th style="background-color:#6666FF; width:100">ID</th>
 				</tr>
 				<tr>
 					<td style="text-align:center; width:100"><%= Beans.getId() %></td>
 				</tr>
 			</table>
			</div>
		</div>
		
			</form>	
			
			<br>
		</div>
	</body>
</html>