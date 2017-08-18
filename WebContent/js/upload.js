
function upload(){				
    var hideForm = $('#form1');
			
			var options = {
			dataType : 'json',
			type : 'POST',
			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
			beforeSubmit : function() { 
			alert("正在上传"); 
			}, 
			success : function(obj) { 
			alert('成功上传！'); 
			}, 
			error : function(XMLHttpRequest, textStatus, errorThrown) { 
				
			  alert('上传失败！');
			  alert('XMLHttpRequest.status: '+ XMLHttpRequest.status);
	          alert('XMLHttpRequest.readyState: '+ XMLHttpRequest.readyState);
	          alert('textStatus: '+ textStatus);
	          alert('errorThrown: '+errorThrown);
	          } 
			}; 
			$('#form1').ajaxSubmit(options);
			
}
function showRegisterForm(){
    $('.loginBox').fadeOut('fast',function(){
        $('.registerBox').fadeIn('fast');
        $('.login-footer').fadeOut('fast',function(){
            $('.register-footer').fadeIn('fast');
        });
        $('.modal-title').html('Register with');
    }); 
    $('.error').removeClass('alert alert-danger').html('');
       
}
function showLoginForm(){
    $('#loginModal .registerBox').fadeOut('fast',function(){
        $('.loginBox').fadeIn('fast');
        $('.register-footer').fadeOut('fast',function(){
            $('.login-footer').fadeIn('fast');    
        });
        
        $('.modal-title').html('Login with');
    });       
     $('.error').removeClass('alert alert-danger').html(''); 
}

function openLoginModal(){
	
    showLoginForm();
    setTimeout(function(){
        $('#loginModal').modal('show');    
    }, 230);
    return false;
    
}
function openRegisterModal(){
    showRegisterForm();
    setTimeout(function(){
        $('#loginModal').modal('show');    
    }, 230);
    
}

function loginAjax(){
    /*   Remove this comments when moving to server
    $.post( "/login", function( data ) {
            if(data == 1){
                window.location.replace("/home");            
            } else {
                 shakeModal(); 
            }
        });
    */

/*   Simulate error message from the server   */
	
     shakeModal();
}

function shakeModal(){
    $('#loginModal .modal-dialog').addClass('shake');
             $('.error').addClass('alert alert-danger').html("Invalid email/password combination");
             $('input[type="password"]').val('');
             setTimeout( function(){ 
                $('#loginModal .modal-dialog').removeClass('shake'); 
    }, 1000 ); 
}

function MyVideo()
{
	
	window.location='showMyVideo';
	return false;
}


