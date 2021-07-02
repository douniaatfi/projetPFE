<%@page import="Services.ser_message"%>
<%@page import="Services.ser_user"%>
<%@page import="Entites.Message"%>
<%@page import="Dao.dao_etudiant"%>
<%@page import="Entites.Etudiant"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entites.User"%>
<%@page import="Services.ser_etudiant"%>
<% User e = (User)session.getAttribute("user"); 
if(e==null){
	response.sendRedirect("http://localhost:8080/Dounia_Atfi/authentification_user");

}else{

%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no" name="viewport">
  <title>Chat</title>

  <!-- General CSS Files -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

  <!-- CSS Libraries -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <!-- Template CSS -->
  <link rel="stylesheet" href="./assets/css/style.css">
  <link rel="stylesheet" href="./assets/css/components.css">
</head>

<body>
  <div id="app">
    <div class="main-wrapper">
      <div class="navbar-bg"></div>
      <nav class="navbar navbar-expand-lg main-navbar">
        <form class="form-inline mr-auto">
          <ul class="navbar-nav mr-3">
            </ul>
          <div class="search-element">
            <input class="form-control" type="search" placeholder="Rechercher" aria-label="Search" data-width="250">
            <button class="btn" type="submit"><i class="fas fa-search"></i></button>
            <div class="search-backdrop"></div>
            <div class="search-result">
              <div class="search-header">
                Histories
              </div>
            </div>
          </div>
        </form>
         <ul class="navbar-nav navbar-right">
         <li class="dropdown dropdown-list-toggle"><a href="acceuil_etudiant.jsp" data-toggle="dropdown" class="nav-link nav-link-lg message-toggle beep"><i class="fas fa-home"></i></a>
           
          </li>
          <li class="dropdown dropdown-list-toggle"><a href="#" data-toggle="dropdown" class="nav-link nav-link-lg message-toggle beep"><i class="fas fa-envelope"></i></a>
            
          </li>
          <li class="dropdown dropdown-list-toggle"><a  href="ev_admin.jsp"  class="nav-link  nav-link-lg "><i class="fas fa-calendar-alt"></i></a>
           
          </li>
          <li class="dropdown dropdown-list-toggle"><a href="#" data-toggle="dropdown" class="nav-link notification-toggle nav-link-lg beep"><i class="fas fa-briefcase "></i></a>
            
          </li>
          <li class="dropdown"><a href="#" data-toggle="dropdown" class="nav-link dropdown-toggle nav-link-lg nav-link-user">
            <img alt="image" src="./assets/img/avatar/avatar-1.png" class="rounded-circle mr-1">
            <div class="d-sm-none d-lg-inline-block"><%= e.getNom() %></div></a>
            <div class="dropdown-menu dropdown-menu-right">
             
              <a href="features-profile.html" class="dropdown-item has-icon">
                <i class="far fa-user"></i> Profile
              </a>
              <a href="features-activities.html" class="dropdown-item has-icon">
                <i class="fas fa-bolt"></i> Activities
              </a>
              <a href="features-settings.html" class="dropdown-item has-icon">
                <i class="fas fa-cog"></i> Paramétre
              </a>
              <div class="dropdown-divider"></div>
              <a href="#" class="dropdown-item has-icon text-danger">
                <i class="fas fa-sign-out-alt"></i> déconnecter
              </a>
            </div>
          </li>
        </ul>
      </nav>
     

      <!-- Main Content -->
      <div class="main-content">
        <section class="section">
          <div class="section-header">
            <h1>Chat Box</h1>
            
          </div>
			<% ArrayList<Etudiant> l=dao_etudiant.listeetudiant(); %>
          <div class="section-body">
            <h2 class="section-title">Chat Boxes</h2>
            <p class="section-lead">The chat component and is equipped with a JavaScript API, making it easy for you to integrate with Back-end.</p>

            <div class="row align-items-center justify-content-center">
              <div class="col-12 col-sm-6 col-lg-4">
                <div class="card">
                  <div class="card-header">
                    <h4>Message</h4>
                  </div>
                  <div class="card-body">
                    
                    
                    <ul class="list-unstyled list-unstyled-border">
                     <% for(Etudiant et:l){ %>
                      <li class="media" style="cursor:pointer;">
                      <input type="hidden" value="<%=et.getId()%>">
                        <img alt="image" class="mr-3 rounded-circle" width="50" src="./assets/img/avatar/avatar-1.png">
                        <div class="media-body">
                          <div class="mt-0 mb-1 font-weight-bold"><%=et.getNom()+" "+et.getPrenom() %></div>
                        </div>
                      </li>
                      <%} %>
                    </ul>
                  </div>
                </div>
              </div>
              
              <% 
              ArrayList<Message> msg =null;
              	int ids =0;
              	ids=((User)session.getAttribute("user")).getId();
              	int idc =0;
              	if(request.getParameter("conv")!=null){
              		idc = Integer.parseInt(request.getParameter("conv"));
              	}
              	if(ids !=0 || idc!=0){
              		 msg= ser_message.consul_message(ids, idc);
              	}
              
              	if(msg!=null){
              		
              %>
            
              
              <div class="col-12 col-sm-6 col-lg-8">
                <div class="card chat-box card-success" id="mychatbox2">
                  <div class="card-header">
                    <h4><i class="fas fa-circle text-success mr-2" title="Online" data-toggle="tooltip">Amal Sakhi</i></h4>
                  </div>
                  <div class="card-body chat-content">
                  <%for(Message m:msg){ 
                  	if(ids==m.getIde()){
                  %>
                  	<div class="chat-item chat-right">
                  	<img src="./assets/img/avatar/avatar-5.png">
                  	<div class="chat-details">
                  		<div class="chat-text"><%=m.getText() %></div>
                  		<div class="chat-time"><%=m.getDate().substring(10, 19) %></div>
                  	</div>
                  	</div>
                  <%} else{%>
                  <div class="chat-item chat-left">
                  	<img src="./assets/img/avatar/avatar-5.png">
                  	<div class="chat-details">
                  		<div class="chat-text"><%=m.getText() %></div>
                  		<div class="chat-time"><%=m.getDate().substring(10, 19) %></div>
                  	</div>
                  	</div>
                  
                  <%}} %>
                  </div>
                  <div class="card-footer chat-form">
                    <form action="message" method="post" id="chat-form2">
                       <input type="hidden" name="inpt" value="<%=idc%>">
                      <input type="text" name="msag" class="form-control" placeholder="Type a message">
                      <button class="btn btn-primary">
                        <i class="far fa-paper-plane"></i>
                      </button>
                    </form>
                  </div>
                </div>
              </div>
           <%} %>
            </div>
          </div>
        </section>
      </div>
      <footer class="main-footer">
        <div class="footer-left">
          Copyright &copy; 2021  fsbm community
        </div>
        <div class="footer-right">
          2.3.0
        </div>
      </footer>
    </div>
  </div>
     <script>
$( "#chat-form2" ).submit(function( event ) {
  event.preventDefault();
  var $form = $( this );
  
 var msg = $form.find( "input[name='msag']" ).val();
  var  id = $form.find( "input[name='inpt']" ).val();
    console.log(msg+id);
   var url = $form.attr( "action" );
   var posting = $.post( url, { Message : msg,idconv :id } );
  posting.done(function( data ) {
    var content = $( data ).find( "#content" );
    $( "#result" ).empty().append( content );
  });
});
</script>
  <!-- General JS Scripts -->
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.nicescroll/3.7.6/jquery.nicescroll.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
  <script src="./assets/js/stisla.js"></script>

  <!-- JS Libraies -->

  <!-- Template JS File -->
  <script src="./assets/js/scripts.js"></script>
  <script src="./assets/js/custom.js"></script>
<script src="./assets/js/msg.js"></script>
  <!-- Page Specific JS File -->
 
</body>
</html>
<%}%>