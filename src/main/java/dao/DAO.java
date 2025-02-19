package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO<T> {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoorcamentos");

    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}