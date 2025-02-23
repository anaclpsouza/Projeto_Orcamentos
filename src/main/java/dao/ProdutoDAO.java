package dao;

import javax.persistence.EntityManager;
import java.util.List;
import model.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public void salvar(Produto produto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public Produto buscarPorId(Long id) throws Exception{
        EntityManager em = getEntityManager();
        try{
            Produto produto = em.find(Produto.class, id);
            em.close();
            return produto;
        } catch(Exception e){
            em.getTransaction().rollback(); 
            throw new Exception("Erro ao excluir orçamento: "+e.getMessage());
        }
    }

    public List<Produto> listarTodos() throws Exception{
        EntityManager em = getEntityManager();
        try {
            List<Produto> produtos = em.createQuery("FROM Produto", Produto.class).getResultList();
            em.close();
            return produtos;
        } catch (Exception e) {
            em.getTransaction().rollback(); 
            throw new Exception("Erro ao excluir orçamento: "+e.getMessage());
        }
    }

    public void atualizar(Produto produto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public void excluir(Long id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Produto produto = em.find(Produto.class, id);
            if (produto != null) {
                em.remove(produto);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
}
