<%@ page import="com.stx.px.modle.UserModle" %>
<%@ page import="com.stx.px.dao.UserDao" %>
<%@ page import="java.util.ArrayList" %><%--
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
<table border="1">
    <tr>
        <td>ID</td>
        <td>用户</td>
        <td>密码</td>
        <td>操作 </td>
    </tr>
<%
    UserDao user=new UserDao();
    ArrayList list =user.selecttall();
    for (int i = 0; i < list.size(); i++) {
        UserModle modle2=(UserModle) list.get(i);
%>
<tr>
    <td><%= modle2.getStuid()%></td>
    <td><%= modle2.getUsername()%></td>
    <td><%= modle2.getPassword()%></td>
    <td>
        <a href="in_user.jsp"> 添加</a>
        <a> 修改</a>
        <a href="DelServlet z" > 删除</a>


    </td>
</tr>
    <%}%>
</table>
</body>
</html>
