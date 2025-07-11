/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics2dexamen;

/**
 *
 * @author Axel Rosales
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDibujo extends JPanel implements KeyListener{
    
    private int x = 0, y = 0;
    private int diametro = 30;
    private double angulo = 0;
    
    public PanelDibujo()
    {
        setFocusable(true);
        addKeyListener(this);
    }
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;       

        g2d.translate(x + diametro / 2, y + diametro / 2);
        g2d.rotate(angulo);
        g2d.translate(-diametro / 2, -diametro / 2);

        g2d.setColor(Color.BLUE);
        g2d.fillOval(x, y, diametro * 2, diametro * 2);
    }
    
    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
        repaint();
    }
    
    public void escalar(double factor) {
        diametro = Math.max(10, (int) (diametro * factor));
        repaint();
    }    
    
    
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> mover(0, -10);
            case KeyEvent.VK_DOWN -> mover(0, 10);
            case KeyEvent.VK_LEFT -> mover(-10, 0);
            case KeyEvent.VK_RIGHT -> mover(10, 0);
        }
    }
    
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
    
}
