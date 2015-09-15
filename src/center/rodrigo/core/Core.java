package center.rodrigo.core;

import java.awt.Component;
import java.awt.Graphics;

import center.rodrigo.model.Particula;

public class Core extends Component {

    private int qtdPartculas = 300;
    private Particula[] particulas = new Particula[0];

    public synchronized void paint(Graphics g) {

        for (Particula p : particulas) {
            p.update();
            p.render(g);
        }
        repaint();
    }

    public void criarParticulas(int x, int y) {

        particulas = new Particula[qtdPartculas];

        for (int i = 0; i < qtdPartculas; i++) {
            particulas[i] = new Particula(x, y);
        }
    }

}
