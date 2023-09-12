<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>send.jsp</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<style>
		.container{width:50%}
	</style>
</head>
<body>
	<div class="container">
		<h3 class="text-left">회원 가입 정보</h3>
		<table class="table">
			<tr>
				<th>ID</th><td>${join.id}</td>
			</tr>
			<tr>
				<th>비밀번호</th><td>${join.pass}</td>
			</tr>
			<tr>
				<th>주민번호</th><td>${join.jumin1} - ${join.jumin2}</td>
			</tr>
			<tr>
				<th>E-Mail</th><td>${join.email}@${join.domain}</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<c:set var="gender" value="${join.gender}" />
					<c:choose>
						<c:when test='${gender.equals("m")}'>
							<c:out value="남자" />
						</c:when>
						<c:otherwise>
							<c:out value="여자" />
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>
				<th>취미</th>
					<td>
				        <c:forEach var="hobby" items="${join.hobby}">
				            ${hobby}&nbsp;
				        </c:forEach>
			    	</td>
			</tr>
			<tr>
				<th>우편번호</th><td>${join.post1}</td>
			</tr>		
			<tr>
				<th>주소</th><td>${join.address}</td>
			</tr>
			<tr>
				<th>자기소개</th><td>${join.intro}</td>
			</tr>
		
		</table>
	</div>
</body>
</html>