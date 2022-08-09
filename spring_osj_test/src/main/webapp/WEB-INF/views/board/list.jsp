<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	  <h2>게시글</h2>         
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>게시글 번호</th>
	        <th>제목</th>
	        <th>작성자</th>
	        <th>작성시간</th>
	        <th>조회수</th>
	        <th>추천</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach items="${list}" var="board">
	      <tr>
	        <td>${board.bd_num}</td>
	        <td>
	        	<a href="<c:url value="/board/select/${board.bd_num}"></c:url>">${board.bd_title}</a>
	        </td>
	        <td>${board.bd_me_id}</td>
	        <td>${board.bd_reg_date}</td>
	        <td>${board.bd_views}</td>
	        <td>${board.bd_up}/${board.bd_down}</td>
	      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>