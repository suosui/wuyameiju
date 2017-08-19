/**
 * 
 */
function getCookie(c_name) {
	if (document.cookie.length > 0) {
		c_start = document.cookie.indexOf(c_name + "=")
		if (c_start != -1) {
			c_start = c_start + c_name.length + 1
			c_end = document.cookie.indexOf(";", c_start)
			if (c_end == -1)
				c_end = document.cookie.length
			return unescape(document.cookie.substring(c_start, c_end))
		}
	}
	return ""
}
function Blog()
{
	username = getCookie('phone');
	pass =getCookie('p');
	if (username != null && username != "")
		{
		    if(pass != null && pass != "")
		    	{
		    	 window.location="Blog.do";
		    	}
		    else
		    	{
		    	alert("请先登录");
			    window.location="Login.do";
		    	}
		    
		   
		}
	else
		{
		alert("请先登录");
		window.location="Login.do";
		}
	
	}
function checkCookie() {
	username = getCookie('phone')
	if (username != null && username != "") {
		document.getElementById("in").style.display = "";
		document.getElementById("out").style.display = "";
		document.getElementById("log").style.display = "none";
		document.getElementById("regis").style.display = "none";
		document.getElementById("nameDisplay").innerHTML = "Hi," + username
	} else {
		document.getElementById("in").style.display = "none";
		document.getElementById("out").style.display = "none";
		document.getElementById("log").style.display = "";
		document.getElementById("regis").style.display = "";
	}

}
function delCookie(name) {
	var exp = new Date();
	exp.setTime(exp.getTime() - 1);
	var cval = getCookie(name);
	if (cval != null)
		document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
}
function Out() {
	delCookie('phone');
}