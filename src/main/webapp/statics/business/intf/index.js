var emedia = {};
;$(function(){
	"use strict";
	
	emedia.intf = function(){
		this.initSendBtn();
	}
	
	emedia.intf.prototype = {
		constructor:emedia.intf,
		initSendBtn:function(){
			var that = this;
			$("#send").click(function(){
				$.ajax({
					type: "POST",
					url: "/emedia/intf/method/call.action",
					data: {
						"method":$("#method").val(),
						"intfUrl":$("#intfUrl").val(),
						"input":$("#input").val()
					},
					success: function(msg){
						console.log(msg);
						if(msg.rspCode == "0000"){
							$("#output").text(msg.output);
						}else{
							that.showMsg(msg.rspMsg);
						}
					}
				});
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

	new emedia.intf();
});