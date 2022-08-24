<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data">
    <!-- ... 이전 코드 생략 -->
    <!-- 파일 업로드창 추가 -->
    <div class="form-group">
        <label>파일</label>
        <input type="file" class="form-control" name="file"/>
    </div>
</form>
</body>
</html>