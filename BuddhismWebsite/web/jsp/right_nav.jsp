<%-- 
    Document   : right_nav
    Created on : 2012-7-2, 14:47:12
    Author     : GodBlessedMay
--%>

<%@page import="com.buddhism.model.Post"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<div class="secondly">

    <div class="block">
        <div id="right_title">指導上師</div>
        <h3>right</h3>
        <p>sdfasdfasdfasdfsadfasdfasdf</p>
    </div>
    <div class="block">
        <div id="right_title">重要公告<div id="more"><a href="articleList.action?&&type=1">更多</a></div></div>
        <%
            List<Post> informs = (List<Post>) session.getAttribute("informs");
            for (int i = 0; i != informs.size(); i++) {
        %>
        <p><a href="articlePage?id=<%= informs.get(i).getId()%>&&parentType=1&&index=-1" style="color:black"><%= informs.get(i).getPostTitle()%></a></p>
        <%
            }
        %>
    </div>
    <div class="block">
        <div id="right_title">最新法訊<div id="more"><a href="articleList.action?type=13">更多</a></div></div>
        <%
            List<Post> lastestMessages = (List<Post>) session.getAttribute("messages");
            for (int i = 0; i != lastestMessages.size(); i++) 
            {
        %>
        <p><a href="articlePage?id=<%= lastestMessages.get(i).getId()%>&&parentType=13&&index=-1" style="color:black"><%= lastestMessages.get(i).getPostTitle()%></a></p>
        <%
            }
        %>    
    </div>
    <div class="block">    
        <div id="right_title">贊助護持<div id="more"><a href="articleList.action?type=17">更多</a></div></div>
        <%
            List<Post> supports = (List<Post>) session.getAttribute("supports");
            for (int i = 0; i != supports.size(); i++) 
            {
        %>
        <p><a href="articlePage?id=<%= supports.get(i).getId()%>&&parentType=17&&index=-1" style="color:black"><%= supports.get(i).getPostTitle()%></a></p>
        <%
            }
        %>             
    </div>
</div>
