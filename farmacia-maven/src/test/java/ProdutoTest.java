import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import br.com.farmacia.farmaciamaven.Model.Cosmetico;
import br.com.farmacia.farmaciamaven.Model.Medicamento;

/**
 * Classe: ProdutoTest
 * Classe de testes para a classe Produto.
 */
public class ProdutoTest {

    /**
     * Testa o método getDataValidade da classe Medicamento.
     * Verifica se o valor retornado é igual ao valor definido e se não é igual a um
     * valor diferente.
     */
    @Test
    public void testGetDataValidadeMedicamento() {
        Medicamento medicamento = new Medicamento();
        medicamento.setDataValidade("10/10/2020");
        assertTrue(medicamento.getDataValidade().equals("10/10/2020"));
        assertFalse(medicamento.getDataValidade().equals("10-10-2020"));
    }

    /**
     * Testa o método getValor da classe Medicamento.
     * Verifica se o valor retornado é igual ao valor definido e se não é igual a um
     * valor diferente.
     */
    @Test
    public void testGetValorMedicamento() {
        Medicamento medicamento = new Medicamento();
        medicamento.setValor("10.00");
        assertTrue(medicamento.getValor().equals("10.00"));
        assertFalse(medicamento.getValor().equals("10,00"));
    }

    /**
     * Testa o método getNomeProduto da classe Medicamento.
     * Verifica se o valor retornado é igual ao valor definido e se não é igual a um
     * valor diferente.
     */
    @Test
    public void testGetNomeMedicamento() {
        Medicamento medicamento = new Medicamento();
        medicamento.setNomeProduto("Dipirona");
        assertTrue(medicamento.getNomeProduto().equals("Dipirona"));
        assertFalse(medicamento.getNomeProduto().equals("Dipirona 500mg"));
    }

    /**
     * Testa o método getDataValidade da classe Cosmetico.
     * Verifica se o valor retornado é igual ao valor definido e se não é igual a um
     * valor diferente.
     */
    @Test
    public void testGetDataValidadeCosmetico() {
        Cosmetico cosmetico = new Cosmetico();
        cosmetico.setDataValidade("10/10/2020");
        assertTrue(cosmetico.getDataValidade().equals("10/10/2020"));
        assertFalse(cosmetico.getDataValidade().equals("10-10-2020"));
    }

    /**
     * Testa o método getValor da classe Cosmetico.
     * Verifica se o valor retornado é igual ao valor definido e se não é igual a um
     * valor diferente.
     */
    @Test
    public void testGetValorCosmetico() {
        Cosmetico cosmetico = new Cosmetico();
        cosmetico.setValor("10.00");
        assertTrue(cosmetico.getValor().equals("10.00"));
        assertFalse(cosmetico.getValor().equals("10,00"));
    }

    /**
     * Testa o método getNomeProduto da classe Cosmetico.
     * Verifica se o valor retornado é igual ao valor definido e se não é igual a um
     * valor diferente.
     */
    @Test
    public void testGetNomeCosmetico() {
        Cosmetico cosmetico = new Cosmetico();
        cosmetico.setNomeProduto("Elseve Loreal Paris");
        assertTrue(cosmetico.getNomeProduto().equals("Elseve Loreal Paris"));
        assertFalse(cosmetico.getNomeProduto().equals("Elseve Loreal Paris 200ml"));
    }

}
