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
  		  }); 
				
	</script>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>个人主页</title>
<meta charset="utf-8" />

	<link href="css/upload.css" rel="stylesheet" media="screen"/>
	
	<script src="js/upload.js" type="text/javascript"></script>
</head>
<body>
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
					<div><a class="redirect"  href="javascript:void()" onclick="MyVideo()">我的资源</a>
					</div>
					<div><a class="redirect"  href="javascript:void()" onclick="openLoginModal()">上传资源</a>
					</div>
					
					
					<div class="inner-1">
						<form id="contact-form">
						</form>
					</div>
					</article>
				</div>
			</div>
		</div>
	</div>



 <div class="modal fade upload" id="loginModal">
		      <div class="modal-dialog upload animated">
    		      <div class="modal-content">
    		         <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        
                    </div>
                    <div class="modal-body">  
                        <div class="box">
                             <div class="content">
                                
                                
                                <div class="error"></div>
                                <div class="form uploadBox">
                                
                                    <form id="form1" action="AddVideo"  method="post" enctype="multipart/form-data" >
                                    <input  class="input" type="text" placeholder="资源名称" name="videoname">
                                    <input  class="input" type="text" placeholder="资源链接" name="link">
                                    <input  class="input" type="text" placeholder="链接密码" name="linkpass">
                                    
                                   <div>
                                       
                                        <div style="float:left"> <a href="javascript:;" class="file">选择文件<input type="file" name="file"></a></div>
                                        <div ><input class="btn btn-1" style="display:none" type="submit" ></div>   
                                        
                                        
                                  </div>
                                    </form>
                                    <button id="button"  onclick="upload()" class="btn btn-1" >上传</button>
                                </div>
                             </div>
                        </div>
                        
                    </div>
                       
    		      </div>
		      </div>
		  </div>

		
<jsp:include page="../footer.jsp" />
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/upload.js"></script>

</body>

</html>