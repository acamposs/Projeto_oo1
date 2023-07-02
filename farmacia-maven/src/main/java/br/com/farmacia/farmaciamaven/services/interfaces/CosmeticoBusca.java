/**
 * Pacote: br.com.farmacia.farmaciamaven.services.interfaces 
 * Este pacote contém interfaces que definem serviços e operações relacionadas à farmácia.
 * 
 */
package br.com.farmacia.farmaciamaven.services.interfaces;

import java.util.List;
import br.com.farmacia.farmaciamaven.Model.Cosmetico;

/**
 * 
 * Interface: CosmeticoBusca
 * Esta interface define os métodos para buscar informações relacionadas a
 * cosméticos.
 * Estende a interface CrudService para realizar operações básicas de CRUD.
 * 
 * @author Amanda Campos
 * @since 2023
 * 
 */
public interface CosmeticoBusca extends CrudService<Cosmetico, Integer> {

    /**
     * Realiza uma busca por cosméticos com base no nome.
     *
     * @param name Nome do cosmético ou parte do nome
     * @return Lista de cosméticos encontrados
     */
    List<Cosmetico> searchByname(String name);

}
