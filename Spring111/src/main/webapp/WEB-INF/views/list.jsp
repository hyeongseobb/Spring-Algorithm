<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	/*<![CDATA[*/
	table.t_ex2 {background:#E2F2D3; width:90%; margin:0 auto; text-align:right}
	.t_ex2 td, .t_ex2 th {border:1px solid #33904E;padding:10px}
	.t_ex2 th {background:#8FC147; color:#fff; text-align:center}
	table.t_ex2 .c1 {text-align:center}
	/*]]>*/
</style>
</head>
　　<input type="button" value="go back" onclick="location.href='/first'" />
	<br/>
<body>
	<table class="t_ex2">
	<tr>
	<th class="c1">index</th>
	<th class="c1">name</th>
	<th class="c1">finalScore</th>
	<th class="c1">middleScore</th>
	</tr>
	${list_results}
	</table>
</body>
</html>