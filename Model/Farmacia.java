package Model;

import java.util.ArrayList;

public class Farmacia {

    private String nomeFarmacia;
    public ArrayList <Produto> listaProdutos = new ArrayList <Produto> ();

    public Farmacia(String nomeFarmacia, ArrayList<Produto> listaProdutos) {
    
        this.nomeFarmacia = nomeFarmacia;
        this.listaProdutos = listaProdutos;
        this.setListaProdutos(listaProdutos);

    }

    public Farmacia() {
    }

    public String getNomeFarmacia() {
        return nomeFarmacia;
    }   
    
    public void setNomeFarmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }

    public ArrayList <Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void adicionarProdutos(Produto produto){
		listaProdutos.add(produto);	
	}
	
	public void removerProdutos(Produto produto) {
		this.listaProdutos.remove(produto);			
	}


    public void setListaProdutos(ArrayList <Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }


    @Override
    public String toString() {
        return "Farmacia: \n Nome da Farmacia = " + nomeFarmacia + "\n Lista de Produtos = " + listaProdutos;
    }

}





