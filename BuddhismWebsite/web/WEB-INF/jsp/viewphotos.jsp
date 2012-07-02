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
        <link rel="stylesheet" href="<%=path%>/galleriffic/css/basic.css" type="text/css" />
        <link rel="stylesheet" href="<%=path%>/galleriffic/css/galleriffic-2.css" type="text/css" />
        <script type="text/javascript" src="<%=path%>/galleriffic/js/jquery.galleriffic.js"></script>
        <script type="text/javascript" src="<%=path%>/galleriffic/js/jquery.opacityrollover.js"></script>			
        <title>照片浏览</title>
    </head>
    <body >
        <div class="wrapper">
            <%@ include file="/jsp/banner_nav.jsp" %>

            <div id="container">
                <span style="font-size: 28px;">相册名称 &nbsp;&nbsp;<a href="#" style="font-size:16px ;" class="cr1">返回相册列表</a></span>

                <h3>相册描述</h3>
                <br/>
                <!-- Start Advanced Gallery Html Containers -->
                <div id="gallery" class="content">
                    <div id="controls" class="controls"></div>
                    <div class="slideshow-container">

                        <div id="loading" class="loader">

                        </div>
                        <div id="slideshow" class="slideshow"></div>
                    </div>
                    <div id="caption" class="caption-container"></div>
                </div>
                <div id="thumbs" class="navigation">
                    <ul class="thumbs noscript">
                        <li>
                            <a class="thumb" name="leaf" href="http://farm4.static.flickr.com/3261/2538183196_8baf9a8015.jpg" title="Title #0">

                                <img src="http://farm4.static.flickr.com/3261/2538183196_8baf9a8015_s.jpg" alt="Title #0" />

                            </a>
                            <div class="caption">

                                <div class="image-title">Title #0</div>
                                <div class="image-desc">Description</div>
                            </div>
                        </li>

                        <li>
                            <a class="thumb" name="drop" href="http://farm3.static.flickr.com/2404/2538171134_2f77bc00d9.jpg" title="Title #1">
                                <img src="http://farm3.static.flickr.com/2404/2538171134_2f77bc00d9_s.jpg" alt="Title #1" />
                            </a>
                            <div class="caption">
                                Any html can be placed here ...
                            </div>
                        </li>



                        <li>
                            <a class="thumb" href="http://farm2.static.flickr.com/1260/930424599_e75865c0d6.jpg" title="Title #23">
                                <img src="http://farm2.static.flickr.com/1260/930424599_e75865c0d6_s.jpg" alt="Title #23" />
                            </a>
                            <div class="caption">
                                <div class="download">
                                    <a href="http://farm2.static.flickr.com/1260/930424599_e75865c0d6_b.jpg">Download Original</a>
                                </div>
                                <div class="image-title">Title #23</div>
                                <div class="image-desc">Description</div>
                            </div>
                        </li>
                    </ul>
                </div>
                <div style="clear: both;"></div>
            </div>
            <script type="text/javascript">
                jQuery(document).ready(function($) {
                    // We only want these styles applied when javascript is enabled
                    $('div.navigation').css({'width' : '280px', 'float' : 'left'});
                    $('div.content').css('display', 'block');
	
                    // Initially set opacity on thumbs and add
                    // additional styling for hover effect on thumbs
                    var onMouseOutOpacity = 0.67;
                    $('#thumbs ul.thumbs li').opacityrollover({
                        mouseOutOpacity:   onMouseOutOpacity,
                        mouseOverOpacity:  1.0,
                        fadeSpeed:         'fast',
                        exemptionSelector: '.selected'
                    });
					
                    // Initialize Advanced Galleriffic Gallery
                    var gallery = $('#thumbs').galleriffic({
                        delay:                     2500,
                        numThumbs:                 15,
                        preloadAhead:              10,
                        enableTopPager:            true,
                        enableBottomPager:         true,
                        maxPagesToShow:            7,
                        imageContainerSel:         '#slideshow',
                        controlsContainerSel:      '#controls',
                        captionContainerSel:       '#caption',
                        loadingContainerSel:       '#loading',
                        renderSSControls:          true,
                        renderNavControls:         true,
                        playLinkText:              '自动放映',
                        pauseLinkText:             '结束放映',
                        prevLinkText:              '&lsaquo; 前一张',
                        nextLinkText:              '下一张 &rsaquo;',
                        nextPageLinkText:          '下一页 &rsaquo;',
                        prevPageLinkText:          '&lsaquo; 前一页',
                        enableHistory:             false,
                        autoStart:                 false,
                        syncTransitions:           true,
                        defaultTransitionDuration: 900,
                        onSlideChange:             function(prevIndex, nextIndex) {
                            // 'this' refers to the gallery, which is an extension of $('#thumbs')
                            this.find('ul.thumbs').children()
                            .eq(prevIndex).fadeTo('fast', onMouseOutOpacity).end()
                            .eq(nextIndex).fadeTo('fast', 1.0);
                        },
                        onPageTransitionOut:       function(callback) {
                            this.fadeTo('fast', 0.0, callback);
                        },
                        onPageTransitionIn:        function() {
                            this.fadeTo('fast', 1.0);
                        }
                    });
                });
            </script>

            <%@include  file="/jsp/footer.jsp" %>
        </div>
    </body>
</html>