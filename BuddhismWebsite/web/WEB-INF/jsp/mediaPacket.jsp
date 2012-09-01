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
                    
                        <div class="article clear">
                            <div class="location">
                                <s:property value="nav" escape="false"/>
                            </div>


                            <div class="photo-list">
                                <s:iterator value="albums" id="packet">


                                    <div class="block f16 cb1">
                                        <div class="img"></div>
                                        <div class="title cw f12">
                                            <s:if test="type==5">
                                                <a href="photoListAction?packetId=<s:property value="id"/>&title=<s:property value="packetTitle"/>"><s:property value="packetTitle"/></a>
                                            </s:if>
                                            <s:else>
                                                <a href="mediumAction?packetId=<s:property value="id"/>&title=<s:property value="packetTitle"/>"><s:property value="packetTitle"/></a>
                                            </s:else>
                                        </div>
                                    </div>

                                </s:iterator>
                            </div>
                            <div class="dashline" ></div>


                        </div>


                </div>
                <%@include file="/jsp/right_nav.jsp" %>
            </div>
            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>

