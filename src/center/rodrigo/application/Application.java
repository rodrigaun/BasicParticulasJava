package center.rodrigo.application;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import center.rodrigo.core.Core;

public class Application implements MouseListener {

    private JFrame frame;
    private Core core = new Core();
    private int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();

    public Application() {
        frame = new JFrame("Basic Particulas");
        frame.add(core);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.addMouseListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /* Eventos Mouse */
    @Override
    public void mouseClicked(MouseEvent arg0) {
        core.criarParticulas(arg0.getXOnScreen(), arg0.getYOnScreen());
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
    }
    @Override
    public void mousePressed(MouseEvent arg0) {
    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
    }
}
