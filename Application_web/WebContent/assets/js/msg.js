window.onload=function(){
	
	objts = document.getElementsByClassName("media");
	
	for(let i=0;i<objts.length;i++){
		objts[i].addEventListener("click",afficheconv);
	}

	
}

function afficheconv(){
	window.location.href = "http://localhost:8080/Application_web/message?conv="+this.children[0].value;
}