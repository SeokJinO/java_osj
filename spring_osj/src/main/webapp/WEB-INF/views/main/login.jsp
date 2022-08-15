<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	<div class="container">
		<form action="/spring/login" class="mt-3" method="post">
			<h1>Login</h1>
			<div class="form-group">
				<input type="text" class="form-control" name="me_id" placeholder="ID">
			</div>
			<div class="form-group">
				<input type="password" class="form-control" name="me_pw" placeholder="PW">
			</div>
			<button class="btn btn-outline-success col-12 mb-3">로그인</button>
		</form>
	</div>

</body>
</html>