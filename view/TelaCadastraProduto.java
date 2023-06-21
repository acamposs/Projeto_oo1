package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.FlowLayout;
import view.TelaProduto;

public class TelaCadastraProduto {
    private static JFrame janela = new JFrame("Farmacia da Márcia - Administrador");
    private static JLabel titulo = new JLabel("Página do Administrador");
    private JList<String> listaProdutos;
    private DefaultListModel<String> modelProdutos;

    public TelaCadastraProduto() {
        this.iniciaComponentes();
	}

    public void iniciaComponentes() {

        
		// Criando componentes
	    	Color rosinha = Color.decode("#FFC0CB");
            ImageIcon iconLogo = new ImageIcon("logo.png");
            ImageIcon iconCasa = new ImageIcon("casinha.png");
            ImageIcon iconRemedio = new ImageIcon("remedio.png");
            ImageIcon iconSacolinha = new ImageIcon("sacolinha.png");
            ImageIcon iconAdm = new ImageIcon("adm.png");
            Border bordaPersonalizada = BorderFactory.createLineBorder(rosinha);
            Border bordaTransparente = BorderFactory.createLineBorder(Color.WHITE);
            Font fonteTitulo = new Font("Segoe UI Black", Font.BOLD, 20);
            Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
            Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 12);
            JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
            JLabel logo = new JLabel(iconLogo);       
            
            //criando botão menu
                JButton menu = new JButton(iconCasa);
                menu.setLayout(new BorderLayout());
                JLabel txtMenu = new JLabel("menu");
                txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
                menu.add(txtMenu, BorderLayout.SOUTH); 
            //criando botão medicamentos
                JButton medicamento = new JButton(iconRemedio);
                medicamento.setLayout(new BorderLayout());
                JLabel txtMedicamento = new JLabel("medicamentos");
                txtMedicamento.setHorizontalAlignment(SwingConstants.CENTER);
                medicamento.add(txtMedicamento, BorderLayout.SOUTH);
            //criando botão cosmeticos
                JButton cosmetico = new JButton(iconSacolinha);
                cosmetico.setLayout(new BorderLayout());
                JLabel txtCosmetico = new JLabel("cosméticos");
                txtCosmetico.setHorizontalAlignment(SwingConstants.CENTER);
                cosmetico.add(txtCosmetico, BorderLayout.SOUTH);
            //criando botão administrador
                JButton administrador = new JButton(iconAdm);
                administrador.setLayout(new BorderLayout());
                JLabel txtAdministrador = new JLabel("administrador");
                txtAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
                administrador.add(txtAdministrador, BorderLayout.SOUTH);
        
            modelProdutos = new DefaultListModel<>();
            listaProdutos = new JList<>(modelProdutos);
            // Adiciona a lista a um painel com scroll
            JScrollPane scrollPane = new JScrollPane(listaProdutos);
            scrollPane.setPreferredSize(new Dimension(200, 150));
            
            
            // Botão para Cadastra produtos
            JButton Cadastra = new JButton("Cadastrar");
            Cadastra.addActionListener(e -> cadastraProduto());
                
            // Botão para remover produtos selecionados
            JButton Remover = new JButton("Remover");
            Remover.addActionListener(e -> removerProduto());

            // Botão para Editar produtos
            JButton Editar = new JButton("Editar");
            Editar.addActionListener(e -> editaProduto());
            
        // Determinando tamanho dos ícones e personalização dos componentes
            logo.setBounds(20, 20, 200, 50);
            titulo.setFont(fonteTitulo);
            titulo.setForeground(rosinha);
            titulo.setBounds(80, 80, 300, 50);
            separator.setBounds(0, 525, 450, 10);
            separator.setForeground(new Color(255, 204, 204));

            scrollPane.setBounds(90, 150, 250, 200);

            Cadastra.setBounds(75, 380, 80, 40);
            Cadastra.setBackground(Color.WHITE);
            Cadastra.setFont(fonteTexto);
            Cadastra.setBorder(bordaPersonalizada);
            
            Remover.setBounds(175, 380, 80, 40);
            Remover.setBackground(Color.WHITE);
            Remover.setFont(fonteTexto);
            Remover.setBorder(bordaPersonalizada);

            Editar.setBounds(275, 380, 80, 40);
            Editar.setBackground(Color.WHITE);
            Editar.setFont(fonteTexto);
            Editar.setBorder(bordaPersonalizada);
         		
            menu.setBounds(15, 530, 90, 60);
            menu.setBackground(Color.WHITE);
            txtMenu.setFont(fonteBotton);
            txtMenu.setForeground(rosinha);
            menu.setBorder(bordaTransparente);
            
            medicamento.setBounds(115, 530, 90, 60);
            medicamento.setBackground(Color.WHITE);
            txtMedicamento.setFont(fonteBotton);
            txtMedicamento.setForeground(rosinha);
            medicamento.setBorder(bordaTransparente);
            
            cosmetico.setBounds(215, 530, 90, 60);
            cosmetico.setBackground(Color.WHITE);
            txtCosmetico.setFont(fonteBotton);
            txtCosmetico.setForeground(rosinha);
            cosmetico.setBorder(bordaTransparente);
            
            administrador.setBounds(315, 530, 90, 60);
            administrador.setBackground(Color.WHITE);
            txtAdministrador.setFont(fonteBotton);
            txtAdministrador.setForeground(rosinha);
            administrador.setBorder(bordaTransparente);

		// adicionando componentes na janela
            janela.setLayout(null);
            janela.add(logo);
            janela.add(titulo);
            janela.add(separator);
            janela.add(menu);
            janela.add(medicamento);
            janela.add(cosmetico);
            janela.add(administrador);
            janela.add(scrollPane);
            janela.add(Cadastra);
            janela.add(Remover);
            janela.add(Editar);


		// Determinando tamanho padrão da janela
            janela.setSize(450, 650);
            janela.setResizable(false);
            janela.setLocationRelativeTo(null);
            janela.getContentPane().setBackground(Color.WHITE);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);


        }



private void cadastraProduto() {
    TelaProduto janelaProduto = new TelaProduto();
    String nomeProduto = "Novo Produto";
    modelProdutos.addElement(nomeProduto);


}

private void removerProduto() {
    int index = listaProdutos.getSelectedIndex();
    if (index != -1) {
        modelProdutos.remove(index);
    }
}

private void editaProduto () { 
	TelaDetalhesProduto detalhaProduto = new TelaDetalhesProduto();    
}


}