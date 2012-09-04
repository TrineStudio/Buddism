<%-- 
    Document   : photoList
    Created on : 2012-6-29, 22:14:27
    Author     : EthanPan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<%
    String path = request.getContextPath(); 
%> 
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>相册管理</title>
<link href="<%=path%>/admin/styles/layout.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/admin/styles/wysiwyg.css" rel="stylesheet" type="text/css" />
<!-- Theme Start -->
<link href="<%=path%>/admin/themes/blue/styles.css" rel="stylesheet" type="text/css" />
<!-- Theme End -->
<script type="text/javascript" src="http://dwpe.googlecode.com/svn/trunk/_shared/EnhanceJS/enhance.js"></script>	
<script type='text/javascript' src='http://dwpe.googlecode.com/svn/trunk/charting/js/excanvas.js'></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery.magnifier.js"></script>
<script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js'></script>
<script type='text/javascript' src='<%=path%>/admin/scripts/jquery.wysiwyg.js'></script>
<script type='text/javascript' src='<%=path%>/admin/scripts/visualize.jQuery.js'></script>
<script type="text/javascript" src='<%=path%>/admin/scripts/functions.js'></script>
</head>
<body id="homepage">
	<div id="header">
    	<a href="" title=""><img src="<%=path%>/admin/img/cp_logo.png" alt="Control Panel" class="logo" /></a>
    	<div id="searcharea">
            <form action="findArticles">
                <input type="text" class="searchbox" value="输入查询内容" name="keyWords" onclick="if (this.value =='输入查询内容'){this.value=''}"/>
                <input type="submit" value="查找" class="searchbtn" />
            </form>
        </div>
    </div>
        
    <!-- Top Breadcrumb Start -->
    <div id="breadcrumb">
    	<ul>	
        	<li><img src="<%=path%>/admin/img/icons/icon_breadcrumb.png" alt="Location" /></li>
        	<li><strong>当前位置:</strong></li>
            <li><a href="#" title="">图片管理</a></li>
            <li>/</li>
            <li class="current">相册管理</li>
        </ul>
    </div>
    <!-- Top Breadcrumb End -->
     
    <!-- Right Side/Main Content Start -->
    <div id="rightside">

        <div class="contentcontainer" >
        <div class="headings">
            <h2>相册</h2>
        </div>
         <div class="contentbox">
             <form action="getPhotoByType">
                <s:select list="catList" name="packetId" listKey="catId" listValue="catName" emptyOption="false" /> <input type="submit" value="确定" class="btn" /> 
            </form>
             <a href="newAlbum.action?type=0" style="color:black">添加相册</a>
            <p>
                <label for="textfield"><strong></strong></label>
                <strong>相册名:&nbsp;</strong><input type="text" id="smallbox" class="inputbox smallbox" /><br/>
                <strong>&nbsp;&nbsp;&nbsp;描述:&nbsp;</strong><textarea type="text" id="textfield" class="inputbox" style="height:50px;"></textarea> 
            </p>
            <input type="submit" value="更改" class="btn" />
           </div>
       	</div>      
        <!-- Alternative Content Box Start -->
         <div class="contentcontainer">
            <div class="headings altheading">
                <h2>照片列表</h2>
            </div>
            <div class="contentbox"> 
                    <table width="100%">
                	<thead>
                    	<tr>
                            <th></th>
                            <th>描述</th>
                            <th>作者</th>
                            <th>时间</th>
                            <th>操作</th>
                            <th><input name="" type="checkbox" value="" id="checkboxall" /></th>
                        </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="media" value="medium">
                            <tr>
                                <td><img src="<s:property value="mediaUrl" />" width="80px" height="80px"  class="magnify"  data-magnifyby="2" /></td>
                                <td><s:property value="mediaDesc"/></td>
                                <td><s:property value="administrator.adName"/></td>
                                <td><s:property value="mediaDate"/></td>
                                <td>
                                    <a href="addMediaDes?mediaId=<s:property value="id" />" title=""><img src="<%=path%>/admin/img/icons/icon_edit.png" alt="Edit" /></a>
                                    <a href="deletePhoto?mediaId=<s:property value="id" />" title=""><img src="<%=path%>/admin/img/icons/icon_delete.png" alt="Delete" /></a>
                                </td>
                                <td><input type="checkbox" value="" name="checkall" /></td>
                            </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                    <div class="extrabottom">
                	<ul>
                            <li><img src="<%=path%>/admin/img/icons/icon_edit.png" alt="Edit" /> 编辑</li>
                            <li><img src="<%=path%>/admin/img/icons/icon_delete.png" alt="Delete" /> 删除</li>
                        </ul>
                    <div class="bulkactions">
                
                    	<select>
                            <option>操作</option>
                        </select>
                        <input type="submit" value="应用" class="btn" />
                    </div>
                </div>
                <ul class="pagination">
                               <s:if test="currentIndex != 0">
                        <li class="text"><a href="previousPhotoPage">前一页</a></li>
                    </s:if>
                    <li class="page"><a href="#" title=""><s:property value="currentIndex + 1"/></a></li>
                    <%
                    
                        int currentIndex = (Integer)request.getAttribute("currentIndex");
                        int maxIndex = (Integer)(request.getAttribute("maxIndex"));
                    
                        int pageCount = maxIndex - currentIndex;
     
                        if (pageCount > 3)
                            pageCount = 3; 
                        
                        for (int i = 0; i < pageCount; i++)
                        {
                            
                            
                    %>
                        <li><a href="JumpToPhotoList.action?currentIndex=<%=currentIndex + i%>" title=""><%=i + currentIndex + 1%></a></li>
                    <%
                        }
                    %>
                    <s:if test="currentIndex >= maxIndex">
                        <li class="text"><a href="nextPhotoPage" title="">后一页</a></li>
                    </s:if>
                </ul>
                <div style="clear: both;"></div>
            </div>
            
        </div>
        <!-- Alternative Content Box End -->
        
        <div style="clear:both;"></div>

        
        <div id="footer">
        	&copy; Copyright 2012 
        </div> 
          
    </div>
    <!-- Right Side/Main Content End -->
    
        <!-- Left Dark Bar Start -->
    <div id="leftside">
    	<div class="user">
        	<img src="<%=path%>/admin/img/avatar.png" width="44" height="44" class="hoverimg" alt="Avatar" />
            <p>帐户信息</p>
            <p class="username"></p>
            <p class="userbtn"><a href="#" title="">资料</a></p>
            <p class="userbtn"><a href="logOut" title="">登出</a></p>
        </div>

        <ul id="nav">
        	<li>
                <ul class="navigation">
                    <li><a href="adminIndex">网站状态</a></li>
                </ul>
            </li>
            <li>
                <a class="collapsed heading">文章管理</a>
                 <ul class="navigation">
                    <li><a href="newPage" title="">发布文章</a></li>
                    <li><a href="managementAction" title="">文章列表</a></li>
                    <li><a href="articleTrash" title="">文章回收站</a></li>
                </ul>
            </li>
            <li><a class="collapsed heading">图片管理</a>
                <ul class="navigation">
                    <li><a href="addPhoto" title="">上传照片</a></li>
                    <li  class="heading selected">相册管理</li>
                </ul>
            </li>
            <li><a class="collapsed heading">视频管理</a>
                <ul class="navigation">
                    <li><a href="addVideo" title="">上传视频</a></li>
                    <li><a href="videoPage" title="">视频管理</a></li>
                </ul>
            </li>
            <li><a class="collapsed heading">帐户管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">用户资料</a></li>
                    <s:if test="#session.User.adLevel == 0">
                        <li><a href="register" title="">添加帐户</a></li>
                    </s:if>
                </ul>
            </li>            
        </ul>
    </div>
    <!-- Left Dark Bar End --> 
   
    <!-- Notifications Box/Pop-Up End --> 
    
 
    
    <!--[if IE 6]>
    <script type='text/javascript' src='scripts/png_fix.js'></script>
    <script type='text/javascript'>
      DD_belatedPNG.fix('img, .notifycount, .selected');
    </script>
    <![endif]--> 
</body>
</html>

