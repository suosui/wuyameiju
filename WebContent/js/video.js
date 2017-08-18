/**
 * 
 */
function check(userphone,pass)
{
		if(userphone==null||pass==null)
		{
		   alert("请先登录！");
		   window.location ='Login';
		}
	}
function showvideo() {
			var userphone = getCookie('phone');
			var pass = getCookie('p');
			check(userphone,pass);
		$.ajax({
						type : 'get',
						url : 'MyVideo',
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
										
										tr.append($('<td><button class="btn btn-info" onclick="delRoom('+items.idVideo+', this)">删除</button></td>'));
										tr.append($('<td><button class="btn btn-link" onclick="showRoom('+items.idVideo+', 1)">编辑</button> </td>'));
										
										$('#myTab').append(tr);
										//var $tr = $("<tr></tr>"); //表格的一行，在里面可以加各种属性;
                                        //var $td = $("<td></td>"); //行中的元素
						                //$tr.append($td.clone().text(items.idVideo)); //把数据填充到单元格中
						                //$tr.append($td.clone().text(items.userphone));
						                //$tr.append($td.clone().text(items.videoname));
						                //$tr.append($td.clone().text(items.link));
						                //$tr.append($td.clone().text(items.date));
						                //$tr.append($('<td><button class="btn btn-info" onclick="delRoom('+$td.clone().text(items.idVideo)+', this)">删除</button></td>'));
										//$tr.append($('<td><button class="btn btn-link" onclick="showRoom('+$td.clone().text(items.idVideo)+', 1)">查看</button> </td>'));
										
						                //$("#myTab").after($tr);//最后要把内容放入要绑定的地方
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