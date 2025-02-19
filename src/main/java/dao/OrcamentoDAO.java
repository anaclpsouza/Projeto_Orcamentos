package dao;

import javax.persistence.EntityManager;

import model.Orcamento;

import java.util.List;

public class OrcamentoDAO extends DAO<Orcamento> {

    public void salvar(Orcamento orcamento) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(orcamento);
        em.getTransaction().commit();
        em.close();
    }

    public Orcamento buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        Orcamento orcamento = em.find(Orcamento.class, id);
        em.close();
        return orcamento;
    }

    public List<Orcamento> listarTodos() {
        EntityManager em = getEntityManager();
        List<Orcamento> orcamentos = em.createQuery("FROM Orcamento", Orcamento.class).getResultList();
        em.close();
        return orcamentos;
    }

    public void atualizar(Orcamento orcamento) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(orcamento);
        em.getTransaction().commit();
        em.close();
    }

    public void excluir(Long id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Orcamento orcamento = em.find(Orcamento.class, id);
        if (orcamento != null) {
            em.remove(orcamento);
        }
        em.getTransaction().commit();
        em.close();
    }
}