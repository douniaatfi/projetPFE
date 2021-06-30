
function upload_image(){
   //traitement backend ...
  //Nom servlet
    var url = "uplodimage";
	//formulaire qui a le id = ..
	var form = document.getElementById("form");
    var urlimage = new FormData(form);
    /* var data = {};
    data['key1'] = 'value1';
    data['key2'] = 'value2'; */
    $.ajax({
        type : "POST",
        encType : "multipart/form-data",
        url : url,
        cache : false,
        processData : false,
        contentType : false,
        data : urlimage , 
        success : function(msg) {
           alert(msg);
            
        }, error : function(msg) {
            alert("Il ya un probleme au serveur");
        }
    });
}
