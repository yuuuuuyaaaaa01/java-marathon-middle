<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="/Hotel/searchAnswer" method="POST">
			<p>ホテル検索</p>
			<p>一泊料金<input type="text" name="price">円以下</p>
			<input type="submit" value="検索">
		</form>
		
	<c:forEach var="hotel" items="${hotels}" varStatus="status">
			<table border=1>
				<tr>
					<td>ホテル名</td>
					<td><c:out value="${hotel.hotelName}" /></td>
				</tr>
				<tr>
					<td>最寄り駅</td>
					<td><c:out value="${hotel.nearestStation}" /></td>
				</tr>
				<tr>
					<td>価格</td>
					<td><fmt:formatNumber value="${hotel.price}" pattern="###,###" /></td>
				</tr>
			</table>	
	</c:forEach>
	
		
</body>
</html>