<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<title><s:text name="loginPage" /></title>
</head>
<body>
	<s:form action="register">
		<s:textfield name="user.name" key="user" />
		<s:textfield name="user.password" key="pass" />
		<s:submit key="register" />
	</s:form>
</body>
</html>