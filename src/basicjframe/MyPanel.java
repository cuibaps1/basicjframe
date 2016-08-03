/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjframe;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author pgngo
 */
class MyPanel extends JPanel {
    
    private BufferedImage pic = null;
 
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
 
    public Dimension getPreferredSize() {
        return new Dimension(600,400);
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         // Draw Image
        try{
            pic = ImageIO.read(new File("src\\basicjframe\\JohnCena.jpg"));
        } catch(IOException e){}
        g.drawImage(pic, 0, 0, 300, 400, this);
         }
         
    }  
