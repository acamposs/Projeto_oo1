package br.com.farmacia.farmaciamaven.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import br.com.farmacia.farmaciamaven.Model.Cosmetico;
import br.com.farmacia.farmaciamaven.Model.Medicamento;
import br.com.farmacia.farmaciamaven.view.TelaCadastraProduto;
import br.com.farmacia.farmaciamaven.services.impl.CosmeticoService;
import br.com.farmacia.farmaciamaven.services.impl.MedicamentoService;

/**
 * 
 * Classe: TelaEditaProduto
 * 
 * Classe responsável por exibir e editar informações de produtos em uma
 * farmácia.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class TelaEditaProduto {
    private static JFrame janela = new JFrame("Editar Produtos");
    private MedicamentoService medicamentoService = new MedicamentoService();
    private CosmeticoService cosmeticoService = new CosmeticoService();
    private TelaCadastraProduto telaCadastraProduto = new TelaCadastraProduto();

    // Criando os campos de texto para o cadastro de produtos
    private JTextField nomeProdutoTextField = new JTextField();
    private JTextField dataValidadeTextField = new JTextField();
    private JTextField fabricanteTextField = new JTextField();
    private JTextField valorTextField = new JTextField();
    // Criando os campos específicos para cosméticos
    private JTextField funcaoTextField = new JTextField();
    private JTextField aplicacaoTextField = new JTextField();
    // Criando os campos específicos para medicamentos
    private JTextField indicacaoTextField = new JTextField();
    private JTextField dosagemTextField = new JTextField();
    private JTextField viaAdmissaoTextField = new JTextField();

    /**
     * Construtor da classe TelaEditaProduto.
     * Inicializa os componentes da tela.
     */
    public TelaEditaProduto() {
        this.iniciaComponentes();
    }

    /**
     * Inicializa os componentes da tela de edição de produtos.
     */
    public void iniciaComponentes() {
        // Configurações visuais
        Color rosinha = Color.decode("#FFC0CB");
        Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
        Font fonteTitulo = new Font("Segoe UI Black", Font.BOLD, 18);
        Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
        Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 16);

        // Criando Botão Salvar
        JButton salvar = new JButton("Salvar");

        // Criando os rótulos para os campos de texto
        JLabel nomeProdutoLabel = new JLabel("Nome do Produto:");
        JLabel dataValidadeLabel = new JLabel("Data de Validade:");
        JLabel fabricanteLabel = new JLabel("Fabricante:");
        JLabel valorLabel = new JLabel("Valor:");

        // Criando os rótulos para os campos específicos de medicamentos
        JLabel indicacaoLabel = new JLabel("Indicação Terapêutica:");
        JLabel dosagemLabel = new JLabel("Dosagem:");
        JLabel viaAdmissaoLabel = new JLabel("Via de Administração:");

        // Criando os rótulos para os campos específicos de cosméticos
        JLabel funcaoLabel = new JLabel("Função:");
        JLabel aplicacaoLabel = new JLabel("Aplicação:");

        // Posicionamento e tamanho dos componentes
        nomeProdutoLabel.setBounds(30, 20, 150, 25);
        nomeProdutoLabel.setFont(fonteTexto);
        nomeProdutoTextField.setBounds(195, 20, 200, 25);
        dataValidadeLabel.setBounds(30, 50, 150, 25);
        dataValidadeLabel.setFont(fonteTexto);
        dataValidadeTextField.setBounds(195, 50, 200, 25);
        fabricanteLabel.setBounds(30, 80, 150, 25);
        fabricanteLabel.setFont(fonteTexto);
        fabricanteTextField.setBounds(195, 80, 200, 25);
        valorLabel.setBounds(30, 110, 150, 25);
        valorLabel.setFont(fonteTexto);
        valorTextField.setBounds(195, 110, 200, 25);
        indicacaoLabel.setBounds(30, 140, 150, 25);
        indicacaoLabel.setFont(fonteTexto);
        indicacaoTextField.setBounds(195, 140, 200, 25);
        dosagemLabel.setBounds(30, 170, 150, 25);
        dosagemLabel.setFont(fonteTexto);
        dosagemTextField.setBounds(195, 170, 200, 25);
        viaAdmissaoLabel.setBounds(30, 200, 200, 25);
        viaAdmissaoLabel.setFont(fonteTexto);
        viaAdmissaoTextField.setBounds(195, 200, 200, 25);
        funcaoLabel.setBounds(30, 230, 200, 25);
        funcaoLabel.setFont(fonteTexto);
        funcaoTextField.setBounds(195, 230, 200, 25);
        aplicacaoLabel.setBounds(30, 260, 200, 25);
        aplicacaoLabel.setFont(fonteTexto);
        aplicacaoTextField.setBounds(195, 260, 200, 25);
        salvar.setBounds(160, 310, 100, 30);
        salvar.setBackground(Color.WHITE);
        salvar.setFont(fonteTexto);
        salvar.setBorder(bordaPersonalizada);

        // Adicionando componentes na janela
        janela.setLayout(null);
        janela.add(nomeProdutoLabel);
        janela.add(nomeProdutoTextField);
        janela.add(dataValidadeLabel);
        janela.add(dataValidadeTextField);
        janela.add(fabricanteLabel);
        janela.add(fabricanteTextField);
        janela.add(valorLabel);
        janela.add(valorTextField);
        janela.add(indicacaoLabel);
        janela.add(indicacaoTextField);
        janela.add(dosagemLabel);
        janela.add(dosagemTextField);
        janela.add(viaAdmissaoLabel);
        janela.add(viaAdmissaoTextField);
        janela.add(funcaoLabel);
        janela.add(funcaoTextField);
        janela.add(aplicacaoLabel);
        janela.add(aplicacaoTextField);
        janela.add(salvar);

        // Configurações da janela
        janela.setSize(450, 400);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.getContentPane().setBackground(Color.WHITE);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);

        // Ação do botão salvar
        salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeProdutoTextField.getText();
                String validade = dataValidadeTextField.getText();
                String fabricante = fabricanteTextField.getText();
                String valor = valorTextField.getText();
                String indicacao = indicacaoTextField.getText();
                String dosagem = dosagemTextField.getText();
                String admissao = viaAdmissaoTextField.getText();
                String funcao = funcaoTextField.getText();
                String aplicacao = aplicacaoTextField.getText();

                if (funcao.isEmpty()) {
                    // Atualização dos medicamentos
                    Medicamento med = new Medicamento();
                    med.setNomeProduto(nomeProdutoTextField.getText());
                    med.setDataValidade(dataValidadeTextField.getText());
                    med.setFabricante(fabricanteTextField.getText());
                    med.setValor(valorTextField.getText());
                    med.setIndicacaoTerapeutica(indicacaoTextField.getText());
                    med.setDosagem(dosagemTextField.getText());
                    med.setViaAdmissao(viaAdmissaoTextField.getText());
                    medicamentoService.update(med);
                    TelaCadastraProduto menu = new TelaCadastraProduto();
                    janela.setVisible(false);
                    JOptionPane.showMessageDialog(null, " O Medicamento foi atualizado com sucesso!");
                } else {
                    // Atualização dos cosméticos
                    Cosmetico cos = new Cosmetico();
                    cos.setNomeProduto(nomeProdutoTextField.getText());
                    cos.setDataValidade(dataValidadeTextField.getText());
                    cos.setFabricante(fabricanteTextField.getText());
                    cos.setValor(valorTextField.getText());
                    cos.setFuncao(funcaoTextField.getText());
                    cos.setAplicacao(aplicacaoTextField.getText());
                    cosmeticoService.update(cos);
                    TelaCadastraProduto menu = new TelaCadastraProduto();
                    janela.setVisible(false);
                    JOptionPane.showMessageDialog(null, " O Cosmético foi atualizado com sucesso!");
                }
            }
        });
    }

    /**
     * Define os valores dos campos de texto para produtos do tipo medicamento.
     *
     * @param nomeProduto  O nome do produto.
     * @param dataValidade A data de validade do produto.
     * @param fabricante   O fabricante do produto.
     * @param valor        O valor do produto.
     * @param indicacao    A indicação terapêutica do medicamento.
     * @param dosagem      A dosagem do medicamento.
     * @param viaAdmissao  A via de administração do medicamento.
     */
    public void setValoresMed(String nomeProduto, String dataValidade, String fabricante, String valor,
            String indicacao, String dosagem, String viaAdmissao) {
        nomeProdutoTextField.setText(nomeProduto);
        dataValidadeTextField.setText(dataValidade);
        fabricanteTextField.setText(fabricante);
        valorTextField.setText(valor);
        indicacaoTextField.setText(indicacao);
        dosagemTextField.setText(dosagem);
        viaAdmissaoTextField.setText(viaAdmissao);
    }

    /**
     * Define os valores dos campos de texto para produtos do tipo cosmético.
     *
     * @param nomeProduto  O nome do produto.
     * @param dataValidade A data de validade do produto.
     * @param fabricante   O fabricante do produto.
     * @param valor        O valor do produto.
     * @param funcao       A função do cosmético.
     * @param aplicacao    A aplicação do cosmético.
     */
    public void setValoresCos(String nomeProduto, String dataValidade, String fabricante, String valor, String funcao,
            String aplicacao) {
        nomeProdutoTextField.setText(nomeProduto);
        dataValidadeTextField.setText(dataValidade);
        fabricanteTextField.setText(fabricante);
        valorTextField.setText(valor);
        funcaoTextField.setText(funcao);
        aplicacaoTextField.setText(aplicacao);
    }

    /**
     * Método principal para execução da aplicação.
     *
     * @param args Os argumentos de linha de comando.
     */
    public static void main(String[] args) {
        TelaEditaProduto edita = new TelaEditaProduto();
    }
}
