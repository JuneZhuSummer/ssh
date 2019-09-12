<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/24
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <%--<script>--%>
        <%--document.all("form").setAttribute("action", "userAction_query.action");--%>
    <%--</script>--%>
</head>
<body>
<form action="userAction_query.action" method="post" id="form" name="myForm">
    用户名：<input type="text" name="uid"/>
    密码：<input type="password" name="upwd"/>
    <input type="button" value="登录">
</form>
</body>
</html>
