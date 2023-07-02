package br.com.farmacia.farmaciamaven.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import br.com.farmacia.farmaciamaven.Model.Cosmetico;
import br.com.farmacia.farmaciamaven.Model.Medicamento;
import br.com.farmacia.farmaciamaven.services.impl.MedicamentoService;
import br.com.farmacia.farmaciamaven.services.impl.CosmeticoService;

/**
 * 
 * Classe: TelaProduto
 * 
 * Classe responsável por exibir a tela de cadastro de produtos.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class TelaProduto {
    private static JFrame janela = new JFrame("Produto");
    private static JLabel titulo = new JLabel("Cadastrar um novo produto");

    // Criando um JComboBox para selecionar o tipo de produto
    final String[] tiposProduto = { "Medicamento", "Cosmético" };
    final JComboBox<String> tipoProdutoComboBox = new JComboBox<>(tiposProduto);
    final JLabel seleciona = new JLabel("Tipo de Produto:");

    private MedicamentoService medicamentoService = new MedicamentoService();
    private CosmeticoService cosmeticoService = new CosmeticoService();

    /**
     * Construtor da classe TelaProduto.
     * Inicializa os componentes da tela.
     */
    public TelaProduto() {
        this.iniciaComponentes();
    }

    /**
     * Inicializa os componentes da tela de cadastro de produtos.
     */
    public void iniciaComponentes() {
        // Configurações visuais e componentes
        final Color rosinha = Color.decode("#FFC0CB");
        final Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
        final Font fonteTitulo = new Font("Segoe UI Black", Font.BOLD, 20);
        final Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
        final Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 16);
        final JLabel tituloMed = new JLabel("Medicamento");
        final JLabel tituloCos = new JLabel("Cosmético");

        // Criando os campos de texto para o cadastro de produtos
        final JTextField nomeProdutoTextField = new JTextField();
        final JTextField dataValidadeTextField = new JTextField();
        final JTextField fabricanteTextField = new JTextField();
        final JTextField valorTextField = new JTextField();

        // Criando os rótulos para os campos de texto
        final JLabel nomeProdutoLabel = new JLabel("Nome do Produto:");
        final JLabel dataValidadeLabel = new JLabel("Data de Validade:");
        final JLabel fabricanteLabel = new JLabel("Fabricante:");
        final JLabel valorLabel = new JLabel("Valor:");

        // Criando os campos específicos para medicamentos
        final JTextField indicacaoTextField = new JTextField();
        final JTextField dosagemTextField = new JTextField();
        final JTextField viaAdmissaoTextField = new JTextField();

        // Criando os rótulos para os campos específicos de medicamentos
        final JLabel indicacaoLabel = new JLabel("Indicação Terapêutica:");
        final JLabel dosagemLabel = new JLabel("Dosagem:");
        final JLabel viaAdmissaoLabel = new JLabel("Via de Admissão:");

        // Criando os campos específicos para cosméticos
        final JTextField funcaoTextField = new JTextField();
        final JTextField aplicacaoTextField = new JTextField();

        // Criando os rótulos para os campos específicos de cosméticos
        final JLabel funcaoLabel = new JLabel("Função:");
        final JLabel aplicacaoLabel = new JLabel("Aplicação:");

        // Criando o botao de voltar e cadastrar
        final JButton voltarButton = new JButton("Voltar");
        final JButton cadastraMed = new JButton("Cadastrar");
        final JButton cadastraCos = new JButton("Cadastrar");

        // Determinando tamanho dos ícones e personalização dos componentes da seleção
        // de produto
        titulo.setFont(fonteTitulo);
        titulo.setForeground(rosinha);
        titulo.setBounds(60, 50, 400, 50);
        tituloMed.setFont(fonteTitulo);
        tituloMed.setForeground(rosinha);
        tituloMed.setBounds(20, 30, 300, 30);
        tituloCos.setFont(fonteTitulo);
        tituloCos.setForeground(rosinha);
        tituloCos.setBounds(20, 30, 300, 30);
        seleciona.setFont(fonteBotton);
        seleciona.setForeground(Color.GRAY);
        seleciona.setBounds(40, 150, 200, 50);
        tipoProdutoComboBox.setBounds(65, 200, 300, 20);
        tipoProdutoComboBox.setBackground(Color.WHITE);
        tipoProdutoComboBox.setFont(fonteTexto);

        // Determinando tamanho dos ícones e personalização dos componentes do cadastro
        nomeProdutoLabel.setBounds(30, 80, 150, 25);
        nomeProdutoLabel.setFont(fonteTexto);
        nomeProdutoTextField.setBounds(195, 80, 200, 25);
        dataValidadeLabel.setBounds(30, 110, 150, 25);
        dataValidadeLabel.setFont(fonteTexto);
        dataValidadeTextField.setBounds(195, 110, 200, 25);
        fabricanteLabel.setBounds(30, 140, 150, 25);
        fabricanteLabel.setFont(fonteTexto);
        fabricanteTextField.setBounds(195, 140, 200, 25);
        valorLabel.setBounds(30, 170, 150, 25);
        valorLabel.setFont(fonteTexto);
        valorTextField.setBounds(195, 170, 200, 25);
        indicacaoLabel.setBounds(30, 200, 150, 25);
        indicacaoLabel.setFont(fonteTexto);
        indicacaoTextField.setBounds(195, 200, 200, 25);
        funcaoLabel.setBounds(30, 200, 150, 25);
        funcaoLabel.setFont(fonteTexto);
        funcaoTextField.setBounds(195, 200, 200, 25);
        dosagemLabel.setBounds(30, 230, 200, 25);
        dosagemLabel.setFont(fonteTexto);
        dosagemTextField.setBounds(195, 230, 200, 25);
        aplicacaoLabel.setBounds(30, 230, 200, 25);
        aplicacaoLabel.setFont(fonteTexto);
        aplicacaoTextField.setBounds(195, 230, 200, 25);
        viaAdmissaoLabel.setBounds(30, 260, 200, 25);
        viaAdmissaoLabel.setFont(fonteTexto);
        viaAdmissaoTextField.setBounds(195, 260, 200, 25);

        // Determinando tamanho dos ícones e personalização dos botões
        voltarButton.setBounds(110, 330, 100, 30);
        voltarButton.setBackground(Color.WHITE);
        voltarButton.setFont(fonteTexto);
        voltarButton.setBorder(bordaPersonalizada);
        cadastraMed.setBounds(220, 330, 100, 30);
        cadastraMed.setBackground(Color.WHITE);
        cadastraMed.setFont(fonteTexto);
        cadastraCos.setBorder(bordaPersonalizada);
        cadastraCos.setBounds(220, 330, 100, 30);
        cadastraCos.setBackground(Color.WHITE);
        cadastraCos.setFont(fonteTexto);
        cadastraCos.setBorder(bordaPersonalizada);

        // Ação do botão "Voltar"
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selecionaTipoProduto();
            }
        });

        // Ação do JComboBox para atualizar a interface com base na seleção do tipo de
        // produto
        tipoProdutoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remover os campos específicos anteriores
                janela.getContentPane().removeAll();

                // Adicionar os campos gerais novamente
                janela.add(nomeProdutoLabel);
                janela.add(nomeProdutoTextField);
                janela.add(dataValidadeLabel);
                janela.add(dataValidadeTextField);
                janela.add(fabricanteLabel);
                janela.add(fabricanteTextField);
                janela.add(valorLabel);
                janela.add(valorTextField);

                // Verificar o tipo de produto selecionado
                String tipoProduto = (String) tipoProdutoComboBox.getSelectedItem();
                if (tipoProduto.equals("Medicamento")) {
                    // Adicionar os campos específicos para medicamentos
                    janela.add(tituloMed);
                    janela.add(indicacaoLabel);
                    janela.add(indicacaoTextField);
                    janela.add(dosagemLabel);
                    janela.add(dosagemTextField);
                    janela.add(viaAdmissaoLabel);
                    janela.add(viaAdmissaoTextField);
                    janela.add(voltarButton);
                    janela.add(cadastraMed);
                } else if (tipoProduto.equals("Cosmético")) {
                    // Adicionar os campos específicos para cosméticos
                    janela.add(tituloCos);
                    janela.add(funcaoLabel);
                    janela.add(funcaoTextField);
                    janela.add(aplicacaoLabel);
                    janela.add(aplicacaoTextField);
                    janela.add(voltarButton);
                    janela.add(cadastraCos);
                }

                // Atualizar a interface
                janela.revalidate();
                janela.repaint();
            }
        });

        // Adicionar componentes na janela
        janela.setLayout(null);
        janela.add(titulo);
        janela.add(seleciona);
        janela.add(tipoProdutoComboBox);

        // Configurações padrão da janela
        janela.setSize(450, 450);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.getContentPane().setBackground(Color.WHITE);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        // Ação do botão "Cadastrar" para medicamentos
        cadastraMed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Medicamento med = new Medicamento();
                med.setNomeProduto(nomeProdutoTextField.getText());
                med.setDataValidade(dataValidadeTextField.getText());
                med.setFabricante(fabricanteTextField.getText());
                med.setValor(valorTextField.getText());
                med.setIndicacaoTerapeutica(indicacaoTextField.getText());
                med.setDosagem(dosagemTextField.getText());
                med.setViaAdmissao(viaAdmissaoTextField.getText());
                medicamentoService.insert(med);
                janela.setVisible(false);
                TelaCadastraProduto menu = new TelaCadastraProduto();
                JOptionPane.showMessageDialog(null, "Medicamento cadastrado com sucesso!");
                selecionaTipoProduto();

                nomeProdutoTextField.setText("");
                dataValidadeTextField.setText("");
                fabricanteTextField.setText("");
                valorTextField.setText("");
                indicacaoTextField.setText("");
                dosagemTextField.setText("");
                viaAdmissaoTextField.setText("");
            }
        });

        // Ação do botão "Cadastrar" para cosméticos
        cadastraCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cosmetico cos = new Cosmetico();
                cos.setNomeProduto(nomeProdutoTextField.getText());
                cos.setDataValidade(dataValidadeTextField.getText());
                cos.setFabricante(fabricanteTextField.getText());
                cos.setValor(valorTextField.getText());
                cos.setFuncao(funcaoTextField.getText());
                cos.setAplicacao(aplicacaoTextField.getText());
                cosmeticoService.insert(cos);
                janela.setVisible(false);
                TelaCadastraProduto menu = new TelaCadastraProduto();
                JOptionPane.showMessageDialog(null, "O Cosmético foi cadastrado com sucesso!");
                selecionaTipoProduto();

                nomeProdutoTextField.setText("");
                dataValidadeTextField.setText("");
                fabricanteTextField.setText("");
                valorTextField.setText("");
                funcaoTextField.setText("");
                aplicacaoTextField.setText("");
            }
        });
    }

    /**
     * Método responsável por exibir a seleção do tipo de produto.
     */
    public void selecionaTipoProduto() {
        janela.getContentPane().removeAll();
        janela.setLayout(null);
        janela.add(titulo);
        janela.add(seleciona);
        janela.add(tipoProdutoComboBox);
        // Atualizar a interface
        janela.revalidate();
        janela.repaint();
    }

    /**
     * Método principal para execução da aplicação.
     *
     * @param args Os argumentos de linha de comando.
     */
    public static void main(String[] args) {
        TelaProduto p = new TelaProduto();
    }
}
