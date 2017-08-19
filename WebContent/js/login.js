/**
 * 
 */
var ele = { // 存放各个input字段obj
	phone : document.getElementById("phone"),
	password : document.getElementById("password"),
};
ele.phone.onblur = function() { // name失去焦点则检测
	checkPhone(ele.phone.value);

}
ele.password.onblur = function() { // password失去焦点则检测
	checkPassw(ele.password.value);
}
function fun() {
	window.alert("没有问题啊！");
}
function checkPhone(phone) { // 验证name
	if (phone == "") { // 不为空则正确，当然也可以ajax异步获取服务器判断用户名不重复则正确
		// addClass(ele.spanphone2,'empty')
		document.getElementById("spanphone2").style.display = "";
		document.getElementById("spanphone1").style.display = "none";
		// alert("haha");
		return false;
	} else if (!(/^1[3|4|5|8][0-9]\d{4,8}$/.test(phone))) {
		document.getElementById("spanphone1").style.display = "";
		document.getElementById("spanphone2").style.display = "none";

		return false;
	} else {
		document.getElementById("spanphone1").style.display = "none";
		document.getElementById("spanphone2").style.display = "none";
		return true;
	}
}

function checkPassw(passw) { // 验证密码
	if (passw == "") {
		document.getElementById("spanpass").style.display = "";
		return false;
	} else { // 密码输入正确
		document.getElementById("spanpass").style.display = "none";
		return true;
	}
}
function Post() {
	if (checkPhone(ele.phone.value) && checkPassw(ele.password.value)) {
		//alert("1");
		GetPass();
		//alert("2");

	} else {
		alert("登录失败！");
	}
}

function Decrypt(word) {
	var key = CryptoJS.enc.Utf8.parse("abcdefgabcdefg12");

	var decrypt = CryptoJS.AES.decrypt(word, key, {
		mode : CryptoJS.mode.ECB,
		padding : CryptoJS.pad.Pkcs7
	});
	return CryptoJS.enc.Utf8.stringify(decrypt).toString();
}

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

function setCookie(c_name, value, expiredays) {
	var exdate = new Date()
	exdate.setDate(exdate.getDate() + expiredays)
	document.cookie = c_name + "=" + escape(value)
			+ ((expiredays == null) ? "" : "; expires=" + exdate.toGMTString())
}
function Reset()
{
	document.getElementById("contact-form").reset();
	}
function GetPass() {
	$.ajax({
		type : 'post',
		url : 'GetPass.do',
		data : {
			'phone' : ele.phone.value
		},
		datatype : "json",
		success : function(obj) {
			if ($('#password').val() == Decrypt(obj.password)) {
				alert("登录成功！");
				setCookie('phone', obj.phone, 30);
				setCookie('p',obj.password,30);
				window.location = 'index.do';
			} else if (obj.password == 'error') {
				alert("用户不存在，请先注册！");
			} else if($('#password').val() != Decrypt(obj.password)){
				alert("密码错误！");
			}
		},
		error : function(obj) {
			
				
				alert("出错啦！");
				
		
			
		}
	});
}
