package br.com.farmacia.farmaciamaven.services.impl;

import java.util.*;
import br.com.farmacia.farmaciamaven.services.interfaces.MedicamentoBusca;
import br.com.farmacia.farmaciamaven.Model.Medicamento;
import javax.persistence.EntityManager;
import br.com.farmacia.farmaciamaven.utils.JpaUtils;

/**
 * 
 * Classe: MedicamentoService
 * 
 * A classe MedicamentoService implementa a interface MedicamentoBusca e fornece
 * operações de busca e manipulação de medicamentos.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class MedicamentoService implements MedicamentoBusca {

    /**
     * Retorna uma lista contendo todos os medicamentos cadastrados.
     *
     * @return Lista de medicamentos
     */
    @Override
    public List<Medicamento> all() {
        List<Medicamento> medicamentos = new ArrayList<Medicamento>();
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            // Consulta todos os medicamentos utilizando a linguagem de consulta JPA
            medicamentos = em.createQuery("from Medicamento", Medicamento.class).getResultList();
            return medicamentos;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Retorna um medicamento com base no seu ID.
     *
     * @param id ID do medicamento
     * @return Medicamento correspondente ao ID fornecido, ou null se não for
     *         encontrado
     */
    @Override
    public Medicamento byID(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            // Busca um medicamento pelo seu ID utilizando o método find do EntityManager
            return em.find(Medicamento.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Insere um novo medicamento no banco de dados.
     *
     * @param entity Medicamento a ser inserido
     * @return Medicamento inserido
     */
    @Override
    public Medicamento insert(Medicamento entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Persiste o medicamento no banco de dados utilizando o método persist do
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
     * Exclui um medicamento do banco de dados.
     *
     * @param entity Medicamento a ser excluído
     */
    @Override
    public void delete(Medicamento entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Remove o medicamento do banco de dados utilizando o método remove do
            // EntityManager
            em.remove(entity);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Atualiza um medicamento no banco de dados.
     *
     * @param entity Medicamento a ser atualizado
     * @return Medicamento atualizado
     */
    @Override
    public Medicamento update(Medicamento entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Atualiza o medicamento no banco de dados utilizando o método merge do
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
     * Exclui um medicamento do banco de dados com base no seu ID.
     *
     * @param id ID do medicamento a ser excluído
     */
    @Override
    public void deleteById(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            // Busca o medicamento pelo seu ID e remove do banco de dados utilizando o
            // método remove do EntityManager
            Medicamento medicamento = em.find(Medicamento.class, id);
            em.remove(medicamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Realiza uma busca por medicamentos com base no nome.
     *
     * @param name Nome do medicamento ou parte do nome
     * @return Lista de medicamentos encontrados
     */
    @Override
    public List<Medicamento> searchByname(String name) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            // Consulta medicamentos com base no nome utilizando a linguagem de consulta JPA
            return em.createQuery("from Medicamento where nomeProduto like :nomeProduto", Medicamento.class)
                    .setParameter("nomeProduto", "%" + name + "%")
                    .getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
