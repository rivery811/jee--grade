<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트 대학</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
<form action="">
	<h2>환영합니다</h2>
	<table border = '1'>
		<tr>
			<td>로그인</td>
			<td><input id = "btn" type="button" value = "Login" /></td>
		</tr>
		<tr>
			<td>학생부 등록</td>
			<td><a id = "a-register" href="#" >바로가기</a></td>
		</tr>
	</table>
</form>
</div>
<script >
$('#btn').click(function(){
	alert('버튼클릭');
	location.assign('<%=request.getContextPath()%>/student.do?action=move&dest=login');
});
$('#a-register').click(function(){
	alert('바로갔음');
	location.assign('<%=request.getContextPath()%>/student.do?action=move&dest=register');
});
</script>
</body>
</html>