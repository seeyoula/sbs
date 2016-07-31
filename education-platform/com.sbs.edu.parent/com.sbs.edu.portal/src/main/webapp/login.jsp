<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<style type="text/css">
#table_body {
	font-family: '宋体';
	font-size: 12px;
	margin: auto;
	width: auto;
	height: auto;
}

.table_line {
	width: 400px;
	height: 30px;
	text-align: center;
	padding-top: 5px;
}

.table_left {
	width: 100px;
	height: 35px;
	text-align: right;
	padding-top: 5px;
}

.table_right {
	width: 300px;
	height: 35px;
	padding-left: 3px;
	padding-top: 5px;
}
</style>
</head>
<body>
	<%
	    String path = request.getContextPath();
	%>
	<%
	    String errorMsg = "";
	    String uid = (String)request.getAttribute("uid");//注意和重定向的获取做区别
	    String userRole = (String)request.getAttribute("userRole");
	    if ("true".equals((String)request.getAttribute("error")))
	    {
	        errorMsg = "账号或者密码错误！";
	    }
	%>
	<form method="post" action="<%=path%>/login.action" name="login_form" style="margin-top: 200px;"
		id="login_form">
		<table border="1" cellpadding="0" cellspacing="0" id="table_body">
			<tr>
				<td colspan="2" class="table_line">用户登录</td>
			</tr>
			<tr>
				<td class="table_left">账号：</td>
				<td class="table_right"><input type="text" name="userName"
					id="userName" value="<%=null == uid ? "" : uid%>"></td>
			</tr>
			<tr>
				<td class="table_left">密码：</td>
				<td class="table_right"><input type="password" name="password"
					id="password"></td>
			</tr>
			<tr>
				<td class="table_left">权限：</td>
				<td class="table_right"><select name="role">
						<option value="1"
							<%="1".equals(userRole) ? "selected='selected'" : ""%>>普通用户</option>
						<option value="2"
							<%="2".equals(userRole) ? "selected='selected'" : ""%>>系统管理员</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" class="table_line"><input type="submit"
					name="btn" id="btn" value="登录"><label style="color: red;"><%=errorMsg%></label></td>
			</tr>
		</table>
	</form>
</body>
</html>