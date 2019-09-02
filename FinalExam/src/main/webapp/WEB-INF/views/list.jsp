<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/list.css" />
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="list.js"></script>
</head>

<body>
  <div id="wrap">
    <div class="top_button_section">
      <a href="/finalexam/input" class="top_button">새로운 데이터 입력</a>
    </div>
    <div class="select_section">
      <form action="/finalexam/search" method="get">
        <input type="text" placeholder="검색어를 입력하세요." name="keyword"/>
        <input type="submit" value="검색" />
      </form>
    </div>
    <div class="student_list">
      <table>
        <tr>
          <th>idx</th>
          <th>이름</th>
          <th>중간고사 성적</th>
          <th>기말고사 성적</th>
          <th></th>
        </tr>
        ${select_result}
      </table>
    </div>
  </div>
</body>

</html>