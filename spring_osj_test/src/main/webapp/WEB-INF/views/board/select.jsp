<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="form-group">
			<label for="">제목:</label> 
			<input type="text" class="form-control" readonly value="${board.bd_title}">
		</div>
		<div class="form-group">
			<label for="">작성자:</label> 
			<input type="text" class="form-control" readonly value="${board.bd_me_id}">
		</div>
		<div class="form-group">
			<label for="">작성일:</label> 
			<input type="text" class="form-control" readonly value="${board.bd_reg_date_time_str}">
		</div>
		<div class="form-group">
			<label for="">최종수정일:</label> 
			<input type="text" class="form-control" readonly value="${board.bd_up_date_time_str}">
		</div>
		<div class="form-group">
			<label for="">조회수:</label> 
			<input type="text" class="form-control" readonly value="${board.bd_views }">
		</div>
		<div class="form-group">
			<label for="comment">내용:</label>
			<textarea class="form-control" rows="10" readonly>${board.bd_content }</textarea>
		</div>
	</div>
</body>
</html>