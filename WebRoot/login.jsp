<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>同域sso单点登录</title>
</head>
<body>
	<center>
		<form action="/sso/doLogin.action" method="POST">
			<h1>请登录</h1>
			<span>用户名：</span><input type="text" name="username"/>
			<span>密码：</span><input type="password" name="password"/>
			<input type="hidden" name="gotoUrl" value="${gotoUrl}"/>
			<input type="submit"/>
		</form>
	</center>
</body>
</html>