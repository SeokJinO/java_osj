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
<c:if test="${board.bd_del == 'N' }">
	<form class="container" method="post">
		<h1>게시글 수정</h1>
		<div class="form-group">
			<label for="bd_title">제목:</label> 
			<input type="text" class="form-control" name="bd_title" id="bd_title" value="${board.bd_title}">
		</div>
		<div class="form-group">
			<label for="bd_comment">내용:</label>
			<textarea class="form-control" rows="10" name="bd_content" id="bd_content">${board.bd_content }</textarea>
		</div>
		<button class="btn btn-outline-success col-12">게시글 수정</button>
	</form>
	</c:if>
</body>
</html>