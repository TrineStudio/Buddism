<%-- 
    Document   : articlePage
    Created on : 2012-6-30, 16:09:57
    Author     : GodBlessedMay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
    <script type='text/javascript' src='js/dropdown.js'></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type='text/javascript' src='js/picture_show.js'></script>	
    <title><s:property value="post.postTitle" /></title>
</head>
    <body>
        <div class="wrapper">
            <%@ include file="/jsp/banner_nav.jsp" %>
            <h2><s:property value="post.postTitle" /></h2>
            <p style="color:black"><s:property value="post.postContent" escape="false"/></p>
            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>
