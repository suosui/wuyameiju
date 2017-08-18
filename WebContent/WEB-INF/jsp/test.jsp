<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	
	
    <link href="css/bootstrap.css" rel="stylesheet" />
 
	<link href="js/login-register.css" rel="stylesheet" />
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
	
	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/login-register.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>  
<form action="uploadtest" method="post" enctype="multipart/form-data">  
<input type="file" name="file" /> 
<input id="videoname" class="input" type="text" placeholder="资源名称" name="videoname">
 <input id="link" class="input" type="text" placeholder="资源链接" name="link">
 <input id="linkpass" class="input" type="text" placeholder="链接密码" name="linkpass">
<input type="submit" value="Submit" /></form>  
 <button id="button1">提交</button>
</body>  

<script type="text/javascript" src="js/register.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
		$("#button1").click(function(){
			
			var hideForm = $('form');
			
			var options = {
			dataType : 'json',
			//url:'AddVideo',
			type : 'POST',
			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
			//data: {"file": $("input[type=file]").val(),"userphone":'18844141934',"videoname":$('#videoname').val(),"link":$('#link').val(),"linkpass":$('#linkpass')},
			beforeSubmit : function() { 
			alert("正在上传"); 
			}, 
			success : function(obj) { 
				//alert(obj.link);
			alert('成功上传！'); 
			}, 
			error : function(XMLHttpRequest, textStatus, errorThrown) { 
				
			  alert('上传失败！');
			  alert('XMLHttpRequest.status: '+ XMLHttpRequest.status);
	          alert('XMLHttpRequest.readyState: '+ XMLHttpRequest.readyState);
	          alert('textStatus: '+ textStatus);
	          alert('errorThrown: '+errorThrown);
	          } 
			}; 
			hideForm.ajaxSubmit(options);
		});
		</script>
</html>