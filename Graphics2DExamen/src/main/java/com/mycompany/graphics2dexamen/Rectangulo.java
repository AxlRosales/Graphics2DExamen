/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics2dexamen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/**
 *
 * @author Axel Rosales
 */
public class Rectangulo extends JPanel {
    
    private double angulo = 0;
    private int x = 50, y = 50;
    
    public Rectangulo()
    {
        setFocusable(true);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;      
        
        g2d.setColor(Color.red);
        g2d.rotate(angulo);
        
        g2d.drawRect(x, y, 50, 50);
        

    }
    
    public void rotar(double grados) {
        angulo += Math.toRadians(grados);
        repaint();
    }
    
}
