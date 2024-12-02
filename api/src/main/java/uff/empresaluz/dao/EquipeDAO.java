package uff.empresaluz.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import uff.empresaluz.config.JPAUtil;
import uff.empresaluz.model.Equipe;

import java.util.List;

public class EquipeDAO extends GenericDAO<Equipe> {
    public EquipeDAO() {
        super(Equipe.class);
    }

    public List<Equipe> findByQuantidadeFuncionarios(int quantidade) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String queryStr = "FROM Equipe WHERE quantidadeFuncionarios = :quantidade";
            TypedQuery<Equipe> query = em.createQuery(queryStr, Equipe.class);
            query.setParameter("quantidade", quantidade);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}

