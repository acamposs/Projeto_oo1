package br.com.farmacia.farmaciamaven.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * Classe: Medicamento
 * 
 * Esta classe representa um medicamento no aplicativo de farmácia.
 * 
 * Ela estende a classe Produto.
 * 
 * @author Amanda Campos
 * @since 2023
 */
@Entity
@Table(name = "medicamento")
public class Medicamento extends Produto {

    @Column(name = "medicamento_indicacao_terapeutica")
    private String indicacaoTerapeutica;

    @Column(name = "medicamento_dosagem")
    private String dosagem;

    @Column(name = "medicamento_admissao")
    private String viaAdmissao;

    /**
     * Construtor: Medicamento
     * Cria uma nova instância da classe Medicamento com as propriedades
     * especificadas.
     * 
     * @param nomeProduto          O nome do medicamento.
     * @param dataValidade         A data de validade do medicamento.
     * @param fabricante           O fabricante do medicamento.
     * @param valor                O preço do medicamento.
     * @param indicacaoTerapeutica A indicação terapêutica do medicamento.
     * @param dosagem              A dosagem do medicamento.
     * @param viaAdmissao          A via de admissão do medicamento.
     */
    public Medicamento(String nomeProduto, String dataValidade, String fabricante, String valor,
            String indicacaoTerapeutica, String dosagem, String viaAdmissao) {
        super(nomeProduto, dataValidade, fabricante, valor);
        this.indicacaoTerapeutica = indicacaoTerapeutica;
        this.dosagem = dosagem;
        this.viaAdmissao = viaAdmissao;
    }

    /**
     * Construtor Padrão: Medicamento
     * Cria uma nova instância da classe Medicamento com valores padrão.
     */
    public Medicamento() {
        super();
    }

    /**
     * Método: getIndicacaoTerapeutica
     * Retorna a indicação terapêutica do medicamento.
     * 
     * @return A indicação terapêutica do medicamento.
     */
    public String getIndicacaoTerapeutica() {
        return indicacaoTerapeutica;
    }

    /**
     * Método: setIndicacaoTerapeutica
     * Define a indicação terapêutica do medicamento.
     * 
     * @param indicacaoTerapeutica A indicação terapêutica do medicamento.
     */
    public void setIndicacaoTerapeutica(String indicacaoTerapeutica) {
        this.indicacaoTerapeutica = indicacaoTerapeutica;
    }

    /**
     * Método: getDosagem
     * Retorna a dosagem do medicamento.
     * 
     * @return A dosagem do medicamento.
     */
    public String getDosagem() {
        return dosagem;
    }

    /**
     * Método: setDosagem
     * Define a dosagem do medicamento.
     * 
     * @param dosagem A dosagem do medicamento.
     */
    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    /**
     * Método: getViaAdmissao
     * Retorna a via de admissão do medicamento.
     * 
     * @return A via de admissão do medicamento.
     */
    public String getViaAdmissao() {
        return viaAdmissao;
    }

    /**
     * Método: setViaAdmissao
     * Define a via de admissão do medicamento.
     * 
     * @param viaAdmissao A via de admissão do medicamento.
     */
    public void setViaAdmissao(String viaAdmissao) {
        this.viaAdmissao = viaAdmissao;
    }

    /**
     * Método estático: get
     * Retorna um objeto Produto.
     * 
     * @return O objeto Produto.
     */
    public static Produto get() {
        return null;
    }

    /**
     * Método: toString
     * Retorna uma representação em string do objeto Medicamento.
     * 
     * @return A representação em string do objeto Medicamento.
     */
    @Override
    public String toString() {
        return " R$ " + valor;
    }

    public void setValor(double d) {
    }
}
