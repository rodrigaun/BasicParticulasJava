package center.rodrigo.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Particula {

    private int x;
    private int y;
    private int vida;
    private int tamanho;
    private int velocidadeX;
    private int velocidadeY;

    public Particula(int x, int y) {
        this.x = x;
        this.y = y;
        this.vida = (int) (Math.random() * 400);
        this.tamanho = (int) (Math.random() * 10 + 1);
        this.velocidadeX = (int) ((Math.random() * 20) - 10);
        this.velocidadeY = (int) ((Math.random() * 20) - 10);
    }

    public void update() {

        if (vida >= 0) {
            x += velocidadeX;
            y += velocidadeY;
            vida--;
        }
    }

    public void render(Graphics g) {

        if (vida >= 0) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(Color.RED);
            g2d.fillRect(x - (tamanho / 2), y - (tamanho / 2), tamanho, tamanho);
            g2d.dispose();
        }
    }
}
