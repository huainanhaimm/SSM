<%--
  Created by IntelliJ IDEA.
  User: minmin
  Date: 2019/3/19
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*"  language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>测试结果</title>
</head>
<body>

    <%--&lt;%&ndash;发送请求&ndash;%&gt;--%>
    <%--<form action="/test.do" method="post">--%>
        <%--<label>请输入你要查询的id：</label><input type="submit"> <br/>--%>
    <%--</form>--%>
    <%--结果展示--%>
    <label >查询结果展示：</label> <br/>
    &nbsp; &nbsp;<label >序号： </label> ${bean.id} <br/>
    &nbsp; &nbsp;<label >姓名：</label>  ${bean.uname} <br/>
    &nbsp; &nbsp;<label >性别：</label>  ${bean.sex} <br/>
    &nbsp; &nbsp;<label >电话：</label>  ${bean.mobile} <br/>
    &nbsp; &nbsp;<label >地址：</label>  ${bean.address} <br/>

</body>
</html>
