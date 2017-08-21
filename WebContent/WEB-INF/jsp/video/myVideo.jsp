<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + 
			":" + request.getServerPort() + request.getContextPath() + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<link rel="icon" href="img/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
<meta name="description" content="Your description">
<meta name="keywords" content="Your keywords">
<meta name="author" content="Your name">

	<link rel="stylesheet" href="css/bootstrap.css" type="text/css"
	media="screen">

<link rel="stylesheet" href="css/responsive.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css"
	media="screen">
	
<link rel="stylesheet" href="css/touchTouch.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/kwicks-slider.css" type="text/css"
	media="screen">
	<link rel="stylesheet" href="css/login-register.css" type="text/css"
	media="screen">
	
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>
	
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="js/jquery.kwicks-1.5.1.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/touchTouch.jquery.js"></script>
<script type="text/javascript">if($(window).width()>1024){document.write("<"+"script src='js/jquery.preloader.js'></"+"script>");}	</script>

<script>		
		 jQuery(window).load(function() {	
		 $x = $(window).width();		
	if($x > 1024)
	{			
	jQuery("#content .row").preloader();    }	
		 
     jQuery('.magnifier').touchTouch();			
    jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});
     showvideo();
  		  }); 
		 		
	</script>
<title>我的资源</title>
</head>
<body >
	<jsp:include page="../header.jsp" />


	<div style="width: 1000px;text-align:center;">
		<table class="table table-hover" id="myTab">
			<caption style="font-size: 24px;">资源列表</caption>

			<thead>
				<tr>
					<th>ID</th>
					<th>用户电话</th>
					<th>资源名</th>
					<th>资源链接</th>
					<th>创建时间</th>

				</tr>
			</thead>

 
		</table>
		<div>
		
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h6 class="modal-title" id="myModalLabel">编辑资源</h6>
					</div>
					<div class="modal-body">
					<div>
						<label for="name">名称: </label>
						<input type="text" id="name" placeholder="请输入资源名称..." />
					</div>
					<div>	
						<label for="link">链接: </label>
						<input type="text" id="link" placeholder="请输入资源链接..." />
					</div>
					<div>	
						<label for="linkpass">链接密码: </label>
						<input type="text" id="linkpass" placeholder="请输入链接密码..." />
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-1" onclick="createClass()">提交</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	
	


	<jsp:include page="../footer.jsp" />
	<script type="text/javascript" src="js/video.js"></script>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>