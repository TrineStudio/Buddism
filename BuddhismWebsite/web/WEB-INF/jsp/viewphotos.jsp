<%-- 
    Document   : viewphotos
    Created on : 2012-7-2, 19:10:26
    Author     : EthanPan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html  xmlns="http://www.w3.org/1999/xhtml" >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="all" type="text/css" href="<%=path%>/css/buddhism_page.css"/>
        <script type='text/javascript' src='<%=path%>/js/dropdown.js'></script>
        <script type="text/javascript" src="<%=path%>/js/jquery-1.7.2.min.js"></script>
        <script type='text/javascript' src='<%=path%>/js/picture_show.js'></script>

        <title>媒体列表</title>
    </head>
    <body >
        <div class="wrapper">
            <%@ include file="/jsp/banner_nav.jsp" %>
            <div class="content">
                <div class="primary">

                    <div class="article clear">
                        <div class="location">
                            影音專區>>相册列表
                        </div>


                        <div class="photo-list">
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名1</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名2</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名3</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名4</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名5</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名6</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名7</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名8</div>
                            </div>
                            <div class="block f16 cb1">
                                <div class="img"></div>
                                <div class="title cw f12">相册名9</div>
                            </div>				
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