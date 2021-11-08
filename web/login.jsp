<%--
  Created by IntelliJ IDEA.
  User: Beetle
  Date: 2021/11/8
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<==========用户登录==========>
<form action="LoginServlet" method="post">
    用户名:<input type="text" name="username"><br>
    密码：<input type="password" name="pwd"><br>
    <input type="submit" value="登录"><a href="in_user.jsp">注册</a>
</form>
</body>
</html>
