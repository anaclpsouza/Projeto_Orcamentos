<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Produto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4 text-center">Cadastro de Produto</h2>
        <form action="/cadastrarProduto" method="post" enctype="multipart/form-data">
            <div class="mb-3">
                <label for="nome" class="form-label">Nome do Produto</label>
                <input type="text" class="form-control" id="nome" name="nome" required>
            </div>
            <div class="mb-3">
                <label for="descricao" class="form-label">Descrição</label>
                <textarea class="form-control" id="descricao" name="descricao" rows="3" required></textarea>
            </div>
            <div class="mb-3">
                <label for="categoria" class="form-label">Categoria</label>
                <select class="form-select" id="categoria" name="categoria" required>
                    <option value="">Selecione uma categoria</option>
                    <option value="mesa">Mesa</option>
                    <option value="cadeira">Cadeira</option>
                    <option value="arranjo">Arranjo</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="preco" class="form-label">Preço (R$)</label>
                <input type="number" class="form-control" id="preco" name="preco" step="0.01" required>
            </div>
            <div class="mb-3">
                <label for="quantidade" class="form-label">Quantidade Disponível</label>
                <input type="number" class="form-control" id="quantidade" name="quantidade" required>
            </div>
            <div class="mb-3">
                <label for="imagem" class="form-label">Imagem do Produto</label>
                <input type="file" class="form-control" id="imagem" name="imagem" accept="image/*">
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Cadastrar</button>
                <a href="/admin" class="btn btn-secondary">Cancelar</a>
            </div>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
