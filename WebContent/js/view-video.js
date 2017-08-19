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
				        var ul = $('<ul>');
				        ul.append($('<li>' + json.idVideo + '</li>'));
						ul.append($('<li>' + json.videoname + '</li>'));
						ul.append($('<li>' + json.date + '</li>'));
						ul.append($('<li><a class="rederict">' + json.link + '</a></li>'));
						
						ul.append($('<img src="'+json.imgsrc+'"></img>'));
						$('.span13').append(ul);
				   }
			  },"json");
	
});