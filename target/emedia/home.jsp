<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/html/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>smedia首页</title>
		<meta name="keywords" content="emedia" />
		<meta name="description" content="emedia" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- basic styles -->
		<link href="statics/assets/css/bootstrap.min.css" rel="stylesheet" />
		<!-- <link href="statics/assets/css/bootstrap-theme.css" rel="stylesheet" /> -->
		<link rel="stylesheet" href="statics/assets/css/font-awesome.min.css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="statics/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="statics/assets/js/html5shiv.js"></script>
		<script src="statics/assets/js/respond.min.js"></script>
		<![endif]-->
		<style type="text/css">
			body {
			  padding-top: 80px;
			}
		</style>
		
	</head>

	<body>
		<input type="hidden" id="appId"/>
		<input type="hidden" id="token"/>
		<input type="hidden" id="msg"/>
		<nav class="navbar navbar-inverse navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">smedia能力开放平台</a>
	        </div>
	        <div id="navbar" class="collapse navbar-collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="#network">获取礼品二维码</a></li>
	            <li><a href="#app">获取礼品二维码</a></li>
	            <li><a href="#qrcode">获取礼品二维码</a></li>
	            <li><a href="#coupon">优惠券</a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </nav>
	    <div class="container">
			<div class="row" id="network">
				<div class="jumbotron">
				  <h1>热点连接</h1>
				  <p id="indicator"></p>
				  <p><a class="btn btn-primary btn-lg" href="javascript:void(0);" role="button">我要上网</a></p>
				</div>
			</div>
			<div class="row" id="app">
				<div class="jumbotron">
				  <h1>APP下载</h1>
				  <p><a class="btn btn-primary btn-lg" href="javascript:void(0);" role="button">下载APP</a></p>
				</div>
			</div>
			<div class="row" id="qrcode">
				<div class="jumbotron">
				  <h1>获取礼品二维码</h1>
				  <p><a class="btn btn-primary btn-lg" href="javascript:void(0);" role="button">点击获取</a></p>
				</div>
			</div>
			<div class="row" id="coupon">
				<div class="jumbotron">
				  <h1>优惠券</h1>
				  <p>...</p>
				</div>
			</div>
	      
	
	    </div><!-- /.container -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='statics/assets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
		</script>
	
		<!-- <![endif]-->
	
		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='statics/assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");
		</script>
		<![endif]-->
		
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='statics/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="statics/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("ul li").click(function(){
					$(this).siblings().removeClass("active");
					$(this).addClass("active");
				})
			});
		</script>

	</body>
</html>

