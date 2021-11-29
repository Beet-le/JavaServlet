<%--
  Created by IntelliJ IDEA.
  User: Beetle
  Date: 2021/11/9
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    id:<input type="text" readonly="readonly" value="<%=request.getParameter("id")%>"/><br>
    username:<input type="text" name="username" value="<%=request.getParameter("name")%>"/>
    password:<input type="text" name="pwd" value="<%=request.getParameter("pwd")%>"/>
</form>
</body>
</html>
