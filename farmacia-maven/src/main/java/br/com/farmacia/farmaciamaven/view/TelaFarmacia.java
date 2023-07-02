package br.com.farmacia.farmaciamaven.view;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

import br.com.farmacia.farmaciamaven.services.impl.CosmeticoService;
import br.com.farmacia.farmaciamaven.services.impl.MedicamentoService;
import br.com.farmacia.farmaciamaven.Model.Cosmetico;
import br.com.farmacia.farmaciamaven.Model.Medicamento;
import java.util.List;

/**
 * 
 * Classe: TelaFarmacia
 * 
 * Classe responsável por exibir a tela principal da farmácia.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class TelaFarmacia {

    private static JFrame janela = new JFrame("Farmacia da Márcia");

    private MedicamentoService medicamentoService = new MedicamentoService();
    private CosmeticoService cosmeticoService = new CosmeticoService();

    /**
     * Construtor da classe TelaFarmacia.
     * Inicializa os componentes da tela.
     */
    public TelaFarmacia() {
        this.iniciaComponentes();
    }

    /**
     * Inicializa os componentes da tela principal da farmácia.
     */
    public void iniciaComponentes() {
        // Configurações visuais e componentes
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
        Font fonteProdutos = new Font(Font.MONOSPACED, Font.PLAIN, 14);

        final JTextField campoPesquisa = new JTextField();
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
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
        JLabel txtCosmetico = new JLabel("cosméticos");
        txtCosmetico.setHorizontalAlignment(SwingConstants.CENTER);
        cosmetico.add(txtCosmetico, BorderLayout.SOUTH);

        JButton administrador = new JButton(iconAdm);
        administrador.setLayout(new BorderLayout());
        JLabel txtAdministrador = new JLabel("administrador");
        txtAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
        administrador.add(txtAdministrador, BorderLayout.SOUTH);

        DefaultTableCellRenderer direitaRenderer = new DefaultTableCellRenderer();
        direitaRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        String[] colunas = { "Produto", "Preço" };
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        JTable tabelaProdutos = new JTable(modelo);
        tabelaProdutos.setFont(fonteProdutos);

        JScrollPane scrollPane = new JScrollPane(tabelaProdutos);

        // Posicionamento e tamanho dos componentes
        logo.setBounds(10, 20, 290, 60);
        separator.setBounds(0, 525, 450, 10);
        separator.setForeground(new Color(255, 204, 204));
        campoPesquisa.setBounds(20, 110, 300, 40);
        campoPesquisa.setText("   O que você esta buscando?");
        campoPesquisa.setForeground(Color.GRAY);
        campoPesquisa.setBorder(bordaPersonalizada);
        scrollPane.setBounds(40, 170, 350, 330);
        scrollPane.setBackground(Color.WHITE);
        scrollPane.setFont(fonteProdutos);
        scrollPane.setBorder(bordaPersonalizada);
        tabelaProdutos.setIntercellSpacing(new Dimension(0, 0));
        busca.setBounds(335, 110, 80, 40);
        busca.setBackground(Color.WHITE);
        busca.setFont(fonteTexto);
        busca.setBorder(bordaPersonalizada);

        menu.setBounds(10, 530, 95, 60);
        menu.setBackground(Color.WHITE);
        txtMenu.setFont(fonteBotton);
        txtMenu.setForeground(rosinha);
        menu.setBorder(bordaTransparente);

        medicamento.setBounds(105, 530, 105, 60);
        medicamento.setBackground(Color.WHITE);
        txtMedicamento.setFont(fonteBotton);
        txtMedicamento.setForeground(rosinha);
        medicamento.setBorder(bordaTransparente);

        cosmetico.setBounds(210, 530, 105, 60);
        cosmetico.setBackground(Color.WHITE);
        txtCosmetico.setFont(fonteBotton);
        txtCosmetico.setForeground(rosinha);
        cosmetico.setBorder(bordaTransparente);

        administrador.setBounds(310, 530, 105, 60);
        administrador.setBackground(Color.WHITE);
        txtAdministrador.setFont(fonteBotton);
        txtAdministrador.setForeground(rosinha);
        administrador.setBorder(bordaTransparente);

        // Adicionando componentes na janela
        janela.setLayout(null);
        janela.add(logo);
        janela.add(campoPesquisa);
        janela.add(busca);
        janela.add(separator);
        janela.add(menu);
        janela.add(medicamento);
        janela.add(cosmetico);
        janela.add(administrador);
        janela.add(scrollPane);

        janela.setSize(450, 650);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.getContentPane().setBackground(Color.WHITE);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);

        // Ação do campo de pesquisa quando ganha o foco
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

        // Ação do botão de busca
        busca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoPesquisa.getText();

                List<Cosmetico> cosmeticos = cosmeticoService.searchByname(nome);
                List<Medicamento> medicamentos = medicamentoService.searchByname(nome);

                DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
                modelo.setRowCount(0);

                int maxSize = Math.max(cosmeticos.size(), medicamentos.size());

                for (int i = 0; i < maxSize; i++) {
                    Object[] linha = new Object[2];

                    if (i < cosmeticos.size()) {
                        linha[0] = cosmeticos.get(i).getNomeProduto();
                        linha[1] = cosmeticos.get(i).toString();
                        modelo.addRow(linha);
                    }

                    if (i < medicamentos.size()) {
                        linha[0] = medicamentos.get(i).getNomeProduto();
                        linha[1] = medicamentos.get(i).toString();
                        modelo.addRow(linha);
                    }
                }
                tabelaProdutos.getColumnModel().getColumn(1).setCellRenderer(direitaRenderer);
            }
        });

        // Ação do botão de menu
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaFarmacia menu = new TelaFarmacia();
            }
        });

        // Ação do botão de administrador
        administrador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastraProduto menu = new TelaCadastraProduto();
            }
        });

    }

    /**
     * Método principal para execução da aplicação.
     *
     * @param args Os argumentos de linha de comando.
     */
    public static void main(String[] args) {
        TelaFarmacia menu = new TelaFarmacia();
    }
}
