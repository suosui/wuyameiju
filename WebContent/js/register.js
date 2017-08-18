/**
 * 
 */

function hasClass(obj, cls) { // 判断obj是否有此class
	return obj.className.match(new RegExp('(\\s|^)' + cls + '(\\s|$)'));
}
function addClass(obj, cls) { //给 obj添加class
	if (!this.hasClass(obj, cls)) {
		obj.className += " " + cls;
	}
}
function removeClass(obj, cls) { //移除obj对应的class
	if (hasClass(obj, cls)) {
		var reg = new RegExp('(\\s|^)' + cls + '(\\s|$)');
		obj.className = obj.className.replace(reg, " ");
	}
}
var ele = { //存放各个input字段obj
	phone : document.getElementById("phone"),
	password : document.getElementById("password1"),
	R_password : document.getElementById("password2"),
	spanphone2 : document.getElementById("spanphone2"),
};
ele.phone.onblur = function() { //name失去焦点则检测
	checkPhone(ele.phone.value);

}
ele.password.onblur = function() { //password失去焦点则检测
	checkPassw1(ele.password.value, ele.R_password.value);
}
ele.R_password.onblur = function() { //R_password失去焦点则检测
	checkPassw2(ele.password.value, ele.R_password.value);
}

function checkPhone(phone) { //验证name
	if (phone == "") { //不为空则正确，当然也可以ajax异步获取服务器判断用户名不重复则正确
		//addClass(ele.spanphone2,'empty')
		document.getElementById("spanphone2").style.display = "";
		document.getElementById("spanphone1").style.display = "none";
		//alert("haha");
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
function checkPassw1(passw1, passw2) { //验证密码
	if (passw1 == "") {
		document.getElementById("spanpass1").style.display = "";
		return false;
	} else if (passw1 !== passw2) {
		document.getElementById("spanpass1").style.display = "none";
		document.getElementById("spanpass2").style.display = "";

		return false;
	} else { //密码输入正确
		document.getElementById("spanpass1").style.display = "none";
		document.getElementById("spanpass2").style.display = "none";

		return true;
	}
}
function checkPassw2(passw1, passw2) {
	if (passw1 == "" || passw2 == "" || passw1 !== passw2) {
		document.getElementById("spanpass2").style.display = "";
		return false;
	} else { //密码输入正确
		document.getElementById("spanpass2").style.display = "none";
		return true;
	}
}
function Reset()
{
	document.getElementById("contact-form").reset();
	
}
function Post() {
	if (checkPhone(ele.phone.value) && checkPassw1(ele.password.value, ele.R_password.value) && checkPassw2(ele.password.value, ele.R_password.value)) 
	{
		//alert("haha");
		
		AddUser();
		//alert("hehe");
	} else {
		alert("注册失败！");
	}
}

function AddUser() {
	$.ajax({
		type : 'post',
		url : 'AddUser',
		data : {
			'phone' : ele.phone.value,
			'password' : Encrypt(ele.password.value)
		},
		datatype : "json",
		success : function(obj) {
			if (obj.phone == $('#phone').val()) {
				window.alert(obj.phone + ":注册成功！");
				setCookie('phone', obj.phone, 30)
				setCookie('p',obj.password, 30)
				window.location = 'Login';
			} else if (obj.phone == 0) {
				alert("用户已存在！");
			} else {
				window.alert(obj.phone + "注册失败！！");
			}

		},
		error : function() {
			alert("用户已存在！");
			// window.location = 'test'
		}

	});
}
function fun() {
	window.alert("没有问题啊！");
}
function Encrypt(word){  
	
    var key = CryptoJS.enc.Utf8.parse("abcdefgabcdefg12");   
   
    var srcs = CryptoJS.enc.Utf8.parse(word);  
   
    var encrypted = CryptoJS.AES.encrypt(srcs, key, {mode:CryptoJS.mode.ECB,padding: CryptoJS.pad.Pkcs7});  
  
   
 
    return encrypted.toString();  
}  
function Decrypt(word){  
    var key = CryptoJS.enc.Utf8.parse("abcdefgabcdefg12");   

    var decrypt = CryptoJS.AES.decrypt(word, key, {mode:CryptoJS.mode.ECB,padding: CryptoJS.pad.Pkcs7});  
    return CryptoJS.enc.Utf8.stringify(decrypt).toString();  
}  
function setCookie(c_name, value, expiredays) {
	var exdate = new Date()
	exdate.setDate(exdate.getDate() + expiredays)
	document.cookie = c_name + "=" + escape(value)
			+ ((expiredays == null) ? "" : "; expires=" + exdate.toGMTString())
}