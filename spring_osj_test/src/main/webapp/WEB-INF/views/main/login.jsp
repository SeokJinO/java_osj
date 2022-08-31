<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	<div class="container">
		<form method="post">
			<h1>Login</h1>
			<div class="form-group">
				<input type="text" class="form-control" id="me_id" name="me_id" placeholder="ID">
			</div>
			<div class="form-group">
				<input type="password" class="form-control" id="me_id" name="me_pw" placeholder="PW">
			</div>
			<div class="form-check">
				<label class="form-check-label">
					<input type="checkbox" class="form-check-input">자동로그인
				</label>
			</div>
			<div>
			<a href="<c:url value="/find?type=id"></c:url>">아이디 찾기</a> / 
			<a href="<c:url value="/find?type=pw"></c:url>">비밀번호 찾기</a>
			</div>
			<button class="btn btn-outline-success col-12">로그인</button>
		</form>
	</div>

</body>
</html>