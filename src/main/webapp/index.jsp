<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="assets/css/style.css" />
    <title>Fábrica de Sonhos</title>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light fixed-top">
        <div class="container-fluid">
            <img src="assets/img/logo_FS.png" id="img_logo" alt="Logo" width="60" height="60"
                class="d-inline-block align-left">
            <span id="logo"> Fábrica de Sonhos</span>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse mb-2 mb-lg-0" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a href="" class="btn-link nav-link" data-bs-toggle="offcanvas" data-bs-target="#demo">
                            <i class="bi bi-person-circle"> Perfil</i>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/"> <i class="bi bi-house-heart"> Página Principal</i></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href=""><i class="bi bi-bookmark-heart"> Meus Orçamentos</i></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/ajuda"><i class="bi bi-question-circle"> Ajuda</i></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container mt-4">
        <div class="container mt-5 pt-5">
            <h3>Todas as Peças</h3>
            <div class="row">
                <div class="col-4">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="card-title">Title</h3>
                            <p class="card-text">Text</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="card-title">Title</h3>
                            <p class="card-text">Text</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="card-title">Title</h3>
                            <p class="card-text">Text</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <p>&copy; Fábrica de Sonhos - Manhuaçu, MG</p>
            <p>Email: <a href="mailto:">email@gmail.com</a></p>
            <a href="#top" class="back-to-top">Voltar ao topo</a>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>