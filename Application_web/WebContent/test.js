window.onload=function(){
	document.getElementById("envoyer").addEventListener("click",trt);
}

function trt(){
	
	var login = document.getElementById("login").value;
	var password = document.getElementById("password").value;
	
	$.post("testajax",{"login":login,"password":password},function(data){
		if(data=="false"){
			document.getElementById("erreur").innerText="login ou password incorrect";
		}else{
			window.location.href="";
		}
	});
	
}