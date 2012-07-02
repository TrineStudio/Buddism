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
                    <div class="article clear">
				<div class="location">
                                    <s:property value="nav" escape="false"/>
				</div>
				<div class="article_title">
                                    <s:property value="post.postTitle" />
				</div>
				
				<div class="article_content">
                                    <s:property value="post.postContent" escape="false"/>
				</div>
				<div class="article_share">
					<!-- JiaThis Button BEGIN -->
					<div id="ckepop">
						<a class="jiathis_button_qzone"></a>
						<a class="jiathis_button_tsina"></a>
						<a class="jiathis_button_tqq"></a>
						<a class="jiathis_button_renren"></a>
						<a class="jiathis_button_kaixin001"></a>
						<a href="http://www.jiathis.com/share?uid=1641922" class="jiathis jiathis_txt jtico jtico_jiathis" target="_blank"></a>
						<a class="jiathis_counter_style"></a>
					</div>
					<script type="text/javascript">var jiathis_config = {data_track_clickback:true};</script>
					<script type="text/javascript" src="http://v3.jiathis.com/code/jia.js?uid=1334590586743539" charset="utf-8"></script>
					<!-- JiaThis Button END -->				
					</div>
			</div>

                </div>
                <%@include file="/jsp/right_nav.jsp" %>
            </div>
            <%
            int index = (Integer)session.getAttribute("index");
            
            if (index != -1)
            {
                List<Post> posts = (List<Post>)session.getAttribute("posts");

                int nextId = -1;
                int previousId = -1;
                int nextIndex = -1;
                
                if (index != 0)
                    previousId = posts.get(index - 1).getId();
                
                if (index < posts.size() - 1 && index >= 0)
                    nextId = posts.get(index + 1).getId();
                
                if (previousId != -1)
                {
                    nextIndex = index - 1;
            %>
            <a href="articlePage?id=<%=previousId%>&&index=<%=nextIndex%>" style="color:black">上一页</a>
            <%
                }
                
                if (nextId != -1)
                {
                    nextIndex = index + 1;
            %>
            <a href="articlePage?id=<%=nextId%>&&index=<%=nextIndex%>" style="color:black">下一页</a>
            <%
                }     
            }                      
            %>
            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>
