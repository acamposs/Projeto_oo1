package br.com.farmacia.farmaciamaven.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import br.com.farmacia.farmaciamaven.Model.Medicamento;
import br.com.farmacia.farmaciamaven.Model.Produto;
import br.com.farmacia.farmaciamaven.Model.Cosmetico;
import br.com.farmacia.farmaciamaven.services.impl.CosmeticoService;
import br.com.farmacia.farmaciamaven.services.impl.MedicamentoService;

/**
 * 
 * Classe: TelaCadastraProduto
 * 
 * Classe responsável por exibir a tela de cadastro de produtos na farmácia.
 * 
 * @author Amanda Campos
 * @since 2023
 */
public class TelaCadastraProduto {
    private static JFrame janela = new JFrame("Farmacia da Márcia - Administrador");
    private static JLabel titulo = new JLabel("Página do Administrador");
    private TelaEditaProduto telaEditaProduto;
    private JTable tabela = new JTable();

    /**
     * Construtor da classe TelaCadastraProduto.
     * Inicia os componentes e carrega os produtos.
     */
    public TelaCadastraProduto() {
        this.iniciaComponentes();
        this.carregarProdutos();
    }

    /**
     * Inicializa os componentes da tela.
     */
    public void iniciaComponentes() {
        // Criando componentes
        Color rosinha = Color.decode("#FFC0CB");
        ImageIcon iconLogo = new ImageIcon("logo.png");
        ImageIcon iconCasa = new ImageIcon("casinha.png");
        ImageIcon iconRemedio = new ImageIcon("remedio.png");
        ImageIcon iconSacolinha = new ImageIcon("sacolinha.png");
        ImageIcon iconAdm = new ImageIcon("adm.png");
        ImageIcon iconRefresh = new ImageIcon("refresh.png");
        Border bordaPersonalizada = BorderFactory.createLineBorder(rosinha);
        Border bordaTransparente = BorderFactory.createLineBorder(Color.WHITE);
        Font fonteTitulo = new Font("Segoe UI Black", Font.BOLD, 20);
        Font fonteTexto = new Font("Yu Gothic UI Light", Font.PLAIN, 14);
        Font fonteBotton = new Font("Yu Gothic UI Light", Font.BOLD, 12);
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        JLabel logo = new JLabel(iconLogo);

        // criando botão menu
        JButton menu = new JButton(iconCasa);
        menu.setLayout(new BorderLayout());
        JLabel txtMenu = new JLabel("menu");
        txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
        menu.add(txtMenu, BorderLayout.SOUTH);

        // criando botão medicamentos
        JButton medicamento = new JButton(iconRemedio);
        medicamento.setLayout(new BorderLayout());
        JLabel txtMedicamento = new JLabel("medicamentos");
        txtMedicamento.setHorizontalAlignment(SwingConstants.CENTER);
        medicamento.add(txtMedicamento, BorderLayout.SOUTH);

        // criando botão cosmeticos
        JButton cosmetico = new JButton(iconSacolinha);
        cosmetico.setLayout(new BorderLayout());
        JLabel txtCosmetico = new JLabel("cosméticos");
        txtCosmetico.setHorizontalAlignment(SwingConstants.CENTER);
        cosmetico.add(txtCosmetico, BorderLayout.SOUTH);

        // criando botão administrador
        JButton administrador = new JButton(iconAdm);
        administrador.setLayout(new BorderLayout());
        JLabel txtAdministrador = new JLabel("administrador");
        txtAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
        administrador.add(txtAdministrador, BorderLayout.SOUTH);

        // Criando tabela de produtos para administrador
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[] { "Produto", "Validade", "Fabricante", "Valor", "Ind. Terapêutica",
                "Dosagem", "Via Admissão", "Função", "Aplicação" });
        tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);

        // Botão para Cadastra produtos
        JButton Cadastra = new JButton("Cadastrar");
        // Botão para remover produtos selecionados
        JButton Remover = new JButton("Remover");
        // Botão para Editar produtos
        JButton Editar = new JButton("Editar");
        // Botão para atualizar a tabela
        JButton Atualizar = new JButton(iconRefresh);

        // Determinando tamanho dos ícones e personalização dos componentes
        logo.setBounds(20, 20, 200, 50);
        titulo.setFont(fonteTitulo);
        titulo.setForeground(rosinha);
        titulo.setBounds(80, 80, 300, 50);
        separator.setBounds(0, 525, 450, 10);
        separator.setForeground(new Color(255, 204, 204));

        scrollPane.setBounds(25, 150, 400, 200);

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

        Atualizar.setBounds(390, 115, 25, 25);
        Atualizar.setBackground(Color.WHITE);
        txtAdministrador.setFont(fonteBotton);
        txtAdministrador.setForeground(rosinha);
        Atualizar.setBorder(bordaTransparente);

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
        janela.add(Atualizar);

        // Determinando tamanho padrão da janela
        janela.setSize(450, 650);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.getContentPane().setBackground(Color.WHITE);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);

        // Ação do botão de menu
        menu.addActionListener(new ActionListener() {
            /**
             * Método executado quando o botão de menu é clicado.
             * Abre a tela de menu principal da farmácia.
             */
            public void actionPerformed(ActionEvent e) {
                TelaFarmacia menu = new TelaFarmacia();
            }
        });

        // Ação do botão de menu
        administrador.addActionListener(new ActionListener() {
            /**
             * Método executado quando o botão de administrador é clicado.
             * Abre a tela de cadastro de produtos novamente.
             */
            public void actionPerformed(ActionEvent e) {
                TelaCadastraProduto menu = new TelaCadastraProduto();
            }
        });

        // Ação do botão de Cadastrar
        Cadastra.addActionListener(new ActionListener() {
            /**
             * Método executado quando o botão de cadastrar é clicado.
             * Abre a tela de cadastro de um novo produto.
             */
            public void actionPerformed(ActionEvent e) {
                TelaProduto cadastra = new TelaProduto();
            }
        });

        // Ação do botão de Atualizar
        Atualizar.addActionListener(new ActionListener() {
            /**
             * Método executado quando o botão de atualizar é clicado.
             * Atualiza a tabela de produtos.
             */
            public void actionPerformed(ActionEvent e) {
                carregarProdutos();
            }
        });

        // Ação do botão de Editar
        Editar.addActionListener(new ActionListener() {
            /**
             * Método executado quando o botão de editar é clicado.
             * Abre a tela de edição de um produto selecionado na tabela.
             */
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tabela.getSelectedRow();

                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                    String nomeProduto = (String) model.getValueAt(selectedRow, 0);
                    String validade = (String) model.getValueAt(selectedRow, 1);
                    String fabricante = (String) model.getValueAt(selectedRow, 2);
                    String valor = (String) model.getValueAt(selectedRow, 3);
                    String indTerapeutica = (String) model.getValueAt(selectedRow, 4);
                    String dosagem = (String) model.getValueAt(selectedRow, 5);
                    String viaAdmissao = (String) model.getValueAt(selectedRow, 6);
                    String funcao = (String) model.getValueAt(selectedRow, 7);
                    String aplicacao = (String) model.getValueAt(selectedRow, 8);

                    MedicamentoService medicamentoService = new MedicamentoService();
                    CosmeticoService cosmeticoService = new CosmeticoService();

                    Optional<Medicamento> medicamentoOptional = Optional.empty();
                    Optional<Cosmetico> cosmeticoOptional = Optional.empty();

                    List<Medicamento> medicamentos = medicamentoService.searchByname(nomeProduto);
                    if (!medicamentos.isEmpty()) {
                        medicamentoOptional = Optional.of(medicamentos.get(0));
                    } else {
                        List<Cosmetico> cosmeticos = cosmeticoService.searchByname(nomeProduto);
                        if (!cosmeticos.isEmpty()) {
                            cosmeticoOptional = Optional.of(cosmeticos.get(0));
                        }
                    }

                    if (medicamentoOptional.isPresent()) {
                        TelaEditaProduto telaEditaProduto = new TelaEditaProduto();
                        telaEditaProduto.setValoresMed(nomeProduto, validade, fabricante, valor, indTerapeutica,
                                dosagem, viaAdmissao);
                        Medicamento medicamento = medicamentoOptional.get();
                        medicamentoService.deleteById(medicamento.getId());
                    } else if (cosmeticoOptional.isPresent()) {
                        TelaEditaProduto telaEditaProduto = new TelaEditaProduto();
                        telaEditaProduto.setValoresCos(nomeProduto, validade, fabricante, valor, funcao, aplicacao);
                        Cosmetico cosmetico = cosmeticoOptional.get();
                        cosmeticoService.deleteById(cosmetico.getId());
                    }
                    // Remova a linha da tabela
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um produto para editar.");
                }
            }
        });

        // Ação do botão de Remover
        Remover.addActionListener(new ActionListener() {
            /**
             * Método executado quando o botão de remover é clicado.
             * Remove o produto selecionado da tabela.
             */
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tabela.getSelectedRow();

                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                    String nomeProduto = (String) model.getValueAt(selectedRow, 0);

                    MedicamentoService medicamentoService = new MedicamentoService();
                    CosmeticoService cosmeticoService = new CosmeticoService();

                    Optional<Medicamento> medicamentoOptional = Optional.empty();
                    Optional<Cosmetico> cosmeticoOptional = Optional.empty();

                    List<Medicamento> medicamentos = medicamentoService.searchByname(nomeProduto);
                    if (!medicamentos.isEmpty()) {
                        medicamentoOptional = Optional.of(medicamentos.get(0));
                    } else {
                        List<Cosmetico> cosmeticos = cosmeticoService.searchByname(nomeProduto);
                        if (!cosmeticos.isEmpty()) {
                            cosmeticoOptional = Optional.of(cosmeticos.get(0));
                        }
                    }

                    if (medicamentoOptional.isPresent()) {
                        Medicamento medicamento = medicamentoOptional.get();
                        medicamentoService.deleteById(medicamento.getId());
                    } else if (cosmeticoOptional.isPresent()) {
                        Cosmetico cosmetico = cosmeticoOptional.get();
                        cosmeticoService.deleteById(cosmetico.getId());
                    }
                    // Remova a linha da tabela
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um produto para remover.");
                }
            }
        });
    }

    /**
     * Carrega os medicamentos e cosméticos na tabela.
     */
    public void carregarProdutos() {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0); // Limpar dados existentes na tabela

        MedicamentoService medicamentoService = new MedicamentoService();
        List<Medicamento> medicamentos = medicamentoService.all();

        CosmeticoService cosmeticoService = new CosmeticoService();
        List<Cosmetico> cosmeticos = cosmeticoService.all();

        List<Produto> produtos = new ArrayList<>();
        produtos.addAll(medicamentos);
        produtos.addAll(cosmeticos);

        for (Produto produto : produtos) {
            Object[] row = {
                    produto.getNomeProduto(),
                    produto.getDataValidade(),
                    produto.getFabricante(),
                    produto.getValor(),
                    // Preencher as colunas apropriadas com base no tipo de produto
                    (produto instanceof Medicamento) ? ((Medicamento) produto).getIndicacaoTerapeutica() : "",
                    (produto instanceof Medicamento) ? ((Medicamento) produto).getDosagem() : "",
                    (produto instanceof Medicamento) ? ((Medicamento) produto).getViaAdmissao() : "",
                    (produto instanceof Cosmetico) ? ((Cosmetico) produto).getFuncao() : "",
                    (produto instanceof Cosmetico) ? ((Cosmetico) produto).getAplicacao() : ""
            };
            model.addRow(row);
        }
    }

    /**
     * Método principal que cria uma instância da classe TelaCadastraProduto.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        TelaCadastraProduto tabela = new TelaCadastraProduto();
    }

}
