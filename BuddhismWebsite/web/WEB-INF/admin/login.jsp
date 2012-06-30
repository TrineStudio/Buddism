<%-- 
    Document   : login
    Created on : 2012-6-28, 22:24:52
    Author     : GodBlessedMay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath(); 
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员登陆</title>
<link href="<%=path%>/admin/styles/layout.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/admin/styles/login.css" rel="stylesheet" type="text/css" />
<!-- Theme Start -->
<link href="<%=path%>/admin/themes/blue/styles.css" rel="stylesheet" type="text/css" />
<!-- Theme End -->

</head>
<body>
	<div id="logincontainer">
    	<div id="loginbox">
        	<div id="loginheader">
            	<img src="<%=path%>/admin/themes/blue/img/cp_logo_login.png" />
            </div>
            <div id="innerlogin">
            	<form action="logIn">
                	<p>管理员帐号:</p>
                	<input type="text" name="userName" class="logininput" />
                    <p>密码:</p>
                	<input type="password" name="password" class="logininput" />
                   
                   	<input type="submit" class="loginbtn" value="登陆" /><br />
                    <p><a href="#" title="忘记密码?">忘记密码?</a></p>
                </form>
            </div>
        </div>
        <img src="<%=path%>/admin/img/login_fade.png" alt="Fade" />
    </div>
</body>
</html>