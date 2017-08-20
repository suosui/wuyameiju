/**
 * 
 */

		
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for (var i = 0; i < strs.length; i++) {
            theRequest[strs[i].split("=")[0]] = decodeURIComponent(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}

$(document).ready(function() {
	var a=GetRequest();
	
	var id=a['id'];
	//$('.span13').load("view.do",{"idVideo":id}, function(){ 
	//	$(".span13").fadeIn('slow');} );
	
	$.get("view.do",{"idVideo":id},
			  function(json){
			   if(json)
				   {
				   setCookie(setCookie('vid', json.idVideo, 1));
				        var ul = $('<ul>');
				        ul.append($('<li class="id">' + json.idVideo + '</li>'));
						ul.append($('<li>' + json.videoname + '</li>'));
						ul.append($('<li>' + json.date + '</li>'));
						
						ul.append($('<img src="'+json.imgsrc+'"></img>'));
						ul.append($('<li><a class="rederict">' + json.link + '</a></li>'));
						ul.append($('<div><li><a class="pass">密码:</a><a class="display"></a></li><div>'));
						
						$('.span13').append(ul);
				   }
			  },"json");
	
});
$(document).click(function (e) 
		{ 
	     var cls = $(e.target).attr('class'); 
	     if(cls=="rederict")
		     {

	    	 window.location.href = e.target.innerHTML;
	    	  
		     }
	         
	} )
	
	
	
$(document).click(function (e) 
		{ 
	     var cls = $(e.target).attr('class'); 
	     var phone = getCookie('phone');
	     var p = getCookie('p');
	     if(p)
	    	 {
	    	 if(cls=="pass")
	    		 {
	    		 $.ajax({
	 	 	 		type : 'post',
	 	 	 		url : 'GetPass.do',
	 	 	 		data : {
	 	 	 			'phone' : phone
	 	 	 		},
	 	 	 		datatype : "json",
	 	 	 		success : function(obj) {
	 	 	 			if (p == obj.password) {
	 	 	 				 var id = getCookie('vid');
	 	 	 				 $.get("getLinkPass.do",{"idVideo":id},
	 	 	 			            function(json){
	 	 	 			    		   if (json) {
	 	 	 			    			   var ul = $('<ul>');
	 	 	 						        
	 	 	 							   ul.append($('<div><li>'+json.linkpass+'</li><div>'));
	 	 	 								
	 	 	 								$('.span13').append(ul);

	 	 	 		    				} else {
	 	 	 		    					window.alert("密码获取失败!");
	 	 	 		    					
	 	 	 		    				}
	 	 	 			    				  },"json");
	 	 	 				
	 	 	 			} else if (obj.password == 'error') {
	 	 	 				alert("用户不存在，请先注册！");
	 	 	 			} else if(p != obj.password){
	 	 	 			
	 	 	 				alert("密码错误！请先登录！");
	 	 	 				window.location="Login.do";
	 	 	 			}
	 	 	 		},
	 	 	 		error : function(obj) {
	 	 	 				alert("出错啦！");
	 	 	 			
	 	 	 		}
	 	 	 	});
	    		 }
	    	
	    	 }
	     else
	    	 {
	    	     alert("请先登录！");
	    	     window.location="Login.do";
	    	 }
	    
	     
	     
	     
	         
	} )



