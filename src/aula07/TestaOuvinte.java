package aula07;

import javax.swing.JFrame;

public class TestaOuvinte {
    public static void main(String[] args) {
        Ouvinte ouvinte = new Ouvinte();
        JFrame janela = new JFrame();
        janela.addKeyListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
