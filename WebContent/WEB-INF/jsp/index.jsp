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
<link rel="stylesheet" href="css/jquery.kwicks.css" type="text/css"
	media="screen">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>

<link rel='stylesheet' type='text/css' href='css/jquery.kwicks.css' />
<link rel='stylesheet' type='text/css' href='css/kwicks-slider.css' />

<script src='js/jquery-1.8.1.min.js' type='text/javascript'></script>
<script src='js/jquery.kwicks.js' type='text/javascript'></script> 
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>

<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/touchTouch.jquery.js"></script>
<script type="text/javascript" src="js/index.js"></script>

<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript">if($(window).width()>1024){document.write("<"+"script src='js/jquery.preloader.js'></"+"script>");}	</script>

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

<!--[if lt IE 8]>
  		<div style='text-align:center'><a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/img/upgrade.jpg"border="0"alt=""/></a></div>  
 	<![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<!--<![endif]-->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link rel="stylesheet" href="css/ie.css" type="text/css" media="screen">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400' rel='stylesheet' type='text/css'>
  <![endif]-->
  
<title>首页</title>

</head>

<body>
	<jsp:include page="header.jsp" />
	<div class="bg-content">
		<div class="container">
			<div class="row">
				<div class="span12">
					<!--============================== slider =================================-->
					<div >
						<ul class='kwicks kwicks-horizontal'>
			             <li id="l0" class='kwicks-seleted'></li>
			             <li id="l1" class='kwicks-selected'></li>
			             <li id="l2" class='kwicks-selected'></li>
			             <li id="l3"class='kwicks-selected'></li>
			             <li id="l4"class='kwicks-selected'></li>
		               </ul>
						
					</div>
					<span id="responsiveFlag"></span>
					<div class="block-slogan">
						<h2>美剧放送</h2>
						<div>
							<p>
								<a href="https://www.wuyameiju.com/ " target="_blank"
									class="link-1">想看更多</a> 这里有你想看的美剧！这里有你想要的内容！
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!--============================== content =================================-->

		<div id="content" class="content-extra">
			<div class="ic">
				More Website Templates at <a href="http://www.cssmoban.com/">Website
					Template</a>
			</div>
			<div class="row-1">
				<div class="container">
					<div class="row">
						<ul class="thumbnails thumbnails-1">
							<li class="span3">
								<div class="thumbnail thumbnail-1">
									<h3>Fashion</h3>
									<img src="img/page1-img1.jpg" alt="">
									<section> <strong>At vero eos et accusamus
										et iusto </strong>
									<p>Odio dignissimos ducimus qui blanditiis praesentium
										voluptatum.</p>
									<a href="#" class="btn btn-1">Read More</a> </section>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail thumbnail-1">
									<h3>Nature</h3>
									<img src="img/page1-img2.jpg" alt="">
									<section> <strong>Deleniti atque corrupti
										quos</strong>
									<p>Dolores et quas molestias excepturi sint occaecati
										cupiditate non provident.</p>
									<a href="#" class="btn btn-1">Read More</a> </section>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail thumbnail-1">
									<h3>Love story</h3>
									<img src="img/page1-img3.jpg" alt="">
									<section> <strong>Similique sunt in culpa
										qui officia </strong>
									<p>Deserunt mollitia animi, id est laborum et dolorum fuga.</p>
									<a href="#" class="btn btn-1">Read More</a> </section>
								</div>
							</li>
							<li class="span3">
								<div class="thumbnail thumbnail-1">
									<h3 class="title-1 extra">Fine art</h3>
									<img src="img/page1-img4.jpg" alt="">
									<section> <strong>Similique sunt in culpa
										qui officia</strong>
									<p>Deserunt mollitia animi, id est laborum et dolorum fuga.</p>
									<a href="#" class="btn btn-1">Read More</a> </section>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="container">
				<div class="row">
					<article class="span6">
					<h3>Shortly about me</h3>
					<div class="wrapper">
						<figure class="img-indent">
						<img src="img/page1-img5.jpg " alt="" /></figure>
						<div class="inner-1 overflow extra">
							<div class="txt-1">Sed ut perspictis unde omnis natus error
								volupatem accusantium doloue laudantium, totam rem.</div>
							Aperiam, eaque ipsa quae ab illo veritatis et beatae vitae dicta
							sunt explicabo nemo enim ipsam voluptatem quia voluptas sit
							aspernatur aut odit aut fugit, sed
							<div class="border-horiz"></div>
							<div class="overflow">
								<ul class="list list-pad">
									<li><a href="#">Campaigns</a></li>
									<li><a href="#">Portraits</a></li>
									<li><a href="#">Fashion</a></li>
									<li><a href="#">Fine Art</a></li>
								</ul>
								<ul class="list">
									<li><a href="#">Advertising</a></li>
									<li><a href="#">Lifestyle</a></li>
									<li><a href="#">Love story</a></li>
									<li><a href="#">Landscapes</a></li>
								</ul>
							</div>
						</div>
					</div>
					</article>
					<article class="span6">
					<h3>Latest photoshoots</h3>
					<ul class="list-photo">
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img6.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img7.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img8.jpg " alt="" /></a></li>
						<li class="last"><a href="img/image-blank.png"
							class="magnifier"><img src="img/page1-img9.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img10.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img11.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img12.jpg " alt="" /></a></li>
						<li class="last"><a href="img/image-blank.png"
							class="magnifier"><img src="img/page1-img13.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img14.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img15.jpg " alt="" /></a></li>
						<li><a href="img/image-blank.png" class="magnifier"><img
								src="img/page1-img16.jpg " alt="" /></a></li>
						<li class="last"><a href="img/image-blank.png"
							class="magnifier"><img src="img/page1-img17.jpg " alt="" /></a></li>
					</ul>
					</article>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
	
</body>
</html>
