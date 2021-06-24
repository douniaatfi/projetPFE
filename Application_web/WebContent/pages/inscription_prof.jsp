<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no" name="viewport">
  <title>Inscription &mdash; FSBM-Community</title>

  <!-- General CSS Files -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

  <!-- CSS Libraries -->
  <link rel="stylesheet" href="../node_modules/selectric/public/selectric.css">

  <!-- Template CSS -->
  <link rel="stylesheet" href="../assets/css/style.css">
  <link rel="stylesheet" href="../assets/css/components.css">
</head>

<body>
  <div id="app">
    <section class="section">
      <div class="container mt-5">
        <div class="row">
          <div class="col-12 col-sm-10 offset-sm-1 col-md-8 offset-md-2 col-lg-8 offset-lg-2 col-xl-8 offset-xl-2">
            <div class="login-brand">
              
            </div>

            <div class="card card-primary">
              <div class="card-header"><h4>inscription</h4></div>

              <div class="card-body">
                <form method="POST" action="inscri_etudiant">
                  <div class="row">
                    <div class="form-group col-6">
                      <label for="first_name">First Name</label>
                      <input id="first_name" type="text" class="form-control" name="nom" autofocus>
                    </div>
                    <div class="form-group col-6">
                      <label for="last_name">Last Name</label>
                      <input id="last_name" type="text" class="form-control" name="prenom">
                    </div>
                  </div>
                  <div class="row">
                  <div class="form-group col-6">
                    <label for="email">Email</label>
                    <input id="email" type="email" class="form-control" name="login">
                    <div class="invalid-feedback">
                    </div>
                  </div>
                   <div class="form-group col-6">
                    <label for="email">Password</label>
                    <input id="email" type="password" class="form-control" name="password">
                    <div class="invalid-feedback">
                    </div>
                    </div>
                  </div>
                  <div class="row">
                   <div class="form-group col-6">
                    <label for="email">Date naissance</label>
                    <input id="email" type="number" class="form-control" name="date_naissance">
                    <div class="invalid-feedback">
                    </div>
                  </div>
                   <div class="form-group col-6">
                    <label for="email">Adresse</label>
                    <input id="email" type="text" class="form-control" name="adresse">
                    <div class="invalid-feedback">
                    </div>
                  </div>
                  </div>
                   <div class="row">
                   <div class="form-group col-6">
                    <label for="email">CIN</label>
                    <input id="email" type="text" class="form-control" name="cin">
                    <div class="invalid-feedback">
                    </div>
                  </div>
                  
                  <div class="row">
                  <div class="form-group col-6 offset-3">
                    <button type="submit" class="btn btn-primary btn-lg btn-block">
                      S'inscrire
                    </button>
                  </div>
                  </div>
                </form>
              </div>
            </div>
            <div class="simple-footer">
              Copyright &copy; FSBM-Community 2021. 
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>

  <!-- General JS Scripts -->
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.nicescroll/3.7.6/jquery.nicescroll.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
  <script src="../assets/js/stisla.js"></script>

  <!-- JS Libraies -->
  <script src="../node_modules/jquery-pwstrength/jquery.pwstrength.min.js"></script>
  <script src="../node_modules/selectric/public/jquery.selectric.min.js"></script>

  <!-- Template JS File -->
  <script src="../assets/js/scripts.js"></script>
  <script src="../assets/js/custom.js"></script>

  <!-- Page Specific JS File -->
  <script src="../assets/js/page/auth-register.js"></script>
</body>
</html>
