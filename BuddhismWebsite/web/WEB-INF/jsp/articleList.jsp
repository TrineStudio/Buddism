<%-- 
    Document   : articleList
    Created on : 2012-7-1, 1:44:26
    Author     : GodBlessedMay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.buddhism.model.Post"%>
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
                    <div class="article">
                        <div class="location">
                            <s:property value="nav" escape="false"/>
                    </div>
                        <%
                            List<Post> posts = (List<Post>)session.getAttribute("posts");
                            
                            for (int i = 0; i != posts.size(); i++)
                            {
                        %>

                            <div class="article-list-item">
                                <div class="title  f16 cb1"><a href="articlePage?id=<%= posts.get(i).getId() %>&&index=<%= i %>&&parentType=<s:property value="type"/>" style="color: black"><%= posts.get(i).getPostTitle() %></a></div>
                                <div class="bold cr1">浏览次数 ; <%= posts.get(i).getPostClickTimes() %></div>
                                <div class="info cb2">asdfasdfasdfasdfasdf</div>
                            </div>
                            <div class="dashline"></div>
                        <%
                            }
                        %>
                    </div>

                </div>
                <%@include file="/jsp/right_nav.jsp" %>
            </div>
            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>

