package Model;


public class Venda {
    
    private int id;
    private Cliente cliente;
    private Produto produto;
    private int quantidadeProduto;


    
    public Venda(int id, Cliente cliente, Produto produto, int quantidadeProduto) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
        
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public double CalculoValor() {
        return quantidadeProduto * produto.getValor();
    }

   

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }


    @Override
    public String toString() {
        return "Venda: id = " + id + "\n" + cliente + "\n" + produto + "\nQuantidade de Produto = " 
        + quantidadeProduto + ", Valor da venda = R$" + CalculoValor();
    }


}
