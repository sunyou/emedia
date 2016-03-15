<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/html/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>500错误页面 </title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->
		<link href="/emedia/statics/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="/emedia/statics/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
		<!-- page specific plugin styles -->
		<!-- fonts -->
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
		<!-- ace styles -->
		<link rel="stylesheet" href="/emedia/statics/assets/css/ace.min.css" />
		<link rel="stylesheet" href="/emedia/statics/assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="/emedia/statics/assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->
		<!-- ace settings handler -->
		<script src="assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body>
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<div class="main-content" style="margin-left:0px;">
					<div class="row">
						<div class="col-xs-12 col-md-12">
							<!-- PAGE CONTENT BEGINS -->

							<div class="error-container">
								<div class="well">
									<h1 class="grey lighter smaller">
										<span class="blue bigger-125">
											<i class="icon-random"></i>
											500
										</span>
										${error }
									</h1>

									<hr />
									<h3 class="lighter smaller">
										请检查
										<i class="icon-wrench icon-animated-wrench bigger-125"></i>
										，重新尝试!
									</h3>

									<div class="space"></div>

									<div>
										<h4 class="lighter smaller">另外，您可以尝试:</h4>

										<ul class="list-unstyled spaced inline bigger-110 margin-15">
											<li>
												<i class="icon-hand-right blue"></i>
												关闭浏览器，重新打开连接
											</li>

											<li>
												<i class="icon-hand-right blue"></i>
												联系我们
											</li>
										</ul>
									</div>

									<hr />
									<div class="space"></div>

									<div class="center">
										<a href="#" class="btn btn-grey">
											<i class="icon-arrow-left"></i>
											返回
										</a>

										<a href="#" class="btn btn-primary">
											<i class="icon-dashboard"></i>
											谢谢支持
										</a>
									</div>
								</div>
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
			</div><!-- /.main-container-inner -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='/emedia/statics/assets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='/emedia/statics/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="/emedia/statics/assets/js/bootstrap.min.js"></script>
		<script src="/emedia/statics/assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->

		<script src="/emedia/statics/assets/js/ace-elements.min.js"></script>
		<script src="/emedia/statics/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
</body>
</html>
