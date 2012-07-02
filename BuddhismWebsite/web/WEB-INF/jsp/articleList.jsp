<%-- 
    Document   : articleList
    Created on : 2012-7-1, 1:44:26
    Author     : GodBlessedMay
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
    <title><s:property value="title"/></title>
</head>
    <body>
        <div class="wrapper">
        <%@ include file="/jsp/banner_nav.jsp" %>
        <div class="content">
            <div class="primary">
                <s:iterator id="singlePost" value="posts">
                    <p><a href="articlePage?id=${id}" style="color: black"><s:property value="postTitle"/></a></p>
                </s:iterator>   
            </div>
            <%@include file="/jsp/right_nav.jsp" %>
        </div>
        <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>

