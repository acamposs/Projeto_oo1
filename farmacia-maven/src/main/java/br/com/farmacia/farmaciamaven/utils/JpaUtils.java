/**
 * Pacote: br.com.farmacia.farmaciamaven.utils 
 * Este pacote contém utilitários relacionados ao JPA (Java Persistence API) para a aplicação da farmácia.
 * 
 */
package br.com.farmacia.farmaciamaven.utils;

import javax.persistence.*;

/**
 * 
 * Classe: JpaUtils
 * Esta classe obtêm uma instância do EntityManager para interagir com a
 * persistência de
 * dados.
 * 
 * @author Amanda Campos
 * @since 2023
 */

public class JpaUtils {
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = null;

	/**
	 * Método getEntityManager
	 * 
	 * Retorna uma instância do EntityManager para interagir com a persistência de
	 * dados.
	 * Se a instância não existir, cria uma nova utilizando a configuração
	 * "farmacia-maven".
	 * 
	 * @return O EntityManager para interagir com a persistência de dados.
	 */
	public static EntityManager getEntityManager() {
		if (ENTITY_MANAGER_FACTORY == null) {
			ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("farmacia-maven");
		}
		return ENTITY_MANAGER_FACTORY.createEntityManager();
	}
}