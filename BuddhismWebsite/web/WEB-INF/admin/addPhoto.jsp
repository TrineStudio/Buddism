<%-- 
    Document   : addPhoto
    Created on : 2012-7-2, 17:09:54
    Author     : EthanPan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<%
    String path = request.getContextPath();
%>     
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<%=path%>/admin/styles/layout.css" rel="stylesheet" type="text/css" />
        <link href="<%=path%>/admin/styles/wysiwyg.css" rel="stylesheet" type="text/css" />
        <!-- Theme Start -->
        <link href="<%=path%>/admin/themes/blue/styles.css" rel="stylesheet" type="text/css" />
        <!-- Theme End -->

        <link href="<%=path%>/css/uploadify.css" rel="stylesheet" type="text/css" />

        <script type="text/javascript" src="<%=path%>/js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="<%=path%>/js/jquery.uploadify-3.1.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $("#fileupload").uploadify({
                    /*注意前    面需要书写path的代码*/ 

                    'swf'            : '<%=path%>/images/uploadify.swf', 
                    'uploader'       : '<%=path%>/upload', 
                    'cancelImg'      : '<%=path%>/images/uploadify-cancel.png', 
                    'method'         : 'post',
                    'formData'       :{'type':$('#type').val()},
                    'queueID'        : 'fileQueue',  //和存放队列的DIV的id一致 
                    'fileObjName'    : 'fileupload', //和以下input的name属性一致 
                    'auto'           : false, //是否自动开始 
                    'multi'          : true, //是否支持多文件上传 
                    'buttonText'     : '上传照片', //按钮上的文字 
                    'fileSizeLimit'  : '5MB', //设置单个文件大小限制5m 
                    'queueSizeLimit' : 5, //队列中同时存在的文件个数限制 
                    'fileTypeDesc'       : '支持格式:jpg/gif/jpeg/png/bmp.', //如果配置了以下的'fileExt'属性，那么这个属性是必须的 
                    'fileTypeExt'        : '*.jpg;*.gif;*.jpeg;*.png;*.bmp',//允许的格式   
                    'onUploadSuccess'    : function(file, data, response) { 
//                        filepath =eval("(" + data + ")");                  
//                        alert("成功上传照片！");
//                        $("#photolist").after("<img src='"+filepath+"' width=\"200px\"/>");
                    }, 
                    'onUploadError' : function(file, errorCode, errorMsg, errorString) {
                        // $.facebox('文件' + file.name + '不能上传' + errorString);
                        alert('文件' + file.name + '不能上传 ' + errorString);
            
                    },
                    'onCancel' : function(file) {
                        // $.facebox('文件 ' + file.name + '取消了上传');
                        alert("cancel");
                    } 
                }); 

            })
        </script>
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
            <li class="current">上传图片</li>
            
        </ul>
    </div>
    <!-- Top Breadcrumb End -->
     
    <!-- Right Side/Main Content Start -->
    <div id="rightside">

        
        <div class="contentbox">
            <s:select list="catList" name="type" listKey="catId" listValue="catName" id="type" emptyOption="false" />
            <input type="file" name="fileupload" id="fileupload" />
            <a  href="javascript:$('#fileupload').uploadify('upload','*')" ><input type="button" value="上传" class="btn" /></a>
            <a  href="javascript:$('#fileupload').uploadify('cancel')"><input type="button" value="清空上传列表" class="btn" /></a>
            <div id="fileQueue"></div>
            <div id="photolist"></div>
         </div>        
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
                <a class="expanded heading">文章管理</a>
                 <ul class="navigation">
                    <li><a href="newPage" title="">发布文章</a></li>
                    <li><a href="managementAction" title="">文章列表</a></li>
                    <li><a href="articleTrash" title="">文章回收站</a></li>
                </ul>
            </li>
            <li><a class="expanded heading">相册管理</a>
                <ul class="navigation">
                    <li class="heading selected">上传照片</li>
                    <li><a href="photoPage" title="">相册管理</a></li>
                </ul>
            </li>
            <li><a class="collapsed heading">视频管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">上传视频</a></li>
                    <li><a href="#" title="">视频管理</a></li>
                </ul>
            </li>            
            <li><a class="expanded heading">帐户管理</a>
                <ul class="navigation">
                    <li><a href="#" title="">用户资料</a></li>
                    <s:if test="#session.User.adLevel == 0">
                        <li><a href="#" title="">添加帐户</a></li>
                    </s:if>
                </ul>
            </li>    
        </ul>
    </div>
    <!-- Left Dark Bar End --> 
   
    <!-- Notifications Box/Pop-Up End --> 
    
    <script type="text/javascript" src="http://dwpe.googlecode.com/svn/trunk/_shared/EnhanceJS/enhance.js"></script>	
    <script type='text/javascript' src='http://dwpe.googlecode.com/svn/trunk/charting/js/excanvas.js'></script>
    <script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.6/jquery-ui.min.js'></script>
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
