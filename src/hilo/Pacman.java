/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Jesus
 */
public class Pacman extends JFrame implements KeyListener {

    int sentido;
    int x = 100, y = 100;
    int marcador;
    int pelotaX,pelotaY;

    public Pacman() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(this);
        Graphics g = this.getGraphics();
        int contador = 0;
        pelotaX =(int) Math.round(Math.random()*400);
        pelotaY =(int) Math.round(Math.random()*400);
        while (true) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 400, 400);
            g.setColor(Color.WHITE);
            g.drawString("Contador : " + marcador, 10, 50);
            g.setColor(Color.YELLOW);
            g.fillOval(x, y, 30, 30);
            g.fillOval(pelotaX, pelotaY, 10,10);
            contador++;
            int aX[] = {x + 15, x + 30, x + 30};
            int aY[] = {y + 15, y, y + 30};
            if (sentido == 0) {
                x+=6;
            }else{
                if(sentido == 2){
                    aX[0] = x+15;
                    aX[1] = x;
                    aX[2] = x;
                    aY[0] = y+15;
                    aY[1] = y+30;
                    aY[2] = y;
                    x-=6;
                }else{
                    if(sentido == 1){
                        aX[0] = x+15;
                        aX[1] = x+30;
                        aX[2] = x;
                        aY[0] = y+15;
                        aY[1] = y+30;
                        aY[2] = y+30;
                        y+=6;
                    }else{
                        aX[0] = x+15;
                        aX[1] = x+30;
                        aX[2] = x;
                        aY[0] = y+15;
                        aY[1] = y;
                        aY[2] = y;
                        y-=6;
                    }
                }
            }
            if(x>=400){
                x=0;
            }
            if(x<0){
                x=400;
            }
            if(y>=400){
                y=0;
            }
            if(y<0){
                y=400;
            }
            if (contador % 3 == 0) {
                g.setColor(Color.BLACK);
                
                g.fillPolygon(aX, aY, 3);
            }
            if((pelotaX>=x && pelotaX+10<=x+30) && (pelotaY>=y && pelotaY+10<=y+30)){
                pelotaX =(int) Math.round(Math.random()*400);
                pelotaY =(int) Math.round(Math.random()*400);
                marcador++;
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new Pacman();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 39) {
            sentido = 0;
        }
        if (e.getKeyCode() == 40) {
            sentido = 1;
        }
        if (e.getKeyCode() == 37) {
            sentido = 2;
        }
        if (e.getKeyCode() == 38) {
            sentido = 3;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
