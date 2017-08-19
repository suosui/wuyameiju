<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + 
			":" + request.getServerPort() + request.getContextPath() + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>

<head>
<base href="<%= basePath%>" />
<title>乌鸦美剧</title>

<meta charset="utf-8">
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


<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>

<script src='js/jquery-1.8.1.min.js' type='text/javascript'></script>
<script src='js/jquery.kwicks.js' type='text/javascript'></script> 
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>

<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/touchTouch.jquery.js"></script>

<script type="text/javascript">if($(window).width()>1024){document.write("<"+"script src='js/jquery.preloader.js'></"+"script>");}	</script>
<script type="text/javascript" src="js/view-video.js"></script>
<script>		
		 jQuery(window).load(function() {
			 
		 $x = $(window).width();		
	if($x > 1024)
	{			
	jQuery("#content .row").preloader();    }	
		 
     jQuery('.magnifier').touchTouch();			
    jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});	
    
  		  }); 
				
	</script>

<title>出错啦！</title>

</head>

<body>
	<jsp:include page="header.jsp" />

<div class="bg-content">
		<div class="container">
			<div class="row">
				<div class="span13">
				
				</div>
			</div>
		</div>
		</div>


<jsp:include page="footer.jsp" />


</body>
</html>