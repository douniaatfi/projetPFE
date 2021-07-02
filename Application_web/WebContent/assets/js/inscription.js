window.onload=function(){
    document.getElementById("but").addEventListener("click",inscrit);
    document.getElementById("i1").addEventListener("click",disp);
    document.getElementById("connex5").addEventListener("click",disp_left);
   
    
}

function inscrit()
{
    document.getElementById("connex5").style.display="block";
    document.getElementById("connex6").style.display="block";
}
function disp()
{
    document.getElementById("connex5").style.display="none";
    document.getElementById("connex6").style.display="none";
}
function disp_left()
{
    document.getElementById("connex5").style.display="none";
    document.getElementById("connex6").style.display="none";
}
function supprimer( id){
	const idsup = document.getElementById("confirme");
	idsup.href="?op=delete&id="+id;
}