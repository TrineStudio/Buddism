<%-- 
    Document   : right_nav
    Created on : 2012-7-2, 14:47:12
    Author     : GodBlessedMay
--%>

<%@page import="com.buddhism.model.Post"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<div class="secondly">
        <div class="teacherbox">
            <div id="right_title">指導上師</div>

            </div>
        <div class="notificationbox">
        <div id="right_title">重要公告</div>
            <%
                List<Post> informs = (List<Post>)session.getAttribute("informs");
                for (int i = 0; i != informs.size(); i++)
                {
            %>
                    <p><a href="articlePage?id=<%= informs.get(i).getId() %>" style="color:black"><%= informs.get(i).getPostTitle() %></a></p>
            <%
                }
            %>
        </div>
        <div class="newsbox">
        <div id="right_title">最新法訊</div>
            <%
                List<Post> lastestMessages = (List<Post>)session.getAttribute("messages");
                for (int i = 0; i != lastestMessages.size(); i++)
                {
            %>
                    <p><a href="articlePage?id=<%= lastestMessages.get(i).getId() %>" style="color:black"><%= lastestMessages.get(i).getPostTitle() %></a></p>
            <%
                }
            %>                            
        </div>
        <div class="supportbox">
        <div id="right_title">贊助護持</div>
        </div>

</div>