<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생등록</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h1>학생 정보</h1>
	<form id = "register-form "action="<%=request.getContextPath()%>/student.do">
		주민번호 <input type="text" name = "ssn" />
		이름 <input type="text" name = "name"/>
		학번 <input type="text" name = "studentNum" />
		<input type="hidden" name = "action" value="register" />
		<input type="hidden" name = "dest" value = "login" />
		<input type="submit" value="전송" />
	</form>
</div>
<script>
$('#register-form').submit(function() {
	alert('테스트 맥락');
});
</script>
</body>
</html>