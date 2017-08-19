/**
 * 
 
*/
$(function() {
				$('.kwicks').kwicks({
					minSize : 120,
					spacing : 5,
					behavior: 'slideshow'
				});
			});

$(document).ready(function() {
	$.ajax({
		type : 'get',
		url : 'slide.do',
		dataType : 'json',

		success : function(jsons) {
			if (jsons) {

				$.each(jsons, function(i, items) { //遍历获取数据

					li = $(' <img id="'+items.idVideo+'" src="' + items.imgsrc + '"  alt="">');
					//li.append($(' <img src="' + items.imgsrc + '" onclick="view()" style="width: 100%" alt="">'));
				
					$('#l'+i+'').append(li);

					

				});

			} else {
				window.alert("初始化失败!");
			}
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {

			alert('出错啦！');

		}
	});
});

$(document).click(function (e) 
		{ 
	     var id = $(e.target).attr('id'); 
	     var src = $(e.target).attr('src');
	     if(src)
		     {
	    	 window.location.href = "view/jsp.do?id="+id;
	    	  
		     }
	         
	} )
