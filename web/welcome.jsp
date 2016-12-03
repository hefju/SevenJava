<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rush
  Date: 2016-12-01
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
welcome:${ Xxx.$username$ }$username$

<h1>Struts 2 ActionError & ActionMessage示例</h1>
<s:if test="hasActionMessages()">
    <div class="welcome">
        <s:actionmessage />
    </div>
</s:if>
<h4>
    <s:property value="getText('welcome.hello')" />
    <s:property value="username" />
</h4>
</body>
</html>
