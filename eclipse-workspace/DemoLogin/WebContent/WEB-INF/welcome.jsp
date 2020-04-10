<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.spe.forms.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome<%=((UserForm)request.getAttribute("userForm")).getUsername()%>

<a href="/DemoLogin/">返回重新登录</a>
</body>
</html>