<%-- 
    Document   : viewphotos
    Created on : 2012-8-30, 23:31:39
    Author     : EthanPan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.buddhism.model.Post"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>照片浏览</title>
        <style>

            /* Demo styles */
            html,body{background:#7e2626;margin:0;}
            body{border-top:4px solid #000;}
            .content{color:#ffffff;font:12px "helvetica neue",arial,sans-serif;width:880px;margin:20px auto;}
            h1{font-size:16px;font-weight:normal;color:#ddd;margin:5;}
            p{margin:0 0 20px}
            a {color:#ffffff;text-decoration:none;}
            .cred{margin-top:20px;font-size:11px;}

            /* This rule is read by Galleria to define the gallery height: */
            #galleria{height:520px}

        </style>

        <!-- load jQuery -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js"></script>

        <!-- load Galleria -->
        <script src="<%=path%>/galleria/galleria-1.2.7.min.js"></script>

    </head>
    <body>
        <div class="content">
            <h1>相册名</h1>
            <p>相册描述</p>

            <!-- Adding gallery images. We use resized thumbnails here for better performance, but it’s not necessary -->

            <div id="galleria">

                <s:iterator value="medium" id="media">
                    <p>

                        <img src="<s:property value="mediaUrl" />" />
                    </p>
                </s:iterator>


            </div>

            <p class="cred"><<<a href="#">返回相册列表</a>.</p>
        </div>

        <script>

            // Load the classic theme
            Galleria.loadTheme('<%=path%>/galleria/galleria.classic.min.js');

            // Initialize Galleria
            Galleria.run('#galleria');

        </script>
    </body>
</html>
