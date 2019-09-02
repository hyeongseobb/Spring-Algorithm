<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <!--아래의 viewport는 모바일 작업하기전에 필수! -->
  <!--  meta name="viewport" content="width=divice-width, initial-scale=1.0" /-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fontawesome-free-5.10.1-web/css/all.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/reset.css" />
  <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script src="${pageContext.request.contextPath}/resources/admin.js"></script>
</head>
<body>
  <header class="top_nav">
    <a href=""><i class="fas fa-address-card"></i> 회원관리</a>
    　　<a href="post"><i class="fas fa-clipboard"></i> 게시판관리</a>
    　　<a href=""><i class="fas fa-file-contract"></i> 이용약관관리</a>
  </header>
  <div class="content">
    <div class="button_section">
      <a class="new_row">새로생성하기</a>
    </div>
    <div class="search_section">
      <seob><i class="fas fa-fighter-jet"></i>NEVER　</seob>
      <input type="text" class="searchbox" />
      <button class="search"><i class="fas fa-search"></i></button>
    </div>
    <div class="line">
      <hr style="border:3px color= silver;" width="90%">
    </div>
    <div class="table_section">
      <table>
        <colgroup>
          <col style="width: 10%;" />
          <col />
          <col />
          <col style="width: 20%;" />
        </colgroup>
        <thead>
          <tr>
            <th>no</th>
            <th>이름</th>
            <th>주소</th>
            <th></th>
            <th></th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    <div>
  </div>
</body>
</html>
