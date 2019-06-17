<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Score Data</title>
</head>
<style type="text/css">
	/*<![CDATA[*/
	table.t_ex2 {background:#D9E5FF; width:90%; margin:0 auto; text-align:right}
	.t_ex2 td, .t_ex2 th {border:1px solid #fff;padding:5px}
	.t_ex2 th {background:#3162C7; color:#fff; text-align:center}
	table.t_ex2 .c1 {text-align:center} 
	/*]]>*/
	a {padding: 10px 30px; display: inline-block; margin: 5px; background: #3162C7; color: #FFF; border-radius: 5px; text-decoration: none; font-weight: bold;}
</style>
<body>
　　<a href="input_student">학생데이터 입력하기</a><br /><br />
<table class="t_ex2">
	<tr>
		<th class="c1">
			idx
		</th>
		<th class="c1">
			이 름
		</th>
		<th class="c1">
			주 소
		</th>
		<th class="c1">
			생 일
		</th>
	</tr>
	${select_result}
</table>
<br />
　　　　　　　${count_result}
</body>
</html>