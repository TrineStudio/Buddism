<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="com.buddhism.model.PicturePost"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <link rel="stylesheet" media="all" type="text/css" href="css/buddhism_page.css">
    <script type='text/javascript' src='js/dropdown.js'></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type='text/javascript' src='js/picture_show.js'></script>	
    <title>果硕普利协会</title>
    
    <script type="text/javascript">
        function loadXMLDoc()
        {
        var xmlhttp;
        if (window.XMLHttpRequest)
        {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
        }
        else
        {// code for IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange=function()
        {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
            document.getElementById("mainContent").innerHTML=xmlhttp.responseText;
            }
        }
        xmlhttp.open("POST","mainPageArticle.action",true);
        xmlhttp.send();
        }
</script>
</head>
<body >
<script type="text/javascript">
    loadXMLDoc();
</script>    
<div class="wrapper">
        <%@ include file="/jsp/banner_nav.jsp" %>
        <div class="content">
		<div class="primary">
			<div id="pictureswall_bk">
			
			<div id="pictures_bg" >
			<div id="pictures_info"></div> <!--标题-->
			<ul>
				<li class="on">1</li>
				<li>2</li>
				<li>3</li>
				<li>4</li>
			</ul>

			</div>  <!--标题背景-->
			
			<div id="pictureswall">	
			    
			   <div id="pictures">
			   </div>
			</div>
			</div>	  	
	  		<div class="three">
	  			<div class="two">
                                    <div class="left">
                                        <div id="left_title">甘露教言</div>
                                        <s:iterator value="buddleWords" id="buddleWord">
                                            <p><a href="articlePage?id=${id}" style=" color: black"><s:property value="#buddleWord.postTitle"/></a></p>
                                        </s:iterator>
                                    </div>
                                    <div class="right">
                                        <div id="left_title">正法蘭若</div>
                                        <s:iterator value="temples" id="temples">
                                            <p><a href="articlePage?id=${id}" style="color:black"><s:property value="postTitle"/></a></p>
                                        </s:iterator>
                                        </div>
                                    </div>
	  			<div class="last">
	  			<div id="left_title">清涼共享</div>
                                    <s:iterator value="shares" id="shares">
                                        <p><a href="articlePage?id=${id}" style="color:black"><s:property value="postTitle"/></a></p>
                                    </s:iterator>
	  			</div>
	  		</div>
		</div>
		<div class="secondly">
			<div class="teacherbox">
                            <div id="right_title">指導上師</div>

                            </div>
			<div class="notificationbox">
			<div id="right_title">重要公告</div>
                                <s:iterator value="informs" id="informs">
                                    <p><a href="articlePage?id=${id}" style="color:black"><s:property value="postTitle"/></a></p>
                                </s:iterator>                     
			</div>
			<div class="newsbox">
                        <div id="right_title">最新法訊</div>
                            <s:iterator value="lastestMessage" id="lastestMessage">
                                <p><a href="articlePage?id=${id}" style="color:black"><s:property value="postTitle"/></a></p>
                            </s:iterator>                            
			</div>
			<div class="supportbox">
			<div id="right_title">贊助護持</div>
			</div>
			
		</div>
                <!--文章列表-->
                <div id="mainContent">
                </div>
                <a href="#" onclick="loadXMLDoc()" ><div id="viewmore">瀏覽更多資訊</div></a>


</div>

        <%@include  file="/jsp/footer.jsp" %>
</div>
</body>
</html>
     
