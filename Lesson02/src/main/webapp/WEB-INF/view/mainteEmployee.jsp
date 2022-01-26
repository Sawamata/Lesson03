<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,com.seiken_soft.beans.Beans"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%
//リクエストスコープからのデータの取得
String mainteid = (String)request.getAttribute("mainteid");
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
 			<form action="update" method=post onsubmit="return beforeSubmit()">
 				<br>
 				<table style="margin:0 auto ; text-align: center;">
 					<tr>
 						<td style="width:100px;text-align:right">社員ID：</td>
 						<td style="text-align:left"><%= mainteid %>
 						<input type="hidden" name="id" value="<%= mainteid %>"></td>
 					</tr>
 					<tr>
 						<td style="width:100px;text-align:right">名前：</td>
 						<td ><input type=text size="30" name="name"></input></td>
 					</tr>
 					<tr>
 						<td style="width:100px;text-align:right">アドレス：</td>
 						<td ><input type=text size="30" name="email"></input></td>
 					</tr>
 					<tr>
 						<td colspan=2 style="text-align:right">
 							<input type="submit" value="更新">
 						</td>
 					</tr>
 				</table>
 			</form>
		
			
			<br>
		</div>
		
<script>
  function beforeSubmit() {
    if(window.confirm('更新しますか？')) {
      return true;
    } else {
      return false;
    }
  }
</script>
	</body>
</html>