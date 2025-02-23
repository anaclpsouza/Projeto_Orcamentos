package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDAO;
import model.Produto;

public class Index extends HttpServlet {

    public Index(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProdutoDAO classeProduto = new ProdutoDAO();
    
        List<Produto> produtos = new ArrayList<Produto>();
        String msg = null;
        
        try {
            produtos = classeProduto.listarTodos();  // Tenta pegar os produtos
        } catch (Exception e) {
            msg = e.getMessage();  // Se ocorrer erro, captura a mensagem
            request.setAttribute("msg", msg);  // Passa a mensagem de erro para o JSP
        }

        // Passa a lista de produtos para o JSP
        request.setAttribute("produtos", produtos);

        // Redireciona para a página JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/index.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Método não usado no momento, mas pode ser adicionado para POST
    }
}
