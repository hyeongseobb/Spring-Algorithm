<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>데이터 입력</title>
<link href="${pageContext.request.contextPath}/resources/input.css"
	rel="stylesheet" />
</head>

<body>
	<a href="/fourth">목록으로</a>
	<form action="update_data" method="get">
		<input type="hidden" name="idx" value="${idx}" />
		<label>이름</label> <input type="text" placeholder="이름 입력" name="name" value="${name}" />
		<label>ID</label> <input type="text" placeholder="아이디 입력" name="id" value="${id}" />
		<label>PASSWORD</label> <input type="password" placeholder="비밀번호 입력" name="password" value="${password}" />
		<label>주소</label> <input type="text" placeholder="주소" name="address" value="${address}" />
		<label>생일</label> <input type="text" placeholder="생일" name="birthday" value="${birthday}" />
		<label>좋아하는 색상</label> <input type="text" placeholder="좋아하는 색상"
			name="favoriteColor" value="${favoriteColor}" />
		<input type="submit" value="입력 완료" />
	</form>
</body>

</html>
