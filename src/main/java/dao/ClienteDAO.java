package dao;
import javax.persistence.EntityManager;

import model.Cliente;
import model.Usuario;

public class ClienteDAO extends DAO<Cliente>{

    public void salvar(String email, String senha, boolean nivel, String nome, String telefone, String endereco) {
        EntityManager em = getEntityManager();
        Usuario novo = new Usuario(email, senha, nivel);
        Cliente nvCliente = new Cliente(email, senha, nivel, null, nome, telefone, endereco);
        em.getTransaction().begin();
        em.persist(novo);
        em.persist(nvCliente);
        em.getTransaction().commit();
        em.close();
    }
    public Cliente buscarPorId(int id) {
        EntityManager em = getEntityManager();
        Cliente user = em.find(Cliente.class, id);
        em.close();
        return user;
    }

    public boolean login(String senha){
        EntityManager em = getEntityManager();
        Usuario user = em.find(Usuario.class, senha);
        em.close();

        return (user != null) ? true : false;
    }
}