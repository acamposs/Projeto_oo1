package Model;


public class Cosmetico extends Produto {
    
    private String funcao;
    private String aplicacao;

    public Cosmetico(String nomeProduto, String dataValidade, String fabricante, double valor, String funcao, String aplicacao) {
        super(nomeProduto, dataValidade, fabricante, valor);
        this.funcao = funcao;
        this.aplicacao = aplicacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    @Override
    public String toString() {
        return "Cosmético: Produto = " + nomeProduto + ", Data de Validade = " + dataValidade + ", Fabricante = " + fabricante
        + ", Preço = R$ " + valor + ", Função do cosmético = " + funcao + ", Tipo de aplicação = " + aplicacao ;
    }

   
}
