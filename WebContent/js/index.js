/**
 * 
 */
function slide()
{
	$.ajax({
		type : 'get',
		url : 'slide',
		dataType : 'json',
		success : function(jsons) {
			if (jsons) {
				
				 $.each(jsons, function (i, items) {  //遍历获取数据
		     
		                var li = $('<li></li>');
		                
		                
						li.append($(' <img src="' + items.imgsrc + '"  alt="">'));
						
						$('#slide').append(li);
						
		            });

			} else {
				window.alert("获取失败!");
			}
		},
		error : function(XMLHttpRequest, textStatus,
				errorThrown) {

			alert('获取失败！');
			
		}
	});
	}
