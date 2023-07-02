/**
 * Pacote: br.com.farmacia.farmaciamaven.services.impl
 * Esse pacote contém as implementações dos serviços relacionados aos cosméticos e medicamentos.
 * 
 */
package br.com.farmacia.farmaciamaven.services.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import br.com.farmacia.farmaciamaven.Model.Cosmetico;
import br.com.farmacia.farmaciamaven.services.interfaces.CosmeticoBusca;
import br.com.farmacia.farmaciamaven.utils.JpaUtils;

/**
 * 
 * Classe: CosmeticoService
 * 
 * A classe CosmeticoService implementa a interface CosmeticoBusca e fornece
 * operações de busca e manipulação de cosméticos.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class CosmeticoService implements CosmeticoBusca {

    /**
     * Retorna uma lista contendo todos os cosméticos cadastrados.
     *
     * @return Lista de cosméticos
     */
    @Override
    public List<Cosmetico> all() {
        List<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            // Consulta todos os cosméticos utilizando a linguagem de consulta JPA
            cosmeticos = em.createQuery("from Cosmetico", Cosmetico.class).getResultList();
            return cosmeticos;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Retorna um cosmético com base no seu ID.
     *
     * @param id ID do cosmético
     * @return Cosmético correspondente ao ID fornecido, ou null se não for
     *         encontrado
     */
    @Override
    public Cosmetico byID(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            // Busca um cosmético pelo seu ID utilizando o método find do EntityManager
            return em.find(Cosmetico.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Insere um novo cosmético no banco de dados.
     *
     * @param entity Cosmético a ser inserido
     * @return Cosmético inserido
     */
    @Override
    public Cosmetico insert(Cosmetico entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Persiste o cosmético no banco de dados utilizando o método persist do
            // EntityManager
            em.persist(entity);
            em.getTransaction().commit();
            return entity;
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    /**
     * Exclui um cosmético do banco de dados.
     *
     * @param entity Cosmético a ser excluído
     */
    @Override
    public void delete(Cosmetico entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Busca o cosmético pelo seu ID e remove do banco de dados utilizando o método
            // remove do EntityManager
            Cosmetico cosmetico = em.find(Cosmetico.class, entity.getId());
            em.remove(cosmetico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Atualiza um cosmético no banco de dados.
     *
     * @param entity Cosmético a ser atualizado
     * @return Cosmético atualizado
     */
    @Override
    public Cosmetico update(Cosmetico entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Atualiza o cosmético no banco de dados utilizando o método merge do
            // EntityManager
            em.merge(entity);
            em.getTransaction().commit();
            return entity;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Exclui um cosmético do banco de dados com base no seu ID.
     *
     * @param id ID do cosmético a ser excluído
     */
    @Override
    public void deleteById(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Busca o cosmético pelo seu ID e remove do banco de dados utilizando o método
            // remove do EntityManager
            Cosmetico cosmetico = em.find(Cosmetico.class, id);
            em.remove(cosmetico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Realiza uma busca por cosméticos com base no nome.
     *
     * @param name Nome do cosmético ou parte do nome
     * @return Lista de cosméticos encontrados
     */
    @Override
    public List<Cosmetico> searchByname(String name) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            // Consulta cosméticos com base no nome utilizando a linguagem de consulta JPA
            return em.createQuery("from Cosmetico where nomeProduto like :name", Cosmetico.class)
                    .setParameter("name", "%" + name + "%").getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
