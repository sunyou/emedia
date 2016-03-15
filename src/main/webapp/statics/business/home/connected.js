var emedia = {};
;$(function(){
	"use strict";
	
	emedia.connected = function(){
		this.loadApplist();
		this.initRetrieveGiftBtn();
	}
	
	emedia.connected.prototype = {
		constructor:emedia.connected,
		loadApplist:function(){
			var that = this;
			$.ajax({
				type: "GET",
				url: "/emedia/home/applist.action",
				data: "wifiIp="+$("#apId").val(),
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

	new emedia.connected();
});