/**

    Pacote: br.com.farmacia.farmaciamaven.Model
    Este pacote contém as classes de modelo para o aplicativo de farmácia.
    */

package br.com.farmacia.farmaciamaven.Model;

import javax.persistence.*;

/**
 * 
 * Classe: Cosmetico
 * 
 * Esta classe representa um produto cosmético no aplicativo de farmácia.
 * 
 * Ela estende a classe Produto.
 * 
 * @author Amanda Campos
 * @since 2023
 */
@Entity
@Table(name = "cosmetico")
public class Cosmetico extends Produto {

    @Column(name = "funcao")
    private String funcao;

    @Column(name = "aplicacao")
    private String aplicacao;

    /**
     * Construtor: Cosmetico
     * Cria uma nova instância da classe Cosmetico com as propriedades
     * especificadas.
     * 
     * @param nomeProduto  O nome do produto.
     * @param dataValidade A data de validade do produto.
     * @param fabricante   O fabricante do produto.
     * @param valor        O preço do produto.
     * @param funcao       A função do produto cosmético.
     * @param aplicacao    A aplicação do produto cosmético.
     */
    public Cosmetico(String nomeProduto, String dataValidade, String fabricante, String valor, String funcao,
            String aplicacao) {
        super(nomeProduto, dataValidade, fabricante, valor);
        this.funcao = funcao;
        this.aplicacao = aplicacao;
    }

    /**
     * Construtor Padrão: Cosmetico
     * Cria uma nova instância da classe Cosmetico com valores padrão.
     */
    public Cosmetico() {
        // Construtor padrão
    }

    /**
     * Método: getFuncao
     * Retorna a função do produto cosmético.
     * 
     * @return A função do produto cosmético.
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Método: setFuncao
     * Define a função do produto cosmético.
     * 
     * @param funcao A função do produto cosmético.
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * Método: getAplicacao
     * Retorna a aplicação do produto cosmético.
     * 
     * @return A aplicação do produto cosmético.
     */
    public String getAplicacao() {
        return aplicacao;
    }

    /**
     * Método: setAplicacao
     * Define a aplicação do produto cosmético.
     * 
     * @param aplicacao A aplicação do produto cosmético.
     */
    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    /**
     * Método: toString
     * Retorna uma representação em string do objeto Cosmetico.
     * 
     * @return A representação em string do objeto Cosmetico.
     */
    @Override
    public String toString() {
        return " R$ " + valor;
    }
}
