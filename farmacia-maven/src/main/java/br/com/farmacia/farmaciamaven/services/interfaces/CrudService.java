package br.com.farmacia.farmaciamaven.services.interfaces;

import java.util.List;

/**
 * 
 * Interface: CrudService
 * Esta interface define os métodos para realizar operações básicas de CRUD.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public interface CrudService<T, K> {

    /**
     * Retorna uma lista contendo todos os objetos do tipo T.
     *
     * @return Lista de objetos
     */
    List<T> all();

    /**
     * Retorna um objeto do tipo T com base no seu ID.
     *
     * @param id ID do objeto
     * @return Objeto correspondente ao ID fornecido, ou null se não for encontrado
     */
    T byID(K id);

    /**
     * Insere um novo objeto do tipo T.
     *
     * @param entity Objeto a ser inserido
     * @return Objeto inserido
     */
    T insert(T entity);

    /**
     * Atualiza um objeto do tipo T.
     *
     * @param entity Objeto a ser atualizado
     * @return Objeto atualizado
     */
    T update(T entity);

    /**
     * Exclui um objeto do tipo T.
     *
     * @param entity Objeto a ser excluído
     */
    void delete(T entity);

    /**
     * Exclui um objeto do tipo T com base no seu ID.
     *
     * @param id ID do objeto a ser excluído
     */
    void deleteById(K id);
}
