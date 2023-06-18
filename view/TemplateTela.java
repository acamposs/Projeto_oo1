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

public class TemplateTela {
    private static JFrame janela = new JFrame("Pagina do Administrador");
    private Farmacia farmacia;
    private Produto produto;

    public TemplateTela() {
		this.farmacia = new Farmacia(); 
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
            Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
            Border bordaTransparente = BorderFactory.createLineBorder(Color.WHITE);
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
        
        // Determinando tamanho dos ícones e personalização dos componentes
            logo.setBounds(20, 20, 200, 50);
            separator.setBounds(0, 525, 450, 10);
            separator.setForeground(new Color(255, 204, 204));
         		
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
            janela.add(separator);
            janela.add(menu);
            janela.add(medicamento);
            janela.add(cosmetico);
            janela.add(administrador);

		// Determinando tamanho padrão da janela
            janela.setSize(450, 650);
            janela.setResizable(false);
            janela.setLocationRelativeTo(null);
            janela.getContentPane().setBackground(Color.WHITE);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);
}
    //public static void main(String[] args) {
      //  TemplateTela cadastrar = new TemplateTela();
    //}
}
