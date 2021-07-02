
<%@page import="Entites.User"%>
<% User e = (User)session.getAttribute("user"); 
if(e==null){
	response.sendRedirect("http://localhost:8080/Dounia_Atfi/authentification_user");

}else{

%><!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no" name="viewport">
  <title>Acceuil &mdash; FSBMCOMMUNITY</title>

  <!-- General CSS Files -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
<link rel="stylesheet" href="./assets/css/inscription.css">
  <!-- CSS Libraries -->

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
            <li><a href="#" data-toggle="sidebar" class="nav-link nav-link-lg"><i class="fas fa-bars"></i></a></li>
            <li><a href="#" data-toggle="search" class="nav-link nav-link-lg d-sm-none"><i class="fas fa-search"></i></a></li>
          </ul>
          <div class="search-element">
            <input class="form-control" type="search" placeholder="Search" aria-label="Search" data-width="250">
            <button class="btn" type="submit"><i class="fas fa-search"></i></button>
            <div class="search-backdrop"></div>
            <div class="search-result">
              
              
            </div>
          </div>
        </form>
       <ul class="navbar-nav navbar-right">
         <li class="dropdown dropdown-list-toggle"><a href="http://localhost:8080/Application_web/acceuil" data-toggle="dropdown" class="nav-link nav-link-lg message-toggle beep"><i class="fas fa-home"></i></a>
           
          </li>
          <li class="dropdown dropdown-list-toggle"><a href="http://localhost:8080/Application_web/message"  class="nav-link nav-link-lg "><i class="fas fa-envelope"></i></a>
            
          </li>
          <li class="dropdown dropdown-list-toggle"><a  href="#"  class="nav-link  nav-link-lg "><i class="fas fa-calendar-alt"></i></a>
           
          </li>
          <li class="dropdown dropdown-list-toggle"><a href="#" data-toggle="dropdown" class="nav-link notification-toggle nav-link-lg beep"><i class="fas fa-briefcase "></i></a>
           
          </li>
          <li class="dropdown">
          <a href="#" data-toggle="dropdown" class="nav-link dropdown-toggle nav-link-lg nav-link-user">
            <img alt="image" src="./assets/img/avatar/avatar-1.png" class="rounded-circle mr-1">
            <div class="d-sm-none d-lg-inline-block"><%=e.getNom() %></div>
            </a>
            <div class="dropdown-menu dropdown-menu-right">
              
              <a href="http://localhost:8080/Application_web/profile" class="dropdown-item has-icon">
                <i class="far fa-user"></i> Profile
              </a>
             
              <a href="features-settings.html" class="dropdown-item has-icon">
                <i class="fas fa-cog"></i> Parametrage
              </a>
              <div class="dropdown-divider"></div>
              <a href="http://localhost:8080/Application_web/authentification_user" class="dropdown-item has-icon text-danger">
                <i class="fas fa-sign-out-alt"></i> deconnecter
              </a>
            </div>
          </li>
        </ul>
      </nav>
 
      <div class="main-sidebar">
        <aside id="sidebar-wrapper">
          <div class="sidebar-brand">
            <a href="index.html">FSBM COMMUNITY</a>
          </div>
          <div class="sidebar-brand sidebar-brand-sm">
            <a href="index.html"></a>
          </div>
          <ul class="sidebar-menu">
              <li class="menu-header">Offres</li>
              <li class="nav-item dropdown">
                <a href="#" class="nav-link has-dropdown"><i class="fal fa-briefcase"></i><span>Offres</span></a></li>
                <ul class="dropdown-menu">
                  <li><a class="nav-link" href="http://localhost:8080/Application_web/ajout_offre">ajouter Offres Emploi</a></li>
                    <li><a class="nav-link" href="http://localhost:8080/Application_web/consulter_ofremploi">consulter Offres Emploi</a></li>
                  <li><a class="nav-link" href="index.html">Offres Stages</a></li>
                </ul>
            
              <li class="menu-header">Plus</li>
              <li class="nav-item dropdown">
                <a href="#" class="nav-link " data-toggle="dropdown"><i class="fal fa-calendar-alt"></i><span>Evénements</span></a>
           
              </li>
              <li class="active"><a class="nav-link" href="blank.html"><i class="fal fa-hashtag"></i> <span>Hashtag</span></a></li>
              <li class="nav-item dropdown">
                
              </li>

            </ul>
        </aside>
      </div>

      <!-- Main Content -->
      <div class="main-content">
        <section class="section">
          <div class="section-header">
            <h1>Publication</h1>
            <div class="section-header-button">
              <button id ="but" class="btn btn-primary">Add New</button>
            </div>
          
          </div>
         <!-- main -->
          <div class="row">
                <div class="col-lg-12" id="connex5">
                </div>
           </div>
       		
       		<div class="row">
              <div class="col-7" id="connex6">
                <div class="card">
                 
                    <div class="col-lg-2 offset-lg-8 connex8">
                            <i id="i1" class='fa fa-times'></i>
                       </div>
                  <div class="card-body" >
                 <form action="ajout_publication" method="post">
               
                   <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Contenu</label>
                      <div class="col-sm-12 col-md-7">
                         <input id="last_name" type="text" class="form-control" name="caption">
                      </div>
                    </div>
                    <!-- 
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3">Fichier</label>
                      <div class="col-sm-12 col-md-7">
                        <div id="image-preview" class="image-preview">
                          <label for="image-upload" id="image-label">Choose File</label>
                          <input type="file" name="image" id="image-upload" />
                        </div>
                      </div>
                    </div>
                  -->
             
                    <div class="form-group row mb-4">
                      <label class="col-form-label text-md-right col-12 col-md-3 col-lg-3"></label>
                      <div class="col-sm-12 col-md-7">
                        <button class="btn btn-primary">Create Post</button>
                      </div>
                    </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
        </section>
      </div>
      <footer class="main-footer">
        <div class="footer-left">
          Copyright &copy; 2021 <div class="bullet"></div> 
        </div>
       
      </footer>
    </div>
  </div>

  <!-- General JS Scripts -->
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.nicescroll/3.7.6/jquery.nicescroll.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
  <script src="./assets/js/stisla.js"></script>

  <!-- JS Libraies -->
<script src="./assets/js/inscription.js"></script>
      <script src="./assets/js/test.js"></script>	

  <!-- Template JS File -->
  <script src="./assets/js/scripts.js"></script>
  <script src="./assets/js/custom.js"></script>

  <!-- Page Specific JS File -->
</body>
</html>
<%}%>