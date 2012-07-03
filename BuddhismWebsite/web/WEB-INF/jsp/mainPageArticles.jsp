<%-- 
    Document   : mainPageArticles
    Created on : 2012-6-30, 22:55:30
    Author     : GodBlessedMay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>



<s:iterator id="post" value="posts">
<div class="item">
    <a href="articlePage?id=${id}&&index=-1&&parentType=${postCategory}"><div class="title f16 cr1"><s:property value="postTitle" /></div></a>
    <div class="content"><s:property  value="postContent" escape="false"/></div>
</div>
    
</s:iterator>

