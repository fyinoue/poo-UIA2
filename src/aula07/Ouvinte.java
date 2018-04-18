package aula07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class Ouvinte implements KeyListener{
    public void keyTyped(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "Tratando o evento... ");
    }
    public void keyPressed(KeyEvent e) {
    }
    public void keyReleased(KeyEvent e) {
    }
}
