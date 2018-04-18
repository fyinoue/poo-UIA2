/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author 1714290026
 */
public class OuvinteMouse implements MouseListener {
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicando com o botão " + e.getButton());
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressionando o botão " + e.getButton());
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberando o botão " + e.getButton());
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entrando...");
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Saindo...");
    }
}
