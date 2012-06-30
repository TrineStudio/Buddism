
	var t = n = 0, count;
	$(document).ready(function(){	
		count=$("#pictures a").length;
		$("#pictures a:not(:first-child)").hide();
		$("#pictures_info").html($("#pictures a:first-child").find("img").attr('alt'));
		$("#pictures_info").click(function(){window.open($("#pictures a:first-child").attr('href'), "_blank")});
	
	$("#pictures_bg li").click(function() {

			var i = $(this).text() - 1;//获取Li元素内的值，即1，2，3，4
			n = i;
			if (i >= count) return;
			$("#pictures_info").html($("#pictures a").eq(i).find("img").attr('alt'));
			$("#pictures_info").unbind().click(function(){window.open($("#pictures a").eq(i).attr('href'), "_blank")})
			$("#pictures a").filter(":visible").fadeOut(500).parent().children().eq(i).fadeIn(1000);
			document.getElementById("pictures_bg").style.background="";
			$(this).toggleClass("on");
			$(this).siblings().removeAttr("class");
		});
		t = setInterval("showAuto()", 4000);
		$("#pictures_bg").hover(function(){clearInterval(t)}, function(){t = setInterval("showAuto()", 4000);});
	});
	
	function showAuto()
	{
		n = n >=(count - 1) ? 0 : ++n;
		$("#pictures_bg li").eq(n).trigger('click');
	}
