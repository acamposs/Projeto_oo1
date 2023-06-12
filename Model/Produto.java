package Model;

public abstract class Produto {

    protected String nomeProduto;
    protected String dataValidade;
    protected String fabricante;
    protected double valor;

    public Produto (String nomeProduto, String dataValidade, String fabricante, double valor) {
        this.nomeProduto = nomeProduto;
        this.dataValidade = dataValidade;
        this.fabricante = fabricante;
        this.valor = valor;
    }

    
    //metodos (gets e sets)
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    //toString
    @Override
    public String toString() {
        return "Produto: \n Produto = " + nomeProduto + ", Data de Validade = " + dataValidade + ", Fabricante = " + fabricante 
        + ", Preço = R$ " + valor;
    }

  
}
