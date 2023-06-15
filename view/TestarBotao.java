package view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.Border;

public class TestarBotao {
    private JFrame janela;

    public TestarBotao() {
        this.iniciaComponentes();
    }

    public void iniciaComponentes() {
        janela = new JFrame("Farmácia da Márcia");
;

        JButton botaoInvisivel = new JButton("botao");
        botaoInvisivel.setBounds(100, 100, 50, 50);
        botaoInvisivel.setFocusable(false);
        botaoInvisivel.setBorder(new RoundBorder(10)); // Definindo uma borda arredondada com raio de 10 pixels

        janela.setLayout(null);
        janela.add(botaoInvisivel);

        janela.setSize(450, 650);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new TestarBotao();
    }
}

class RoundBorder extends RoundRectangle2D.Float implements Border {
    private int radius;

    public RoundBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(c.getForeground());
        g2d.draw(this);
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int value = radius / 2;
        return new Insets(value, value, value, value);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}

