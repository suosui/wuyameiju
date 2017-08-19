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
		url : 'slide',
		dataType : 'json',

		success : function(jsons) {
			if (jsons) {

				$.each(jsons, function(i, items) { //遍历获取数据

					li = $('<li>');
					li.append($(' <img src="' + items.imgsrc + '" style="width: 100%" alt="">'));
				
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
