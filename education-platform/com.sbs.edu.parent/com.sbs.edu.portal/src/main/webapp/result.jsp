<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sbs.edu.basic.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作选择</title>
</head>
<body>
	<%
	    if (null == session.getAttribute("user"))
	    {
	        response.sendRedirect("login.jsp");
	        return;
	    }
	%>
	<p>
		<a href="query.jsp">查询</a>
	</p>
	<%
	    User user = new User();
	    user = (User)session.getAttribute("user");
	    if ("admin".equals(user.getName())) //判断是不是系统管理员，不是就不显示修改这个超链接
	    {
	%>
	<p>
		<a href="update.jsp">修改</a>
	</p>
	<%
	    }
	%>
</body>
</html>