<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + 
			":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/header.js"> </script>
</head>
<body onLoad="checkCookie()">
	<div class="spinner"></div>
	<header>
	<div class="container clearfix">
		<div class="row">
			<div class="span12">
				<div class="navbar navbar_">
					<div class="container">
						<h1 class="brand brand_">
							<a href="index.do"><img alt=""
								src="img/logo.gif"> </a>
						</h1>
						<a class="btn btn-navbar btn-navbar_" data-toggle="collapse"
							data-target=".nav-collapse_">列表 <span class="icon-bar"></span>
						</a>
						<div class="nav-collapse nav-collapse_  collapse">
							<ul class="nav sf-menu">
								<li class="active"><a href="index.do">首页</a></li>
								<li class="sub-menu"><a href="#">排行榜</a>
									<ul>
										<li><a href="#">综合播放 </a></li>
										<li><a href="#">最受好评</a></li>
										<li><a href="#">最多好评</a></li>
									</ul></li>
								<li><a href="#">分类</a></li>
								<li><a href="#">搜索</a></li>
								<li><a id="nameDisplay" href="javascript:void();" onclick="Blog()">登/注</a>
									<ul>
										<li><a id="log" href="Login.do">登录 </a></li>
										<li><a id="regis" href="Register.do">注册</a></li>
										<li><a id="in" href="#">Sigin</a></li>
										<li><a id="out" href="#" onclick="Out()">Sigout</a></li>
										

									</ul></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</header>
	

</body>
</html>