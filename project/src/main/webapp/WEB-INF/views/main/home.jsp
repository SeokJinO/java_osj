<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<style>
body{
	background : gray;
}
</style>
<body>
<div>
<button class="btn btn-outline-success col-12 test">버튼</button>
	<h1 style="text-align: center">영화 검색 사이트</h1>
	<div>
		<div class="form-group">
			<input type="text" class="form-control search-movie" placeholder="영화제목을 입력하세요.">
		</div>
	</div>
</div>
asd ${user}
</body>
<script type="text/javascript">
$(function(){
	$('.test').click(function(){
		console.log(${user});
	})
})
</script>
