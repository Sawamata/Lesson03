<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,com.seiken_soft.beans.Beans"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>絞込みデータを表示する</title>
	</head>
	<body style="max-width: 1600px; width: 100%; text-align; center;">
		<div style="text-align:center">
			<h2 style="text-align:center">検索する社員ID・社員名を入力してください</h2>
			<hr style="height:3; background-color:#0000ff" />
			<br>
	<form action="search" method=post>
		<div style=" display: flex; width: 800px; text-align: center; margin: 0 auto;">
			<div style=" flex: 1;　width: 200px;">
				社員ID
				<input type="text" name="id">			<br>
		
			</div>
			<div style=" flex: 1;　width: 200px;">
				社員名
				<input type="text" name="name">
				<input type="submit" value="検索">
			<br>
			</div>
		</div>
		
			<h2 style="text-align:center">絞込みデータを表示する</h2>
			<hr style="height:3; background-color:#0000ff" />
			<br>
		<div style=" display: flex; width: 800px; text-align: center; margin: 0 auto;">
<table style="border: 1px solid;text-align: center; margin: 0 auto;">
  <c:forEach items="${list}" var="u">
    <tr style="border: 1px solid">
      <td style="border: 1px solid"><c:out value="${u.id}" /></td>
      <td style="border: 1px solid"><c:out value="${u.name}" /></td>
      <td style="border: 1px solid"><c:out value="${u.email}" /></td>
      <td style="border: 1px solid">
      <button type="submit" formaction="mainte"  value="${u.id}" id="mainteid" name="mainteid" >修正</button>
      <!-- 
      <input type="hidden" id="id" name="id" value="${u.id}"><input type="hidden" formaction="mainte" id="name" name="name" value="${u.name}">
      <input type="hidden" formaction="mainte" id="email" name="email" value="${u.email}"> -->
      </td>
      <!-- <td><c:out value="${u.name}" /></td>
      <td><c:out value="${u.name}" /></td> -->
      
    </tr>
  </c:forEach>
</table>
		</div>
		
			</form>	
			
			<br>
		</div>
		${error}
	</body>
</html>