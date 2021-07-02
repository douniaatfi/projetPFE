<%@page import="Entites.Offre"%>
<%@page import="Entites.Offreemploi"%>
<%@page import="Entites.User"%>
<%@page import="Services.ser_emploi"%>
<%@page import="java.util.ArrayList"%>
<% User e = (User)session.getAttribute("user"); 
if(e==null){
	response.sendRedirect("http://localhost:8080/Dounia_Atfi/authentification_user");

}else{

%>
<% String  sup = request.getParameter("op");
   
if(sup!=null && sup.equals("delete")&& request.getParameter("id")!=null){
	
	int idsup =Integer.parseInt(request.getParameter("id"));
	ser_emploi.supp_off_emploi(idsup);
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no" name="viewport">
  <title> Offres Emploi &mdash; FSBM COMMUNITY</title>

  <!-- General CSS Files -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

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
              <div class="search-header">
                Histories
              </div>
              <div class="search-item">
                <a href="#">FSBM</a>
                <a href="#" class="search-close"><i class="fas fa-times"></i></a>
              </div>
              <div class="search-item">
                <a href="#">capgemini</a>
                <a href="#" class="search-close"><i class="fas fa-times"></i></a>
              </div>
              <div class="search-item">
                <a href="#">Technoparck</a>
                <a href="#" class="search-close"><i class="fas fa-times"></i></a>
              </div>
              <div class="search-header">
                Result
              </div>
              <div class="search-item">
                <a href="#">
                  <img class="mr-3 rounded" width="30" src="./assets/img/products/product-3-50.png" alt="product">
                 Faculté des Sciences Ben M'Sik
                </a>
              </div>
              <div class="search-item">
                <a href="#">
                  <img class="mr-3 rounded" width="30" src="./assets/img/products/product-2-50.png" alt="product">
                 CapgeMini
                </a>
              </div>
              <div class="search-item">
                <a href="#">
                  <img class="mr-3 rounded" width="30" src="./assets/img/products/product-1-50.png" alt="product">
                  Technoparck Casablanca
                </a>
              </div>
             <!------ <div class="search-header">
                Projects
              </div>
              <div class="search-item">
                <a href="#">
                  <div class="search-icon bg-danger text-white mr-3">
                    <i class="fas fa-code"></i>
                  </div>
                  Stisla Admin Template
                </a>
              </div>
              <div class="search-item">
                <a href="#">
                  <div class="search-icon bg-primary text-white mr-3">
                    <i class="fas fa-laptop"></i>
                  </div>
                  Create a new Homepage Design
                </a>
              </div>-->
            </div>
          </div>
        </form>
        <ul class="navbar-nav navbar-right">
          <li class="dropdown dropdown-list-toggle"><a href="#" data-toggle="dropdown" class="nav-link nav-link-lg message-toggle beep"><i class="fas fa-envelope"></i></a>
            <div class="dropdown-menu dropdown-list dropdown-menu-right">
              <div class="dropdown-header">Messages
                <div class="float-right">
                  <a href="#">Mark All As Read</a>
                </div>
              </div>
              <div class="dropdown-list-content dropdown-list-message">
                <a href="#" class="dropdown-item dropdown-item-unread">
                  <div class="dropdown-item-avatar">
                    <img alt="image" src="./assets/img/avatar/avatar-1.png" class="rounded-circle">
                    <div class="is-online"></div>
                  </div>
                  <div class="dropdown-item-desc">
                    <b>Khadija Bouydou</b>
                    <p>Hello, Bro!</p>
                    <div class="time">10 Hours Ago</div>
                  </div>
                </a>
                <a href="#" class="dropdown-item dropdown-item-unread">
                  <div class="dropdown-item-avatar">
                    <img alt="image" src="./assets/img/avatar/avatar-2.png" class="rounded-circle">
                  </div>
                  <div class="dropdown-item-desc">
                    <b>Dounia Atfi</b>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit</p>
                    <div class="time">12 Hours Ago</div>
                  </div>
                </a>
                <a href="#" class="dropdown-item dropdown-item-unread">
                  <div class="dropdown-item-avatar">
                    <img alt="image" src="./assets/img/avatar/avatar-3.png" class="rounded-circle">
                    <div class="is-online"></div>
                  </div>
                  <div class="dropdown-item-desc">
                    <b>Hajar Eddagni</b>
                    <p>Sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    <div class="time">12 Hours Ago</div>
                  </div>
                </a>
                <a href="#" class="dropdown-item">
                  <div class="dropdown-item-avatar">
                    <img alt="image" src="./assets/img/avatar/avatar-4.png" class="rounded-circle">
                  </div>
                  <div class="dropdown-item-desc">
                    <b>El Filali Sanae</b>
                    <p>Duis aute irure dolor in reprehenderit in voluptate velit ess</p>
                    <div class="time">16 Hours Ago</div>
                  </div>
                </a>
                <a href="#" class="dropdown-item">
                  <div class="dropdown-item-avatar">
                    <img alt="image" src="./assets/img/avatar/avatar-5.png" class="rounded-circle">
                  </div>
                  <div class="dropdown-item-desc">
                    <b>Sakhi Hasnae</b>
                    <p>Exercitation ullamco laboris nisi ut aliquip ex ea commodo</p>
                    <div class="time">Yesterday</div>
                  </div>
                </a>
              </div>
              <div class="dropdown-footer text-center">
                <a href="#">View All <i class="fas fa-chevron-right"></i></a>
              </div>
            </div>
          </li>
          <li class="dropdown dropdown-list-toggle"><a href="#" data-toggle="dropdown" class="nav-link notification-toggle nav-link-lg beep"><i class="fas fa-home"></i></a>
            <div class="dropdown-menu dropdown-list dropdown-menu-right">
              
              <div class="dropdown-list-content dropdown-list-icons">
                <a href="#" class="dropdown-item dropdown-item-unread">
                  <div class="dropdown-item-icon bg-primary text-white">
                    <i class="fas fa-code"></i>
                  </div>
                  
                </a>
                
              </div>
              
            </div>
          </li>
          <li class="dropdown"><a href="#" data-toggle="dropdown" class="nav-link dropdown-toggle nav-link-lg nav-link-user">
            <img alt="image" src="./assets/img/avatar/avatar-1.png" class="rounded-circle mr-1">
            <div class="d-sm-none d-lg-inline-block"><%= e.getNom() %></div></a>
            <div class="dropdown-menu dropdown-menu-right">
              <div class="dropdown-title"></div>
              <a href="features-profile.html" class="dropdown-item has-icon">
                <i class="far fa-user"></i> Profile
              </a>
              <a href="features-activities.html" class="dropdown-item has-icon">
                <i class="fas fa-bolt"></i> Activities
              </a>
              <a href="features-settings.html" class="dropdown-item has-icon">
                <i class="fas fa-cog"></i> Paramaitres
              </a>
              <div class="dropdown-divider"></div>
              <a href="page_authentification.jsp" class="dropdown-item has-icon text-danger">
                <i class="fas fa-sign-out-alt"></i> Déconnexion
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
                  <a href="#" class="nav-link has-dropdown"><i class="fas fa-briefcase"></i><span>Offres</span></a>
                  <ul class="dropdown-menu">
                    <li><a class="nav-link" href="Page_offre_emploi.html">Offres Emploi</a></li>
                    <li><a class="nav-link" href="index.html">Offres Stages</a></li>
                  </ul>
                </li>
                <li class="menu-header">Plus</li>
                <li class="nav-item dropdown">
                  <a href="#" class="nav-link " data-toggle="dropdown"><i class="fas fa-calendar-alt"></i> <span>Evénements</span></a>
             
                </li>
                <li class="active"><a class="nav-link" href="blank.html"><i class="fas fa-hashtag"></i><span>Hashtag</span></a></li>
                <li class="nav-item dropdown">
                  
                </li>
  
              </ul>
          </aside>
        
      </div>

      <!-- Main Content -->
      <div class="main-content">
        <section class="section">
          <div class="section-header">
            <h1>Offres d'Emploi</h1>
            <div class="section-header-breadcrumb">
              <div class="breadcrumb-item active"><a href="#">Acceuil</a></div>
              <div class="breadcrumb-item"><a href="#">Offres</a></div>
              <div class="breadcrumb-item">Offre emploi</div>
            </div>
          </div>

          <div class="section-body">
            <h2 class="section-title">Ajouter Offres d'emplois</h2>
            <p class="section-lead">
              vous pouvez ajoutez un nouveau emploi <a href="http://www.chartjs.org/">here</a>
            </p>
              <% ArrayList<Offreemploi> liste = ser_emploi.listeemploi(); %>
            <div class="row">
            <%  for(Offreemploi ofr : liste){ %>
              <div class="col-12 col-md-6 col-lg-6">
                <div class="card">
                  <div class="card-header">
                    <h4><%= ofr.getNom()%> : </h4>
                  </div>
                   <div class="card-body">
                   
                    <p> Description :<%= ofr.getDescription()%></p>
                    <p>Contrainte :<%= ofr.getContrainte()%></p>
                   <p>Type de contrat :<%= ofr.getTypecontrat()%></p>
                    <p> Le salaire :<%= ofr.getSalaire()%></p>
                    
                  
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary">Modifier</button>
                        <button type="button" data-toggle="modal" data-target="#sup_offre" class="btn btn-danger but" onclick="supprimer(<%=ofr.getIdofremp()%>)">Supprimer</button>
                                             
                      </div>
                  </div>
                </div>
              </div>
              <% }%> 
              </div>
            </div>
         
        </section>
      </div>
      
      <!-- Modal -->
<div class="modal fade" id="sup_offre" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Supprimer</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        confirmer votre suppression
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Annuler</button>
        <a type="button" id="confirme" class="btn btn-primary">Confirmer</a>
      </div>
    </div>
  </div>
</div>
      <footer class="main-footer">
        <div class="footer-left">
          Copyright &copy; 2021 <div class="bullet"></div>
        </div>
        <div class="footer-right">
          2.3.0
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
  <script src="./node_modules/chart.js/dist/Chart.min.js"></script>

  <!-- Template JS File -->
  <script src="./assets/js/scripts.js"></script>
  <script src="./assets/js/custom.js"></script>
  <script src="./assets/js/inscription.js"></script>
  <!-- Page Specific JS File -->
  <script src="./assets/js/page/modules-chartjs.js"></script>
</body>
</html>
<%}%>