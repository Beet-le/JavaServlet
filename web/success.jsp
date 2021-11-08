<%@ page import="com.stx.px.modle.UserModle" %><%--
  Created by IntelliJ IDEA.
  User: Beetle
  Date: 2021/11/4
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    UserModle modle = (UserModle) request.getSession().getAttribute("loginSession");
%>
注册成功,welcom<%=modle.getUsername()%>
</body>
</html>
