/**
 * 
 */
function check(userphone,pass)
{
		if(userphone==null||pass==null)
		{
		   alert("请先登录！");
		   window.location ='Login.do';
		}
	}
function showvideo() {
			var userphone = getCookie('phone');
			var pass = getCookie('p');
			check(userphone,pass);
		$.ajax({
						type : 'get',
						url : 'MyVideo.do',
						data : {
							'phone' : userphone
						},
						dataType : 'json',
						success : function(jsons) {
							if (jsons) {
								
								 $.each(jsons, function (i, items) {  //遍历获取数据
						     
						                var tr = $('<tr>');
								       
										tr.append($('<td><button class="btn btn-link" onclick="showClassMember('+items.idVideo+', 1)">'+items.idVideo+'</button></td>'))
										tr.append($('<td>' + items.userphone + '</td>'));
										tr.append($('<td>' + items.videoname + '</td>'));
										tr.append($('<td>' + items.link + '</td>'));
										tr.append($('<td>' + items.date + '</td>'));
										
										tr.append($('<td><button class="btn btn-1" onclick="deletVideo('+items.idVideo+', this)">删除</button></td>'));
										tr.append($('<td><button class="rederict" onclick="showVideo('+items.idVideo+', 1)">编辑</button> </td>'));
										
										$('#myTab').append(tr);
										
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





function deletVideo(id, ele)
{
	if(confirm("确定删除此资源?")) {
		$.ajax({
			type: 'get',
			url: 'deleteVideo.do',
			data: {'idVideo': id},
			dataType: 'json',
			success: function(obj) {
				if(obj.status==true) {
					$(ele).parent().parent().remove();
				}
				else {
					window.alert("删除失败!");
				}
			},
			error : function(XMLHttpRequest, textStatus,
					errorThrown) {

				alert('返回失败！');
				
			}
			
		});
	}
	}