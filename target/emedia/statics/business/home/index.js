var emedia = {};
;$(function(){
	"use strict";
	
	emedia.home = function(){
		this.initConnectBtn();
		this.initPage();
		this.initRetrieveGiftBtn();
	}
	
	emedia.home.prototype = {
		constructor:emedia.home,
		initPage:function(){
			var that = this;
			if(document.cookie && $("#connected").val() == "true"){
				var cookies = document.cookie.split(";");
				for (var i = 0,len = cookies.length;i < len; i++ ) {
					var cookie = cookies[i].replace(" ","").split("=");
					$("#"+cookie[0]).val(cookie[1]);
				}
				if($("#ip").val() != '' && $("#mac").val() != ''){
					$("#networkBtn").html('已连接');
					$("#networkBtn").unbind("click");
					$(".nav").children().each(function(i){
						if(i != 0)$(this).remove();
					});
					$(".nav").append('<li><a href="#app">下载APP</a></li>')
							 .append('<li><a href="#qrcode">获取礼品二维码</a></li>');
					$("#app").toggle();
					$("#qrcode").toggle();
					$("ul li").click(function(){
						$(this).siblings().removeClass("active");
						$(this).addClass("active");
					});
					that.loadApplist();
				}
			}
		},
		initConnectBtn:function(){
			var parent = this;
			$("#networkBtn").click(function(){
				var that = this;
//				if($(that).html() == '断开连接'){
//					return parent.disconnectWifi(that);
//				}
				if(document.cookie){
					var cookies = document.cookie.split(";");
					for (var i = 0,len = cookies.length;i < len; i++ ) {
						var cookie = cookies[i].replace(" ","").split("=");
						$("#"+cookie[0]).val(cookie[1]);
					}
				}
				//调用信息上报服务
				$.ajax({
					type: "POST",
					url: "/emedia/home/wifi/connect.action",
					data: {
						"mac":$("#mac").val()
					},
					success: function(msg){
						if(msg.rspCode == "0000"){
							$(that).html('已连接');
							$(that).unbind("click");
							$(".nav").children().each(function(i){
								if(i != 0)$(this).remove();
							});
							$(".nav").append('<li><a href="#app">下载APP</a></li>')
									 .append('<li><a href="#qrcode">获取礼品二维码</a></li>');
							$("#app").toggle();
							$("#qrcode").toggle();
							$("ul li").click(function(){
								$(this).siblings().removeClass("active");
								$(this).addClass("active");
							});
							parent.loadApplist();
						}else{
							parent.showMsg(msg.rspMsg);
						}
					},
					error:function(){
						parent.showMsg("WIFI服务超时");
					}
				});
			});
		},
		disconnectWifi:function(obj){
			var parent = this;
			$(obj).html('我要上网');
			$(".nav").children().each(function(i){
				if(i != 0)$(this).remove();
			});
			$("#app").toggle();
			$("#qrcode").toggle();
			$.ajax({
				type: "POST",
				url: "/emedia/home/wifi/disconnect.action",
				data: null,
				success: function(msg){
					if(msg.rspCode == "0000"){
						//document.cookie = "ip=''; mac=''; acId=''; acName=''; acDesc=''; ";
						$("#ip").val('');
						$("#mac").val('');
						$("#apId").val('');
						$("#apName").val('');
						$("#apDesc").val('');
					}else{
						parent.showMsg("连接断开异常");
					}
				},
				error:function(){
					parent.showMsg("服务超时");
				}
			});
			return false;
		},
		loadApplist:function(){
			var that = this;
			$.ajax({
				type: "GET",
				url: "/emedia/home/applist.action",
				data: "wifiIp="+$("#acId").val(),
				success: function(msg){
					if(msg.rspCode == "0000"){
						var list = msg.data;
						$("#app > div.jumbotron").children().each(function(i){
							if(i != 0)$(this).remove();
						});
						for (var i = 0,len = list.length; i < len; i++) {
							var p = $('<p>');
							var a = $('<a class="btn btn-primary btn-lg" href="javascript:void(0);" role="button">'+list[i].appName+'</a>');
							var appid = list[i].appId;
							var downloadUrl = list[i].downloadUrl;
							$(a).click(function(e){
								e.preventDefault();
								that.downloadRecord(appid,downloadUrl)
							});
							$("#app > div.jumbotron").append(p.append(a));
						}
					}else{
						that.showMsg(msg.rspMsg);
					}
				}
			});
		},
		downloadRecord:function(appId,downloadUrl){
			var that = this;
			$.ajax({
				type: "POST",
				url: "/emedia/home/download/record.action",
				data: {
					"appId":appId,
					"mac":$("#mac").val()
				},
				success: function(msg){
					if(msg.rspCode == "0000"){
						window.open(downloadUrl);//打开downloadUrl下载页面
						//window.open('http://www.baidu.com');
					}else{
						that.showMsg(msg.rspMsg);
					}
				}
			});
		},
		initRetrieveGiftBtn:function(){
			var that = this;
			$("#retrieveGiftBtn").click(function(){
				that.retrieveFreeGift();
			});
		},
		retrieveFreeGift:function(){
			var that = this;
			$.ajax({
				type: "POST",
				url: "/emedia/home/gift/qrcode.action",
				data: {
					"mac":$("#mac").val()
				},
				success: function(msg){
					console.log(msg);
					if(msg.rspCode == "0000"){
						var qrcode = msg.qrcode;
						$('#qrcodeTable').html('');
						$('#qrcodeTable').qrcode({
							render	: "table",
							text	: qrcode ,
							width   : 256
						});	
						$('#modal').reveal({
						     animation: 'fadeAndPop',                   //fade, fadeAndPop, none
						     animationspeed: 300,                       //how fast animtions are
						     closeonbackgroundclick: true,              //if you click background will modal close?
						     dismissmodalclass: 'close-reveal-modal'    //the class of a button or element that will close an open modal
						});
					}else{
						that.showMsg(msg.rspMsg);
					}
				}
			});
		},
		showMsg:function(message){
			$.alert({
				title: '提示',
				content: message,
				animation: 'rotate',
				closeAnimation: 'right',
				opacity: 0.5
			});
		}
	};

	var homectrl = new emedia.home();
});