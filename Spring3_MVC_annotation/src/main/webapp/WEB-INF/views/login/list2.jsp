<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>입력한 ID, 비밀번호 출력</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<style>
	.container{width:30%}
	h3{text-align:center; color:gray; margin-top:10%}
</style>

</head>
<body>
<div class="container">
	<h3>list2.jsp 입니다.</h3>
	<table class="table">
		<tr>
			<td>ID</td>
			<td>${bbsBean.id}</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${bbsBean.pass}</td>
		</tr>
	</table>
</div>
</body>
</html>