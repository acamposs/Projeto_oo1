package projeto_OO.Model;

import java.util.ArrayList;

public class Farmacia {

    private String nomeFarmacia;
    private ArrayList <Produto> listaProdutos = new ArrayList <Produto> ();

    public Farmacia(String nomeFarmacia, ArrayList<Produto> listaProdutos) {
    
        this.nomeFarmacia = nomeFarmacia;
        this.listaProdutos = listaProdutos;

    }

    public String getNomeFarmacia() {
        return nomeFarmacia;
    }   
    
    public void setNomeFarmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }


    @Override
    public String toString() {
        return "Farmacia: \n Nome da Farmacia = " + nomeFarmacia + "\n Lista de Produtos = " + listaProdutos;
    }

}




