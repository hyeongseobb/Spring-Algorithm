<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>

<head>
<title>login</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/sign_in.css" />
</head>

<body>
  <div class="wrap">
    <div class="login_content">
      <div class="logo_sec">
        <h2>로 그 인</h2>
      </div>
      <form class="login_sec" action="do_sign_in">
        <input type="text" placeholder="아이디" name="id" class="login_input" required="required" />
        <input type="password" placeholder="패스워드" name="password" class="login_input" required="required" />
        <input type="submit" class="login_btn" value="확인" />      
      </form>
    </div>
  </div>
</body>

</html>