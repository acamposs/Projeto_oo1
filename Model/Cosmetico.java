
public class Cosmetico extends Produto {
    
    private String tipo;

    public Cosmetico(String nomeProduto, String dataValidade, String fabricante, double valor, String tipo) {
        super(nomeProduto, dataValidade, fabricante, valor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cosmético: Produto = " + nomeProduto + ", Data de Validade = " + dataValidade + ", Fabricante = " + fabricante
        + ", Preço = R$ " + valor + ", Tipo de Cosmético = " + tipo;
    }
}
