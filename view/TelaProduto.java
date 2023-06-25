package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

import Model.Produto;
import view.TelaCadastraProduto;

import java.awt.*;


public class TelaProduto {
    private static JFrame janela = new JFrame("CadastraProdutos");
    private static JLabel titulo = new JLabel("Cadastrar um novo produto");
    private JTextField nomeProdutoTextField;
    DefaultListModel<String> listModel;

    
    public TelaProduto() {
        this.iniciaComponentes();
	}

    public void iniciaComponentes() {

		    // Criando componentes
	    	Color rosinha = Color.decode("#FFC0CB");
            Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
            Font fonteTitulo = new Font("Segoe UI Black", Font.BOLD, 18);
            Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
            Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 16);
            JLabel tituloMed = new JLabel("Medicamento");
            JLabel tituloCos = new JLabel("Cosmético");

            // Criando os campos de texto para o cadastro de produtos
            JTextField nomeProdutoTextField = new JTextField();
            JTextField dataValidadeTextField = new JTextField();
            JTextField fabricanteTextField = new JTextField();
            JTextField valorTextField = new JTextField();

            // Criando os rótulos para os campos de texto
            JLabel nomeProdutoLabel = new JLabel("Nome do Produto:");
            JLabel dataValidadeLabel = new JLabel("Data de Validade:");
            JLabel fabricanteLabel = new JLabel("Fabricante:");
            JLabel valorLabel = new JLabel("Valor:");

            // Criando os campos específicos para medicamentos
            JTextField indicacaoTextField = new JTextField();
            JTextField dosagemTextField = new JTextField();
            JTextField viaAdmissaoTextField = new JTextField();

            // Criando os rótulos para os campos específicos de medicamentos
            JLabel indicacaoLabel = new JLabel("Indicação Terapêutica:");
            JLabel dosagemLabel = new JLabel("Dosagem:");
            JLabel viaAdmissaoLabel = new JLabel("Via de Administração:");

            // Criando os campos específicos para cosméticos
            JTextField funcaoTextField = new JTextField();
            JTextField aplicacaoTextField = new JTextField();

            // Criando os rótulos para os campos específicos de cosméticos
            JLabel funcaoLabel = new JLabel("Função:");
            JLabel aplicacaoLabel = new JLabel("Aplicação:");

            // Criando um JComboBox para selecionar o tipo de produto
            String[] tiposProduto = {"Medicamento", "Cosmético"};
            JComboBox<String> tipoProdutoComboBox = new JComboBox<>(tiposProduto);
            JLabel seleciona = new JLabel("Tipo de Produto:");

            //Criando o botao de voltar e cadastrar
            JButton voltarButton = new JButton("Voltar");
            JButton Cadastra = new JButton("Cadastrar");

            

                // Determinando tamanho dos ícones e personalização dos componentes
                titulo.setFont(fonteTitulo);
                titulo.setForeground(rosinha);
                titulo.setBounds(20, 10, 300, 50);
                tituloMed.setFont(fonteTitulo);
                tituloMed.setForeground(rosinha);
                tituloMed.setBounds(20, 30, 300, 30);
                tituloCos.setFont(fonteTitulo);
                tituloCos.setForeground(rosinha);
                tituloCos.setBounds(20, 30, 300, 30);
                seleciona.setFont(fonteBotton);
                seleciona.setForeground(Color.GRAY);
                seleciona.setBounds(40, 80, 200, 50);
                tipoProdutoComboBox.setBounds(65,130, 300, 20);
                tipoProdutoComboBox.setBackground(Color.WHITE);
                tipoProdutoComboBox.setFont(fonteTexto);
                nomeProdutoLabel.setBounds(30, 80, 150, 25);
                nomeProdutoLabel.setFont(fonteTexto);
                nomeProdutoTextField.setBounds(195, 80, 200, 25);
                dataValidadeLabel.setBounds(30, 110, 150, 25);
                dataValidadeLabel.setFont(fonteTexto);
                dataValidadeTextField.setBounds(195,110, 200, 25);
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
                voltarButton.setBounds(100, 310, 100, 30);
                voltarButton.setBackground(Color.WHITE);
                voltarButton.setFont(fonteTexto);
                voltarButton.setBorder(bordaPersonalizada);
                Cadastra.setBounds(220, 310, 100, 30);
                Cadastra.setBackground(Color.WHITE);
                Cadastra.setFont(fonteTexto);
                Cadastra.setBorder(bordaPersonalizada);
            
            
                // Crie um ActionListener para o botão "Voltar"
            voltarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    janela.getContentPane().removeAll();
                    janela.setLayout(null);
                    janela.add(titulo);
                    janela.add(seleciona);
                    janela.add(tipoProdutoComboBox);
                  // Atualize a interface
                    janela.revalidate();
                    janela.repaint();
                }
            });

            listModel = new DefaultListModel<>();
            JList<String> productList = new JList<>(listModel);

            Cadastra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              	        cadastrarProduto();
                    }
                    });


            // Criando um ActionListener para atualizar a interface com base na seleção
            tipoProdutoComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Remova os campos específicos anteriores
                    janela.getContentPane().removeAll();

                    // Adicione os campos gerais novamente
                    janela.add(nomeProdutoLabel);
                    janela.add(nomeProdutoTextField);
                    janela.add(dataValidadeLabel);
                    janela.add(dataValidadeTextField);
                    janela.add(fabricanteLabel);
                    janela.add(fabricanteTextField);
                    janela.add(valorLabel);
                    janela.add(valorTextField);
                    

                    // Verifique o tipo de produto selecionado
                    String tipoProduto = (String) tipoProdutoComboBox.getSelectedItem();
                    if (tipoProduto.equals("Medicamento")) {
                        // Adicione os campos específicos para medicamentos
                        janela.add(tituloMed);
                        janela.add(indicacaoLabel);
                        janela.add(indicacaoTextField);
                        janela.add(dosagemLabel);
                        janela.add(dosagemTextField);
                        janela.add(viaAdmissaoLabel);
                        janela.add(viaAdmissaoTextField);
                        janela.add(voltarButton);
                        janela.add(Cadastra);

                    } else if (tipoProduto.equals("Cosmético")) {
                        // Adicione os campos específicos para cosméticos
                        janela.add(tituloCos);
                        janela.add(funcaoLabel);
                        janela.add(funcaoTextField);
                        janela.add(aplicacaoLabel);
                        janela.add(aplicacaoTextField);
                        janela.add(voltarButton);
                        janela.add(Cadastra);
                    
                    }

                    // Atualize a interface
                    janela.revalidate();
                    janela.repaint();
                }

            });
       		  
		// adicionando componentes na janela
            janela.setLayout(null);
            janela.add(titulo);
            janela.add(seleciona);
            janela.add(tipoProdutoComboBox);
        
		// Determinando tamanho padrão da janela
            janela.setSize(450, 450);
            janela.setResizable(false);
            janela.setLocationRelativeTo(null);
            janela.getContentPane().setBackground(Color.WHITE);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);

          
    }
    
    public void cadastrarProduto() {
    String nomeProduto = nomeProdutoTextField.getText();
                    if (!nomeProduto.isEmpty()) {
                        listModel.addElement(nomeProduto);
                        nomeProdutoTextField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(janela, "Digite o nome do produto!");
                    }
    }
    public static void main(String[] args) {
        TelaProduto p = new TelaProduto();
}

}