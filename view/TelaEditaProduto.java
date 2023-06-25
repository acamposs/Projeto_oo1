package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

import Model.Farmacia;
import Model.Produto;

public class TelaEditaProduto {
    private static JFrame janela = new JFrame("Editar Produtos");
       
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


    public TelaEditaProduto() {
        this.iniciaComponentes();
	}

    public void iniciaComponentes() {

		    Color rosinha = Color.decode("#FFC0CB");
            Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
            Font fonteTitulo = new Font("Segoe UI Black", Font.BOLD, 18);
            Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
            Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 16);

            // Criando Botão Salvar
            JButton salvar = new JButton("Salvar");
            salvar.addActionListener(e -> salvarMedicamento());



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


                nomeProdutoLabel.setBounds(30, 20, 150, 25);
                nomeProdutoLabel.setFont(fonteTexto);
                nomeProdutoTextField.setBounds(195, 20, 200, 25);
                dataValidadeLabel.setBounds(30, 50, 150, 25);
                dataValidadeLabel.setFont(fonteTexto);
                dataValidadeTextField.setBounds(195,50, 200, 25);
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


		
		// adicionando componentes na janela
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



		// Determinando tamanho padrão da janela
            janela.setSize(450, 400);
            janela.setResizable(false);
            janela.setLocationRelativeTo(null);
            janela.getContentPane().setBackground(Color.WHITE);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);




        }

 private void salvarMedicamento() {
        // Aqui você pode implementar a lógica para salvar as alterações do medicamento
        // utilizando os valores obtidos dos campos da tela
        
        String nome = nomeProdutoTextField.getText();
        String validade = dataValidadeTextField.getText();
        String fabricante = fabricanteTextField.getText();
        String valor = valorTextField.getText();
        String indicacao = indicacaoTextField.getText();
        String dosagem = dosagemTextField.getText();
        String admissao = viaAdmissaoTextField.getText();
        String funcao = funcaoTextField.getText();
        String aplicacao = aplicacaoTextField.getText();
        // ...
        // Exemplo de exibição dos valores
        if (!funcao.isEmpty()){
            JOptionPane.showMessageDialog (null, "O Cosmético foi atualizado com sucesso!   \n" + "\nNome: " + nome + "\nData de Validade: " + validade
       + "\nFabricante: " + fabricante+ "\nvalor: R$ " + valor + "\nFunção: " + funcao + "\nAplicação: " + aplicacao);
       
    } else {
        JOptionPane.showMessageDialog (null, "O Medicamento foi atualizado com sucesso!    \n" + "\nNome: " + nome + "\nData de Validade: " + validade
       + "\nFabricante: " + fabricante+ "\nvalor: R$ " + valor + "\nIndicação Terapêutica: " + indicacao + "\nDosagem: " + dosagem + "\nVia de Admissão: " + admissao + "\n ");
    }
    }

    public static void main(String[] args) {
        TelaEditaProduto edita = new TelaEditaProduto();
}
}
