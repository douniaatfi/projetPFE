<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="test.js"></script>
<script src="jquery.js"></script>
<link href="assets1/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div>
		<input type="text" id="login"/>
		<input type="password" id="password"/>
		<div class="input-group date">
    <input type="text" class="form-control" value="12-02-2012">
    <div class="input-group-addon">
        <span class="glyphicon glyphicon-th"></span>
    </div>
</div>
		<p id="erreur"></p>
		<button id="envoyer">envoyer</button>
	</div>
	
	<script>
	$('#datepicker').datepicker();
	$('#datepicker').on('changeDate', function() {
	    $('#my_hidden_input').val(
	        $('#datepicker').datepicker('getFormattedDate')
	    );
	});
	</script>
</body>
</html>