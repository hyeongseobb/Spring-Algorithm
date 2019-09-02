<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <!--아래의 viewport는 모바일 작업하기전에 필수! -->
  <!-- meta name="viewport" content="width=divice-width, initial-scale=1.0" /-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fontawesome-free-5.10.1-web/css/all.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/reset.css" />
  <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script>var idx = ${idx_string};</script>
  <link rel="stylesheet" href="https://uicdn.toast.com/tui-editor/latest/tui-editor.css"></link>
  <link rel="stylesheet" href="https://uicdn.toast.com/tui-editor/latest/tui-editor-contents.css"></link>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.33.0/codemirror.css"></link>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/styles/github.min.css"></link>
  <script src="https://uicdn.toast.com/tui-editor/latest/tui-editor-Editor-full.js"></script>	
  <script src="${pageContext.request.contextPath}/resources/details.js"></script>
</head>
<body>
  <header class="top_nav">
    <a href=""><i class="fas fa-user-friends"></i> 회원관리</a>
    <a href=""><i class="fas fa-clipboard-list"></i> 게시판관리</a>
    <a href=""><i class="fab fa-dochub"></i> 갤러리관리</a>
  </header>
  <div class="content">
  	<div class="details_section">
	    <h3>상세보기</h3>
	    <div id="de"></div>
    </div>
  </div>
  <div class="button_center_section">
  	<a class="submit_button">수정하기</a>
  </div>
</body>
</html>
