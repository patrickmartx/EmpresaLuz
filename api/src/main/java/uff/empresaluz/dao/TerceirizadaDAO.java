package uff.empresaluz.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import uff.empresaluz.config.JPAUtil;
import uff.empresaluz.model.Terceirizada;

import java.util.List;

public class TerceirizadaDAO extends GenericDAO<Terceirizada> {
    public TerceirizadaDAO() {
        super(Terceirizada.class);
    }

    public List<Terceirizada> filtrarPorCidade(String cidade) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String jpql = "SELECT t FROM Terceirizada t WHERE t.cidade LIKE :cidade";
            TypedQuery<Terceirizada> query = em.createQuery(jpql, Terceirizada.class);
            query.setParameter("cidade", "%" + cidade + "%"); // Adiciona % para busca parcial
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}

