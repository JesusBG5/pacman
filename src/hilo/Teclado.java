/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Jesus
 */
public class Teclado implements KeyListener{
    Hilo ventana;
    public Teclado(Hilo v){
        ventana = v;
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==37){ //Izquierda
            ventana.x = ventana.x - 5;
        }
        if(e.getKeyCode()==39){ //Derecha
            ventana.x = ventana.x + 5;
        }
        if(e.getKeyCode()==38){ //Arriba
            ventana.y = ventana.y - 5;
        }
        if(e.getKeyCode()==40){ //Abajo
            ventana.y = ventana.y + 5;
        }
        ventana.paint(ventana.getGraphics());
    }
    
}