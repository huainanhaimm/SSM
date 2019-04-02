<%--
  Created by IntelliJ IDEA.
  User: minmin
  Date: 2019/3/19
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试页面</title>
</head>
<body>

    <%--发送请求--%>
    <form action="/test.do" method="post">
        <label>请输入你要查询的id：</label><input type="text" name="id">
        <button type="submit"> 提交</button>
    </form>
</body>
</html>
