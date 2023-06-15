package view;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class TelaFarmacia {

    private static JFrame janela = new JFrame("Farmacia da Márcia");
	      

    public TelaFarmacia() {
		this.iniciaComponentes();
	}

    public void iniciaComponentes() {

		// Criando componentes
		ImageIcon iconLogo = new ImageIcon("logocorcerta.png");
        ImageIcon iconCasa = new ImageIcon("casinha.png");
        ImageIcon iconRemedio = new ImageIcon("remedio.png");
        ImageIcon iconSacolinha = new ImageIcon("sacolinha.png");
        ImageIcon iconAdm = new ImageIcon("adm.png");
		JLabel logo = new JLabel(iconLogo);
		JButton busca = new JButton("Buscar");

        JButton menu = new JButton(iconCasa);
        menu.setLayout(new BorderLayout());
        JLabel txtMenu = new JLabel("menu");
        txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
        menu.add(txtMenu, BorderLayout.SOUTH);
        
        JButton medicamento = new JButton(iconRemedio);
        medicamento.setLayout(new BorderLayout());
        JLabel txtMedicamento = new JLabel("medicamentos");
        txtMedicamento.setHorizontalAlignment(SwingConstants.CENTER);
        medicamento.add(txtMedicamento, BorderLayout.SOUTH);

        JButton cosmetico = new JButton(iconSacolinha);
        cosmetico.setLayout(new BorderLayout());
        JLabel txtCosmetico = new JLabel("cosmetico");
        txtCosmetico.setHorizontalAlignment(SwingConstants.CENTER);
        cosmetico.add(txtCosmetico, BorderLayout.SOUTH);
        
        JButton administrador = new JButton(iconAdm);
        administrador.setLayout(new BorderLayout());
        JLabel txtAdministrador = new JLabel("administrador");
        txtAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
        administrador.add(txtAdministrador, BorderLayout.SOUTH);
        
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
        Border bordaTransparente = BorderFactory.createLineBorder(Color.WHITE);

        Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
        Font fonteBotton = new Font("Yu Gothic UI Light", Font.PLAIN, 12);
        JTextField campoPesquisa = new JTextField();
	

		// Determinando tamanho dos ícones e personalização dos componentes
		logo.setBounds(10, 20, 290, 60);

        separator.setBounds(0, 525, 450, 10);
        separator.setForeground(Color.PINK);
        
		campoPesquisa.setBounds(20, 110, 300, 40);
		campoPesquisa.setText("   O que você esta buscando?");
		campoPesquisa.setForeground(Color.GRAY);
        campoPesquisa.setBorder(bordaPersonalizada); 

		busca.setBounds(335, 110, 80, 40);
		busca.setBackground(Color.WHITE);
		busca.setFont(fonteTexto);
        busca.setBorder(bordaPersonalizada);
		
        menu.setBounds(25, 530, 80, 60);
		menu.setBackground(Color.WHITE);
		txtMenu.setFont(fonteBotton);
        txtMenu.setForeground(Color.PINK);
        menu.setBorder(bordaTransparente);
        
        medicamento.setBounds(125, 530, 80, 60);
		medicamento.setBackground(Color.WHITE);
		txtMedicamento.setFont(fonteBotton);
        txtMedicamento.setForeground(Color.PINK);
        medicamento.setBorder(bordaTransparente);
        
        cosmetico.setBounds(225, 530, 80, 60);
		cosmetico.setBackground(Color.WHITE);
		txtCosmetico.setFont(fonteBotton);
        txtCosmetico.setForeground(Color.PINK);
        cosmetico.setBorder(bordaTransparente);
        
        administrador.setBounds(325, 530, 80, 60);
		administrador.setBackground(Color.WHITE);
		txtAdministrador.setFont(fonteBotton);
        txtAdministrador.setForeground(Color.PINK);
        administrador.setBorder(bordaTransparente);

		// Remover o a frase do campo de buusca para buscar

        campoPesquisa.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campoPesquisa.getText().equals("   O que você esta buscando?")) {
                    campoPesquisa.setText("");
                    campoPesquisa.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campoPesquisa.getText().isEmpty()) {
                    campoPesquisa.setText("   O que você esta buscando?");
                    campoPesquisa.setForeground(Color.GRAY);
                }
            }
        });

        // Adicionando ação de pesquisa
        busca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoPesquisa = campoPesquisa.getText();
                // Lógica para realizar a pesquisa com o texto digitado
                // ...
                System.out.println("Pesquisar por: " + textoPesquisa);
            }
        });
		campoPesquisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoPesquisa = campoPesquisa.getText();
                // Lógica para realizar a pesquisa com o texto digitado
                // ...
                System.out.println("Pesquisar por: " + textoPesquisa);
            }
        });

        // Tirando o foco do campoPesquisa
            busca.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    janela.requestFocusInWindow();
                 }
            });

		
		// Gerando janela com os parâmetros especificados
        janela.setLayout(null);
		janela.add(logo);
		janela.add(campoPesquisa);
		janela.add(busca);
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


}

