package Model;

public class Medicamento extends Produto{

    private String indicacaoTerapeutica;
    private String dosagem;
    private String viaAdmissao;

    public Medicamento(String nomeProduto, String dataValidade, String fabricante, double valor, String indicacaoTerapeutica, String dosagem, String viaAdmissao) {
        super(nomeProduto, dataValidade, fabricante, valor);
        this.indicacaoTerapeutica = indicacaoTerapeutica;
        this.dosagem = dosagem;
        this.viaAdmissao = viaAdmissao;
    }

    public String getIndicacaoTerapeutica() {
        return indicacaoTerapeutica;
    }

    public void setIndicacaoTerapeutica(String indicacaoTerapeutica) {
        this.indicacaoTerapeutica = indicacaoTerapeutica;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getViaAdmissao() {
        return viaAdmissao;
    }

    public void setViaAdmissao(String viaAdmissao) {
        this.viaAdmissao = viaAdmissao;
    }


    @Override
    public String toString() {
        return "Medicamento: Produto = " + nomeProduto + ", Data de Validade = " + dataValidade + ", Fabricante = " + fabricante
        + ", Preço = R$ " + valor + ", Indicação Terapêutica = " + indicacaoTerapeutica + ", Dosagem = " + dosagem + ", Via de admissão = " + viaAdmissao;
    }
    



}
