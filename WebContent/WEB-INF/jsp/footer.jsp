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
<meta charset="utf-8" />
<title>Insert title here</title>
</head>
<body>
	<footer>
	<div class="container clearfix">
		<ul class="list-social pull-right">
			<li><a class="icon-1" href="#"></a></li>
			<li><a class="icon-2" href="#"></a></li>
			<li><a class="icon-3" href="#"></a></li>
			<li><a class="icon-4" href="#"></a></li>
		</ul>
		<div class="privacy pull-left">
			Powered by @ www.wuaymeiju.com <a href="https://www.wuyameiju.com/"
				target="_blank">乌鸦美剧</a>
		</div>
	</div>
	</footer>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>