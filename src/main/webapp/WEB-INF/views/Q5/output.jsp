<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<p>球団名</p>
		<c:out value="${baseballTeam.teamName}"/><br>
		<p>本拠地</p>
		<c:out value="${baseballTeam.headquarters}"/><br>
		<p>発足</p>
		<c:out value="${baseballTeam.inauguration}"/><br>
		<p>歴史</p>
		<c:out value="${baseballTeam.history}"/><br>
		<a href="/index/index">戻る</a>
</body>
</html>