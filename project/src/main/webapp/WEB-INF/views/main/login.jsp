<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form action="/project/login" class="mt-3" method="post">
		<div class="form-group">
			<label for="me_id"></label> 
				<input type="text" class="form-control" name="me_id" placeholder="ID">
		</div>
		<div class="form-group">
			<label for="me_pw"></label> 
				<input type="password" class="form-control" name="me_pw" placeholder="PW">
		</div>
		<button class="btn btn-outline-success col-12">로그인</button>
	</form>
	</div>
</body>
</html>