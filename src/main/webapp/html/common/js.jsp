<%@ page contentType="text/html;charset=UTF-8" %>

<!-- basic scripts -->

<!--[if IE]>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<![endif]-->

	<!--[if !IE]> -->

	<script type="text/javascript">
		window.jQuery || document.write("<script src='${ctx}/statics/assets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
	</script>

	<!-- <![endif]-->

	<!--[if IE]>
	<script type="text/javascript">
	 window.jQuery || document.write("<script src='${ctx}/statics/assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");
	</script>
<![endif]-->

<script type="text/javascript">
	if("ontouchend" in document) document.write("<script src='${ctx}/statics/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
</script>
<script src="${ctx}/statics/assets/js/bootstrap.min.js"></script>
<script src="${ctx}/statics/assets/js/typeahead-bs2.min.js"></script>

<!-- page specific plugin scripts -->

<!--[if lte IE 8]>
  <script src="${ctx}/statics/assets/js/excanvas.min.js"></script>
<![endif]-->

<script src="${ctx}/statics/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
<script src="${ctx}/statics/assets/js/jquery.ui.touch-punch.min.js"></script>
<script src="${ctx}/statics/assets/js/jquery.slimscroll.min.js"></script>
<script src="${ctx}/statics/assets/js/jquery.easy-pie-chart.min.js"></script>
<script src="${ctx}/statics/assets/js/jquery.sparkline.min.js"></script>
<script src="${ctx}/statics/assets/js/flot/jquery.flot.min.js"></script>
<script src="${ctx}/statics/assets/js/flot/jquery.flot.pie.min.js"></script>
<script src="${ctx}/statics/assets/js/flot/jquery.flot.resize.min.js"></script>

<!-- ace scripts -->

<script src="${ctx}/statics/assets/js/ace-elements.min.js"></script>
<script src="${ctx}/statics/assets/js/ace.min.js"></script>

<script src="${ctx}/statics/assets/js/jquery.gritter.min.js"></script>

<!-- date picker -->
<script src="${ctx}/statics/assets/js/date-time/moment.min.js"></script>
<script src="${ctx}/statics/assets/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="${ctx}/statics/assets/js/date-time/bootstrap-timepicker.min.js"></script>
<script src="${ctx}/statics/assets/js/date-time/daterangepicker.min.js"></script>

<script src="${ctx}/statics/assets/js/jquery.validate.min.js"></script>

<script src="${ctx}/statics/assets/js/bootbox.min.js"></script>

<script type="text/javascript">
var GLOBAL = {
	    WEBROOT:"${ctx}"
	};
</script>
