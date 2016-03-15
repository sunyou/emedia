<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="html/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>emedia控制台</title>
		<meta name="keywords" content="emedia" />
		<meta name="description" content="emedia" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<%@ include file="html/common/header.jsp" %>
		<link  rel="stylesheet" href="${ctx }/statics/assets/css/uploadify.css" />
		<style type="text/css">
    .uploadify-button {
        background-color: transparent;
        border: none;
        padding: 0;
    }
    .uploadify:hover .uploadify-button {
        background-color: transparent;
    }
</style>
	</head>

	<body>
		<%@ include file="html/common/top.jsp" %>
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
					<%@ include file="html/common/menu.jsp" %>
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
							<li class="active">控制台</li>
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
						
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
				<%@ include file="html/common/ace-setting.jsp" %>
			</div><!-- /.main-container-inner -->
	
			<%@ include file="html/common/footer.jsp" %>
		</div><!-- /.main-container -->


		<%@ include file="html/common/js.jsp" %>
		<script type="text/javascript" src="${ctx }/statics/assets/js/jquery.uploadify.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			$(function() {
				$("#uploadify").uploadify({
					'buttonClass' : 'some-class',
					'buttonText' : '添加附件',
					'fileSizeLimit' : '1000KB',
					'fileTypeExts' : '*.gif; *.jpg; *.png',
					'removeCompleted' : false,
					'fileObjName'   : 'file', 
					'onUploadStart' : function(file) {
			            $("#uploadify").uploadify("settings", "formData", {"someOtherKey":"2"});
			        },
					height        : 30,
					swf           : '${ctx }/statics/assets/js/uploadify.swf',
					uploader      : '${ctx}/file/upload.action',
					width         : 120
				});
			});
	      /*  $("#uploadify").uploadify({
	            'uploader': '${ctx }/statics/assets/js/uploadify.swf',
	            'script':"${ctx}/file/upload",
	            'cancelImg': '${ctx }/statics/assets/css/images/uploadify-cancel.png',
	            'queueID': 'fileQueue',
	            'auto': true,
	            'buttonText': 'select',
	            'simUploadLimit' : 1,
	            'queueSizeLimit' : 1,
	            'fileExt': '*.jpg;*.gif;*.jpeg;*.png;*.bmp;*.zip;*.rar;*.7z',
	            onComplete: function(event, queueID, fileObj, response, data) {
	                //转换为json对象
	                var dataObj = eval("("+response+")");
	                saveFile(dataObj);
	            },
	            onSelect:function(){
	            },
	            onError: function(event, queueID, fileObj) {
	                alert("文件:" + fileObj.name + "上传失败");
	            }
	        }); */
		});
		</script>
</body>
</html>