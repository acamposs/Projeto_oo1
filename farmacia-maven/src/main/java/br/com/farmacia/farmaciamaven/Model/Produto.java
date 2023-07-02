package br.com.farmacia.farmaciamaven.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 * 
 * Classe: Produto
 * 
 * Esta classe abstrata representa um produto no aplicativo de farmácia.
 * 
 * Ela é a classe pai para outras classes de produtos específicos.
 * 
 * @author Amanda Campos
 * @since 2023
 */
@Entity
@Table(name = "produto")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "produto_id")
    private int id;

    @Column(name = "nomeProduto")
    protected String nomeProduto;

    @Column(name = "produto_validade")
    protected String dataValidade;

    @Column(name = "produto_fabricante")
    protected String fabricante;

    @Column(name = "produto_valor")
    protected String valor;

    /**
     * Construtor: Produto
     * Cria uma nova instância da classe Produto com as propriedades especificadas.
     * 
     * @param nomeProduto  O nome do produto.
     * @param dataValidade A data de validade do produto.
     * @param fabricante   O fabricante do produto.
     * @param valor        O valor do produto.
     */
    public Produto(String nomeProduto, String dataValidade, String fabricante, String valor) {
        this.nomeProduto = nomeProduto;
        this.dataValidade = dataValidade;
        this.fabricante = fabricante;
        this.valor = valor;
    }

    /**
     * Construtor Padrão: Produto
     * Cria uma nova instância da classe Produto com valores padrão.
     */
    public Produto() {

    }

    /**
     * Método: getNomeProduto
     * Retorna o nome do produto.
     * 
     * @return O nome do produto.
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Método: setNomeProduto
     * Define o nome do produto.
     * 
     * @param nomeProduto O nome do produto.
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * Método: getDataValidade
     * Retorna a data de validade do produto.
     * 
     * @return A data de validade do produto.
     */
    public String getDataValidade() {
        return dataValidade;
    }

    /**
     * Método: setDataValidade
     * Define a data de validade do produto.
     * 
     * @param dataValidade A data de validade do produto.
     */
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * Método: getFabricante
     * Retorna o fabricante do produto.
     * 
     * @return O fabricante do produto.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Método: setFabricante
     * Define o fabricante do produto.
     * 
     * @param fabricante O fabricante do produto.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Método: getValor
     * Retorna o valor do produto.
     * 
     * @return O valor do produto.
     */
    public String getValor() {
        return valor;
    }

    /**
     * Método: setValor
     * Define o valor do produto.
     * 
     * @param valor O valor do produto.
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Método: getId
     * Retorna o ID do produto.
     * 
     * @return O ID do produto.
     */
    public int getId() {
        return id;
    }

    /**
     * Método: setId
     * Define o ID do produto.
     * 
     * @param id O ID do produto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método: toString
     * Retorna uma representação em string do objeto Produto.
     * 
     * @return A representação em string do objeto Produto.
     */
    @Override
    public String toString() {
        return "Produto: \n Produto = " + nomeProduto + ", Data de Validade = " + dataValidade + ", Fabricante = "
                + fabricante + ", Preço = R$ " + valor;
    }

}
