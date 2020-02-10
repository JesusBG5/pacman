/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import javax.swing.JLabel;

/**
 *
 * @author Jesus
 */
public class Cronometro2  extends Thread{
    
     int segundos, minutos;
    String tiempo;
    JLabel etiqueta;

    public Cronometro2(JLabel e) {
        segundos = 0;
        minutos = 0;
        etiqueta = e;
    }

    @Override
    public void run() {
        while (true) {
            String s = "", m = "";
            if (segundos < 10) {
                s = "0";
            }
            if (minutos < 10) {
                m = "0";
            }
            tiempo = m + minutos + ":" + s + segundos;
            try {
                Thread.sleep(1000);
                segundos++;
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }
                etiqueta.setText("Tiempo: " + tiempo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
}
