<%-- 
    Document   : photoList
    Created on : 2012-6-29, 22:14:27
    Author     : EthanPan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
</head>
<body id="homepage">
	<div id="header">
    	<a href="" title=""><img src="<%=path%>/admin/img/cp_logo.png" alt="Control Panel" class="logo" /></a>
    	<div id="searcharea">
            
            <input type="text" class="searchbox" value="输入查询内容" onclick="if (this.value =='输入查询内容'){this.value=''}"/>
            <input type="submit" value="查找" class="searchbtn" />
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
            <select>
            	<option>相册名</option>
            </select>
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
                    	<tr>
                        	<td><img src="http://hdn.xnimg.cn/photos/hdn121/20120124/0020/h_tiny_nokg_7a9100041fd82f75.jpg" width="80px" height="80px"/></td>
                            <td>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam.</td>
                            <td>ethan</td>
                            <td>2012-6-20</td>
                            <td>
                            	<a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_edit.png" alt="Edit" /></a>
                                <a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_delete.png" alt="Delete" /></a>
                            </td>
                            
                            <td><input type="checkbox" value="" name="checkall" /></td>
                        </tr>
                        <tr class="alt">
                        	<td><img src="http://hdn.xnimg.cn/photos/hdn121/20120124/0020/h_tiny_nokg_7a9100041fd82f75.jpg" width="80px" height="80px"/></td>
                            <td>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam.</td>
                            <td>ethan</td>
                            <td>2012-6-20</td>
                            <td>
                            	<a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_edit.png" alt="Edit" /></a>
                                <a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_delete.png" alt="Delete" /></a>
                            </td>
                            <td><input type="checkbox" value="" name="checkall" /></td>
                        </tr>
                        <tr>
                        	<td><img src="http://hdn.xnimg.cn/photos/hdn121/20120124/0020/h_tiny_nokg_7a9100041fd82f75.jpg" width="80px" height="80px"/></td>
                            <td>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam.</td>
                            <td>ethan</td>
                            <td>2012-6-20</td>
                            <td>
                            	<a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_edit.png" alt="Edit" /></a>
                                <a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_delete.png" alt="Delete" /></a>
                            </td>
                            <td><input type="checkbox" value="" name="checkall" /></td>
                        </tr>
                         <tr class="alt">
                        	<td><img src="http://hdn.xnimg.cn/photos/hdn121/20120124/0020/h_tiny_nokg_7a9100041fd82f75.jpg" width="80px" height="80px"/></td>
                            <td>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam.</td>
                            <td>ethan</td>
                            <td>2012-6-20</td>
                            <td>
                            	<a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_edit.png" alt="Edit" /></a>
                                <a href="#" title=""><img src="<%=path%>/admin/img/icons/icon_delete.png" alt="Delete" /></a>
                            </td>
                            <td><input type="checkbox" value="" name="checkall" /></td>
                        </tr>
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
                	<li class="text">前一页</li>
                    <li class="page"><a href="#" title="">1</a></li>
                    <li><a href="#" title="">2</a></li>
                    <li><a href="#" title="">3</a></li>
                    <li><a href="#" title="">4</a></li>
                    <li class="text"><a href="#" title="">后一页</a></li>
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
                    <li><a href="#" title="">上传照片</a></li>
                    <li  class="heading selected">相册管理</li>
                </ul>
            </li>
            <li><a class="collapsed heading">视频管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">上传视频</a></li>
                    <li><a href="#" title="">视频管理</a></li>
                </ul>
            </li>
            <li><a class="collapsed heading">帐户管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">用户资料</a></li>
                    <li><a href="#" title="">添加帐户</a></li>
                </ul>
            </li>            
        </ul>
    </div>
    <!-- Left Dark Bar End --> 
   
    <!-- Notifications Box/Pop-Up End --> 
    
    <script type="text/javascript" src="http://dwpe.googlecode.com/svn/trunk/_shared/EnhanceJS/enhance.js"></script>	
    <script type='text/javascript' src='http://dwpe.googlecode.com/svn/trunk/charting/js/excanvas.js'></script>
	<script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js'></script>
    <script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js'></script>
	<script type='text/javascript' src='<%=path%>/admin/scripts/jquery.wysiwyg.js'></script>
    <script type='text/javascript' src='<%=path%>/admin/scripts/visualize.jQuery.js'></script>
    <script type="text/javascript" src='<%=path%>/admin/scripts/functions.js'></script>
    
    <!--[if IE 6]>
    <script type='text/javascript' src='scripts/png_fix.js'></script>
    <script type='text/javascript'>
      DD_belatedPNG.fix('img, .notifycount, .selected');
    </script>
    <![endif]--> 
</body>
</html>

