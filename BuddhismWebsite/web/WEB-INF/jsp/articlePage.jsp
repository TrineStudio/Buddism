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
            <div class="content">
                <div class="primary">
                    <div class="article">
				<div class="location">
				文章栏目>>文章栏目
				</div>
				<div class="article_title">
				<s:property value="post.postTitle" />
				</div>
				<div id="article_share">
				</div>
				<div class="article_content">
                                    <s:property value="post.postContent" escape="false"/>
				</div>
				<div id="article_share">
				</div>
			</div>

                </div>
                <%@include file="/jsp/right_nav.jsp" %>
            </div>
            
            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>
