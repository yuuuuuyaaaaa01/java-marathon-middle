<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<p>洋服shop</p>
		<p>好きな色を選択してください</p>
		
		<form action="/shop/answer" method="POST">
		<input type="radio" name="gender" value="1">男
		<input type="radio" name="gender" value="0">女
		<select name="color">
			<option value="赤">赤</option>
			<option value="青">青</option>
			<option value="黄">黄</option>
			<option value="白">白</option>
		</select>
		<input type="submit" value="検索">
		</form>
		
		
			<c:forEach var="shop" items="${shops}" varStatus="status">
			<table border=1>
				<tr>
					<td>ジャンル</td>
					<td><c:out value="${shop.genre}" /></td>
				</tr>
				<tr>
					<td>サイズ</td>
					<td><c:out value="${shop.size}" /></td>
				</tr>
				<tr>
					<td>価格</td>
					<td><c:out value="${shop.price}" /></td>
				</tr>
			</table>	
	</c:forEach>
		
		
		
</body>
</html>