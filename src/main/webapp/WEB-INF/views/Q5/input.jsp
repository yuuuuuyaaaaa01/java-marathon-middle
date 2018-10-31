<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>プロ野球セントラルリーグ一覧</p>
	<c:forEach var="baseballTeams" items="${baseballTeams}" varStatus="status">
		<a href="/index/output?id=${baseballTeams.id}"><c:out value="${baseballTeams.teamName}"/></a><br>
	</c:forEach>
	
</body>
</html>