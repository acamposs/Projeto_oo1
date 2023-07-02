package br.com.farmacia.farmaciamaven.Model;

import java.util.ArrayList;

/**
 * 
 * Classe: Farmacia
 * 
 * Esta classe representa uma farmácia no aplicativo.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class Farmacia {

    private String nomeFarmacia;
    public ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    /**
     * 
     * Construtor: Farmacia
     * 
     * Cria uma nova instância da classe Farmacia com as propriedades especificadas.
     * 
     * @param nomeFarmacia  O nome da farmácia.
     * 
     * @param listaProdutos A lista de produtos na farmácia.
     */
    public Farmacia(String nomeFarmacia, ArrayList<Produto> listaProdutos) {

        this.nomeFarmacia = nomeFarmacia;
        this.listaProdutos = listaProdutos;
        this.setListaProdutos(listaProdutos);

    }

    /**
     * Construtor Padrão: Farmacia
     * Cria uma nova instância da classe Farmacia com valores padrão.
     */
    public Farmacia() {
        // Construtor padrão
    }

    /**
     * Método: getNomeFarmacia
     * Retorna o nome da farmácia.
     * 
     * @return O nome da farmácia.
     */
    public String getNomeFarmacia() {
        return nomeFarmacia;
    }

    /**
     * Método: setNomeFarmacia
     * Define o nome da farmácia.
     * 
     * @param nomeFarmacia O nome da farmácia.
     */
    public void setNomeFarmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }

    /**
     * Método: getListaProdutos
     * Retorna a lista de produtos na farmácia.
     * 
     * @return A lista de produtos na farmácia.
     */
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    /**
     * Método: adicionarProdutos
     * Adiciona um produto à lista de produtos na farmácia.
     * 
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProdutos(Produto produto) {
        listaProdutos.add(produto);
    }

    /**
     * Método: removerProdutos
     * Remove um produto da lista de produtos na farmácia.
     * 
     * @param produto O produto a ser removido.
     */
    public void removerProdutos(Produto produto) {
        this.listaProdutos.remove(produto);
    }

    /**
     * Método: setListaProdutos
     * Define a lista de produtos na farmácia.
     * 
     * @param listaProdutos A lista de produtos na farmácia.
     */
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    /**
     * Método: toString
     * Retorna uma representação em string do objeto Farmacia.
     * 
     * @return A representação em string do objeto Farmacia.
     */
    @Override
    public String toString() {
        return "Farmacia: \n Nome da Farmacia = " + nomeFarmacia + "\n Lista de Produtos = " + listaProdutos;
    }

}