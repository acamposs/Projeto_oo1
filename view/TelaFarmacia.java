package view;

import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import Model.Cosmetico;
import Model.Farmacia;
import Model.Medicamento;
import Model.Produto;

public class TelaFarmacia {

    private static JFrame janela = new JFrame("Farmacia da Márcia");
    private Farmacia farmacia;


    public TelaFarmacia() {
		this.farmacia = new Farmacia(); 
        this.iniciaComponentes();
	}

    public void iniciaComponentes() {

		// Criando componentes
	    	Color rosinha = Color.decode("#FFC0CB");
            ImageIcon iconLogo = new ImageIcon("logomenu.png");
            ImageIcon iconCasa = new ImageIcon("casinha.png");
            ImageIcon iconRemedio = new ImageIcon("remedio.png");
            ImageIcon iconSacolinha = new ImageIcon("sacolinha.png");
            ImageIcon iconAdm = new ImageIcon("adm.png");
            Border bordaPersonalizada = BorderFactory.createLineBorder(Color.PINK);
            Border bordaTransparente = BorderFactory.createLineBorder(Color.WHITE);
            Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
            Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 12);
            
            JTextField campoPesquisa = new JTextField();
            JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
            JLabel logo = new JLabel(iconLogo);
            JButton busca = new JButton("Buscar");

        
        
        
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

        //Listagem de produtos
            //instaciando uma lista de produtos
                Medicamento paracetamol = new Medicamento("Paracetamol", "30/09/2024", "neo quimica", 5.90, "febre e dor", "750mg" , "oral");
                Medicamento dipirona = new Medicamento("Dipirona Sódica", "30/09/2024", "neo quimica", 16.9, "febre e dor", "1g" , "oral");
                Medicamento benegrip = new Medicamento("Benegrip", "30/09/2024", "Hypera", 19.90, "Sintomas de gripe", "500mg" , "oral");
                Cosmetico laRoche = new Cosmetico("La Roche-Posay ", "30/09/2024", "La Roche-Posay", 79.90, "gel de limpeza", "Rosto");
                Cosmetico vichy = new Cosmetico("Vichy Ideal Soleil Clarify", "30/09/2024", "Vichy", 99.90, "Protetor Solar Facial FPS60", "Rosto");
                Cosmetico carmed = new Cosmetico("Carmed Fini Beijos", "30/09/2024", " Carmed", 25.90, "Protetor Labial ", "Labios");
                ArrayList <Produto> listaProdutos = farmacia.getListaProdutos();
                farmacia.adicionarProdutos(laRoche);
                farmacia.adicionarProdutos(paracetamol);
                farmacia.adicionarProdutos(dipirona);
                farmacia.adicionarProdutos(benegrip);
                farmacia.adicionarProdutos(vichy);
                farmacia.adicionarProdutos(carmed);

            //criando a lista e adicionando na janela
                JPanel painelProdutos = new JPanel(new GridLayout(0, 2));
                for (Produto produto : listaProdutos) {
                    JLabel label = new JLabel(produto.getNomeProduto());
                    label.setHorizontalAlignment(SwingConstants.CENTER); // Define o alinhamento central
                    painelProdutos.add(label);
                }
            

		// Determinando tamanho dos ícones e personalização dos componentes
            logo.setBounds(10, 20, 290, 60);
            separator.setBounds(0, 525, 450, 10);
            separator.setForeground(new Color(255, 204, 204));
            campoPesquisa.setBounds(20, 110, 300, 40);
            campoPesquisa.setText("   O que você esta buscando?");
            campoPesquisa.setForeground(Color.GRAY);
            campoPesquisa.setBorder(bordaPersonalizada); 
            painelProdutos.setBounds(20, 170, 390, 330);
            painelProdutos.setBackground(Color.WHITE);
            painelProdutos.setBorder(bordaPersonalizada);

            busca.setBounds(335, 110, 80, 40);
            busca.setBackground(Color.WHITE);
            busca.setFont(fonteTexto);
            busca.setBorder(bordaPersonalizada);
		
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
            janela.add(campoPesquisa);
            janela.add(busca);
            janela.add(separator);
            janela.add(menu);
            janela.add(medicamento);
            janela.add(cosmetico);
            janela.add(administrador);
            janela.add( painelProdutos);


		// Determinando tamanho padrão da janela
            janela.setSize(450, 650);
            janela.setResizable(false);
            janela.setLocationRelativeTo(null);
            janela.getContentPane().setBackground(Color.WHITE);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);
        
        // Adicionando ações nos botões
        
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
            
            //Ação do botão de menu
                menu.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    TelaFarmacia menu = new TelaFarmacia();		
                }
            });

            //Ação do botão de admnistrador 
                administrador.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    TelaCadastraProduto janelaCadastra = new TelaCadastraProduto();		
                }
            });

    }
        public static void main(String[] args) {
        TelaFarmacia menu = new TelaFarmacia();
        //TestarBotao botao = new TestarBotao();
    }


}



