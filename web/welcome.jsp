<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rush
  Date: 2016-12-01
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    boolean isLogin = false;
    String loginName = (String)request.getSession().getAttribute("username");
    String pwd = (String)request.getSession().getAttribute("password");


   String sid=request.getSession().getId();
//    if(loginName != null && !"".equals(loginName)){
//        isLogin = true;
//    }
//    request.setAttribute("isLogin",isLogin);
    request.setAttribute("loginName",loginName);
    request.setAttribute("pwd",pwd);
    request.setAttribute("sessionID",sid);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text"/>
你好：${loginName}, 你的密码是:${pwd}, 你的session id:${sessionID}
&nbsp;&nbsp;
<a href="<c:url value="/action/LoginAction/ShowLoginInfo.action" />">显示登录信息</a>
<a href="<c:url value="/com/gage/action/LoginAction/loginout.action" />">注销</a>


</body>
</html>
