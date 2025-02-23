package dao;

import javax.persistence.EntityManager;
import model.Orcamento;
import model.Produto;

import java.util.List;

public class OrcamentoDAO extends DAO<Orcamento> {

    public void adicionarProdutoAoOrcamento(Long idOrcamento, Long idProduto) throws Exception {
        EntityManager em = getEntityManager();

        try {
            em.getTransaction().begin();

            // Encontrando o orçamento e o produto
            Orcamento orcamento = em.find(Orcamento.class, idOrcamento);
            Produto produto = em.find(Produto.class, idProduto);

            if (orcamento != null && produto != null) {
                // Adiciona o produto ao orçamento
                orcamento.getProdutos().add(produto);

                // Recalcula o valor total do orçamento
                double novoValor = 0;
                for (Produto p : orcamento.getProdutos()) {
                    novoValor += p.getValor();  // Soma o valor dos produtos
                }
                orcamento.setValor(novoValor);  // Atualiza o valor total

                // Salva as alterações
                em.merge(orcamento);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public boolean salvar(Orcamento orcamento) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            // Recalcular o valor total antes de salvar
            double valorTotal = 0;
            for (Produto produto : orcamento.getProdutos()) {
                valorTotal += produto.getValor();  // Soma os valores dos produtos
            }
            orcamento.setValor(valorTotal);  // Atualiza o valor total no orçamento

            em.persist(orcamento);
            em.getTransaction().commit();
            em.close();

            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Erro ao salvar orçamento: " + e.getMessage());
        }
    }

    public Orcamento buscarPorId(Long id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            Orcamento orcamento = em.find(Orcamento.class, id);
            em.close();
            return orcamento;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Erro ao buscar orçamento: " + e.getMessage());
        }
    }

    public List<Orcamento> listarTodos() throws Exception {
        EntityManager em = getEntityManager();
        try {
            List<Orcamento> orcamentos = em.createQuery("FROM Orcamento", Orcamento.class).getResultList();
            em.close();
            return orcamentos;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Erro ao listar orçamentos: " + e.getMessage());
        }
    }

    public void atualizar(Orcamento orcamento) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            // Recalcular o valor total antes de atualizar
            double valorTotal = 0;
            for (Produto produto : orcamento.getProdutos()) {
                valorTotal += produto.getValor();  // Soma os valores dos produtos
            }
            orcamento.setValor(valorTotal);  // Atualiza o valor total

            em.merge(orcamento);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Erro ao atualizar orçamento: " + e.getMessage());
        }
    }

    public boolean excluir(Long id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Orcamento orcamento = em.find(Orcamento.class, id);
            if (orcamento != null) {
                em.remove(orcamento);
            }
            em.getTransaction().commit();
            em.close();

            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Erro ao excluir orçamento: " + e.getMessage());
        }
    }
}
