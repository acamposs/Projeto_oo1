
public class Medicamento extends Produto{
    
    private String indicacaoTerapeutica;

    public Medicamento(String nomeProduto, String dataValidade, String fabricante, double valor, String indicacaoTerapeutica) {
        super(nomeProduto, dataValidade, fabricante, valor);
        this.indicacaoTerapeutica = indicacaoTerapeutica;
    }


    public String getIndicacaoTerapeutica() {
        return indicacaoTerapeutica;
    }

    public void setIndicacaoTerapeutica(String indicacaoTerapeutica) {
        this.indicacaoTerapeutica = indicacaoTerapeutica;
    }


    @Override
    public String toString() {
        return "Medicamento: Produto = " + nomeProduto + ", Data de Validade = " + dataValidade + ", Fabricante = " + fabricante
        + ", Preço = R$ " + valor + ", Indicação Terapêutica = " + indicacaoTerapeutica;
    }



}
