<%-- 
    Document   : banner_nav
    Created on : 2012-4-5, 16:02:16
    Author     : EthanPan
--%>
<%-- any content can be specified here e.g.: --%>
<%@ page pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="header"></div>
	<div>
		<ul id="nav">
                    <li><a href="mainPage.action">網站首頁</a></li>
                    <li><a href="articleList.action?type=15"rel='dropmenu1'>指導上師</a></li>
                    <li><a href="articleList.action?type=1">重要公告</a></li>
                    <li><a href="articleList.action?type=13" rel='dropmenu2'>最新法訊</a></li>
                    <li><a href="articleList.action?type=4">甘露教言</a></li>
                    <li><a href="articleList.action?type=16" rel='dropmenu3'>正法蘭若</a></li>
                    <li><a href="articleList.action?type=5">活動剪影</a></li>
                    <li><a href="articleList.action?type=17">贊助護持</a></li>
                    <li><a href="articleList.action?type=14" rel='dropmenu4'>清涼共享</a></li>   
                    <li><a href="articleList.action?type=8">影音專區</a></li>   
                    <li><a href="aboutUs.action" rel='dropmenu5'>關於我們</a></li>         
                    <li><a href="logIn.action">管理</a></li>         
		</ul>
		<script type="text/javascript">cssdropdown.startchrome("nav")</script> 
	</div>
	
	 <ul id="dropmenu1" class="dropMenu">
		<li><s:a href="articleList.action?type=9">嘉傑 果碩仁波切</s:a></li>
		<li><s:a href="articleList.action?type=10">經論講座老師 </s:a></li>
	</ul>
	<ul id="dropmenu2" class="dropMenu">
		<li><s:a href="articleList.action?type=2">协会法讯</s:a></li>
		<li><s:a href="articleList.action?type=3">行事历</s:a></li>
	</ul>
	<ul id="dropmenu3" class="dropMenu">
		<li><s:a href="articleList.action?type=11">康果洛寺</s:a></li>
		<li><s:a href="articleList.action?type=12">尼泊尔圆满法洲寺</s:a></li>
	</ul>
	<ul id="dropmenu4" class="dropMenu">
		<li><s:a href="articleList.action?type=6">智慧点滴</s:a></li>
		<li><s:a href="articleList.action?type=7">心得分享</s:a></li>
	</ul>
        <ul id="dropmenu5" class="dropMenu">
		<li><s:a href="knowUs.action">认识我们</s:a></li>
		<li><s:a href="contactUs.action">联系我们</s:a></li>
                <li><s:a href="joinUs.action">加入我们</s:a></li>
	</ul>

	
        <div id="message"></div>

