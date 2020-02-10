/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Jesus
 */
public class Hilo extends JFrame {

    public int x = 100, y = 100;
    public Hilo() {
        this.setSize(300, 300);//Tamaño
        this.setLocationRelativeTo(null);//Centrar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(new Teclado(this));
        //Que funcione el botón de cerrar
        this.setVisible(true);//Mostrar la ventana
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 300, 300);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public static void main(String[] args) {
        new Hilo();
    }

}
