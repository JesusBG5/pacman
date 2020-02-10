/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jesus
 */
public class Buscaminas extends JFrame {
    public Buscaminas(){
        JButton tablero[][]=new JButton[10][10];
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null); //Acomodamiento
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]= new JButton();
                tablero[i][j].setBounds(i*50,j*50,50,50);
                this.add(tablero[i][j]);
                tablero[i][j].addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton boton = (JButton) e.getSource();
                        boton.setText("1");
                    }                    
                });
            }
        }
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Buscaminas();
    }

}
