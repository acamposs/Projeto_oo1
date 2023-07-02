package br.com.farmacia.farmaciamaven.services.interfaces;

import java.util.List;
import br.com.farmacia.farmaciamaven.Model.Medicamento;

/**
 * 
 * Interface: MedicamentoBusca
 * Esta interface define os métodos para buscar informações relacionadas a
 * medicamentos.
 * Estende a interface CrudService para realizar operações básicas de CRUD.
 * 
 * @author Amanda Campos
 * @since 2023
 */

public interface MedicamentoBusca extends CrudService<Medicamento, Integer> {

    /**
     * Realiza uma busca por medicamentos com base no nome.
     *
     * @param name Nome do medicamento ou parte do nome
     * @return Lista de medicamentos encontrados
     */
    List<Medicamento> searchByname(String name);

}
