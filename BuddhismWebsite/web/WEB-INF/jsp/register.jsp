<%-- 
    Document   : newAdminstration
    Created on : 2012-5-3, 14:51:34
    Author     : Trine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
    <script type='text/javascript' src='js/dropdown.js'></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type='text/javascript' src='js/picture_show.js'></script>	
    <title>加入我们</title>
</head>
    <body>
        <s:if test="#session.User == null">
            请以管理员身份登入。
        </s:if>     
        <s:else>
        <%
            java.util.HashMap map = new java.util.LinkedHashMap();
            map.put(0,"超级管理员");
            map.put(1,"管理员");
            request.setAttribute("map",map);
            request.setAttribute("aa","2");
        %>
            
        <div class="wrapper">
        <%@ include file="/jsp/banner_nav.jsp" %>
        <s:form action="register.action">
            <s:textfield name="userName" label="用户名" required="true"/>
            <s:password name="password" label="密码" required="true"/>
            <s:password name="passwordAck" label="确认密码" required="true"/>
            <s:select list="#request.map" label="选择身份" listKey="key" listValue="value" headerKey="0" name="statue"/>
            <s:submit value="注册"/>
            <s:submit value="取消" method="cancel"/>
        </s:form>
        
        <%@include  file="/jsp/footer.jsp" %>
        </div>
        </s:else>
    </body>
</html>