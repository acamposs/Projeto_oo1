package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaFofinha extends JFrame {


    public JanelaFofinha() {
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

            //Criando o botao de voltar
            JButton voltarButton = new JButton("Voltar");
            // Crie um ActionListener para o botão "Voltar"
            voltarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                // Adicione o JComboBox à janela
                add(new JLabel("Tipo de Produto:"));
                add(tipoProdutoComboBox);
                  // Atualize a interface
                    revalidate();
                    repaint();
                }
            });

            // Criando um ActionListener para atualizar a interface com base na seleção
            tipoProdutoComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Remova os campos específicos anteriores
                    getContentPane().removeAll();

                    // Adicione os campos gerais novamente
                    add(nomeProdutoLabel);
                    add(nomeProdutoTextField);
                    add(dataValidadeLabel);
                    add(dataValidadeTextField);
                    add(fabricanteLabel);
                    add(fabricanteTextField);
                    add(valorLabel);
                    add(valorTextField);
                    

                    // Verifique o tipo de produto selecionado
                    String tipoProduto = (String) tipoProdutoComboBox.getSelectedItem();
                    if (tipoProduto.equals("Medicamento")) {
                        // Adicione os campos específicos para medicamentos
                        add(indicacaoLabel);
                        add(indicacaoTextField);
                        add(dosagemLabel);
                        add(dosagemTextField);
                        add(viaAdmissaoLabel);
                        add(viaAdmissaoTextField);
                        add(voltarButton);
                    } else if (tipoProduto.equals("Cosmético")) {
                        // Adicione os campos específicos para cosméticos
                        add(funcaoLabel);
                        add(funcaoTextField);
                        add(aplicacaoLabel);
                        add(aplicacaoTextField);
                        add(voltarButton);
                    }

                    // Atualize a interface
                    revalidate();
                    repaint();
                }

            });

        // Adicione o JComboBox à janela
        add(new JLabel("Tipo de Produto:"));
        add(tipoProdutoComboBox);

            setTitle("Cadastro de Produtos");
            setSize(400, 300);
            setLayout(new GridLayout(8, 2));
            setVisible(true);
    }

    public static void main(String[] args) {
        JanelaFofinha app = new JanelaFofinha();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}