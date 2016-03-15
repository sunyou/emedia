<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/html/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>emedia接口工具</title>
		<meta name="keywords" content="emedia" />
		<meta name="description" content="emedia" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<%@ include file="/html/common/header.jsp" %>
	</head>

	<body>
		<%@ include file="/html/common/top.jsp" %>
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
	
			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>
	
				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>
	
					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>
	
							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>
	
							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>
	
							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>
	
						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>
	
							<span class="btn btn-info"></span>
	
							<span class="btn btn-warning"></span>
	
							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->
					<!-- menu -->
					<%@ include file="/html/common/menu.jsp" %>
					<!-- menu end -->
					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>
			
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>
				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>
	
						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="#">首页</a>
							</li>
							<li class="active">接口工具</li>
						</ul><!-- .breadcrumb -->
	
						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="icon-search nav-search-icon"></i>
								</span>
							</form>
						</div><!-- #nav-search -->
					</div>
					<div class="page-content">
						<div class="col-md-12">
							<div class="widget-box">
								<div class="widget-header widget-header-flat">
									<h4 class="smaller">
										接口模拟调用
									</h4>
								</div>
								<div class="widget-body">
									<div class="widget-main">
										<form class="form-horizontal" role="form" id="intfForm">
											<div class="form-group" >
												<label class="control-label col-md-1 col-xs-12 col-sm-3 no-padding-right" for="method">Method:</label>
												<div class="col-xs-12 col-sm-9 col-md-1">
													<select id="method" name="method">
														<option value="POST">POST</option>
														<option value="GET">GET</option>
														<option value="PUT">PUT</option>
														<option value="DELETE">DELETE</option>
													</select>
												</div>
												<label class="control-label col-md-1 col-xs-12 col-sm-3 no-padding-right" for="stationName">接口地址:</label>
												<div class="col-xs-12 col-sm-9 col-md-8">
													<input type="text" id="intfUrl" name="intfUrl" placeholder="" class="col-xs-12 col-sm-6 col-md-12" value="" />
												</div>
												<div class="col-xs-12 col-sm-9 col-md-1">
													<button type="button" class="btn btn-sm btn-success" id="send">
														发送
													</button>
												</div>
											</div>
											<div class="form-group" >
												<label class="control-label col-md-1 col-xs-12 col-sm-3 no-padding-right" for="input">输入:</label>
												<div class="col-xs-12 col-sm-9 col-md-11">
													<textarea id="input" name="input" rows="5" class="autosize-transition form-control"></textarea>
												</div>
											</div>
											<div class="form-group" >
												<label class="control-label col-md-1 col-xs-12 col-sm-3 no-padding-right" for="output">输出:</label>
												<div class="col-xs-12 col-sm-9 col-md-11">
													<textarea id="output" name="output" rows="5" class="autosize-transition form-control"></textarea>
												</div>
											</div>
											<!-- <div class="form-group" >
												<label class="control-label col-md-1 col-xs-12 col-sm-3 no-padding-right" for="decrypt">解密信息:</label>
												<div class="col-xs-12 col-sm-9 col-md-11">
													<textarea id="decrypt" name="decrypt" rows="5" class="autosize-transition form-control"></textarea>
												</div>
											</div> -->
										</form>
									</div>
								</div>
							</div>
						</div>
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
				<%@ include file="/html/common/ace-setting.jsp" %>
			</div><!-- /.main-container-inner -->
	
			<%@ include file="/html/common/footer.jsp" %>
		</div><!-- /.main-container -->


		<%@ include file="/html/common/js.jsp" %>
		<script src="/emedia/statics/business/intf/index.js"></script>
		<script type="text/javascript">
		
		</script>
</body>
</html>