<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rush
  Date: 2016-12-01
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Hello World - Home</title>
  </head>
  <body>
  <h1>Hello World From XNA</h1>
  <div class="container">
      <s:form action="login">
          <s:textfield label="Username" name="username"></s:textfield>
          <s:textfield label="Password" name="password"></s:textfield>
          <s:submit></s:submit>
      </s:form>
  </div>

  </body>
</html>
