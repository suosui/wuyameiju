<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + 
			":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath%>" />
<meta charset="utf-8">
<link rel="icon" href="img/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />
<meta name="description" content="美剧分享">
<meta name="keywords" content="美剧">
<meta name="author" content="@wuyameiju">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/responsive.css" type="text/css"
	media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css"
	media="screen">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>

<base href="<%= basePath%>" />
<script>		
   jQuery(window).load(function() {	
    jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});	
   });			
	</script>
<title>登录</title>
</head>
<body >
	<jsp:include page="../header.jsp" />
	<div class="bg-content">
		<!--============================== content =================================-->
		<div id="content">
			<div class="ic">
				更多细节 <a href="index">乌鸦美剧</a>
			</div>
			<div class="container">
				<div class="row">
					<article class="span8">
					<h3>登录</h3>
					<div class="inner-1">
						<form id="contact-form">

							<fieldset>
								<div>
									<label> <input id="phone" placeholder="手机号" value="">
										<br> <span id="spanphone1" style="display: none">*不是有效的手机号.</span>
										<span id="spanphone2" style="display: none">*请输入手机号.</span>
									</label>
								</div>
								<div>
									<label> <input id="password" type="password"
										placeholder="密码" value=""> <br> <span
										id="spanpass" style="display: none">*请输入密码.</span>
									</label>
								</div>

								<div class="buttons-wrapper">
									<a class="btn btn-1" href="javascript:void(0);" onclick="Reset()">重置</a> <a
										class="btn btn-1" href="javascript:void(0);" onclick="Post()">登录</a>
										<a class="redirect"  href="Register">注册</a>
									
								</div>


							</fieldset>
						</form>
					</div>
					</article>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
	<script type="text/javascript" src="js/login.js"></script>
	<script type="text/javascript" src="js/aes.js"></script>
	<script type="text/javascript" src="js/mode-ecb.js"></script>
</body>
</html>