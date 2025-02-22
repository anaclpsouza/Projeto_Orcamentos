<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
                crossorigin="anonymous">
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
           <link rel="stylesheet" href="assets/css/style.css" />
            <title>Fábrica de Sonhos</title>
        </head>
            <body class="login">
                <div class="login-card text-center">
                    <img src="assets/img/logo-png.png" alt="Miauguinho Logo" class="mb-4 rounded-circle" id="img-logo">
                    <h1>Fábrica de Sonhos Manhuaçu</h1>
                    <p class="mb-4">Área de acesso do cliente</p>

                    <form action="LoginServlet" method="POST">
                        <div class="mb-3 text-start">
                            <label for="user" class="form-label">Usuário</label> <input type="text" id="user"
                                name="user" class="form-control" placeholder="@" required>
                        </div>
                        <div class="mb-3 text-start">
                            <label for="password" class="form-label">Senha</label> <input type="password" id="senha"
                                name="senha" class="form-control" placeholder="Digite sua senha" required>
                        </div>
                        <button type="submit" class="btn btn-primary w-100">Entrar</button>
                    </form>

                </div>
                <div class="footer mt-4">
                    <p>© 2024 Fábrica de Sonhos Manhuaçu</p>
                </div>
             

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
                crossorigin="anonymous"></script>

        </body>

 </html>