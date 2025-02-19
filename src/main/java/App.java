import java.util.Arrays;

import dao.OrcamentoDAO;
import model.Cliente;
import model.Orcamento;
import model.Produto;

public class App {
    public static void main(String[] args) {
        OrcamentoDAO orcamentoDAO = new OrcamentoDAO();

        // Criar Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        cliente.setEmail("joao@email.com");

        // Criar Produtos
        Produto p1 = new Produto();
        p1.setNome("Notebook");
        p1.setPreco(3500.0);

        Produto p2 = new Produto();
        p2.setNome("Mouse Gamer");
        p2.setPreco(150.0);

        // Criar Orçamento
        Orcamento orcamento = new Orcamento();
        orcamento.setCliente(cliente);
        orcamento.setProdutos(Arrays.asList(p1, p2));
        orcamento.setTotal(3650.0);

        // Salvar
        orcamentoDAO.salvar(orcamento);
        System.out.println("Orçamento salvo!");

        // Buscar Orçamento
        Orcamento o = orcamentoDAO.buscarPorId(1L);
        System.out.println("Cliente: " + o.getCliente().getNome());
        System.out.println("Produtos: " + o.getProdutos().size());
        System.out.println("Total: " + o.getTotal());
    }
}
