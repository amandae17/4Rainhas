/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rainhas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.lang.Math;

public class Rainhas {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        
        VetorD lista = new VetorD();
        
        
        JFrame frame = new JFrame("4 Rainhas");
        JPanel panel = new JPanel();
        
        //JLabel lbl = new JLabel(); //Colocar no if do Vetor
        //lbl.setBounds(150, 400, 80, 20);
        
        frame.getContentPane();
        
        
        URL url1 = new URL("https://png.pngtree.com/png-vector/20220623/ourmid/pngtree-chees-queen-figure-game-strategy-png-image_5292330.png");
        URL url2 = new URL("https://i.imgur.com/3yUvhTD.jpeg");
        final Image img1 = ImageIO.read(url1);
        final Image img2 = ImageIO.read(url2);
        
        JButton b1 = new JButton(new ImageIcon(img1));
        b1.setContentAreaFilled(false);
        Dimension size = b1.getPreferredSize();
        b1.setBounds(20, 20, 80, 80); //Muda posição, Muda tamanho
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b1 = new JButton(new ImageIcon(img2));
                //lista.adiciona(button);
                b1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton b1 = new JButton(new ImageIcon(img1));
                        //lista.remove(button);
                    }
                });
            }
        });
      
        JButton b2 = new JButton();
        b2.setBounds(100, 20, 80, 80); //Muda posição
     
        JButton b3 = new JButton();
        b3.setBounds(180, 20, 80, 80); //Muda posição
      
        JButton b4 = new JButton();
        b4.setBounds(260, 20, 80, 80); //Muda posição
      
        JButton b5 = new JButton();
        b5.setBounds(20, 100, 80, 80); //Muda posição
     
        JButton b6 = new JButton();
        b6.setBounds(100, 100, 80, 80); //Muda posição
     
        JButton b7 = new JButton();
        b7.setBounds(180, 100, 80, 80); //Muda posição
      
        JButton b8 = new JButton();
        b8.setBounds(260, 100, 80, 80); //Muda posição
    
        JButton b9 = new JButton();
        b9.setBounds(20, 180, 80, 80); //Muda posição
    
        JButton b10 = new JButton();
        b10.setBounds(100, 180, 80, 80); //Muda posição
     
        JButton b11 = new JButton();
        b11.setBounds(180, 180, 80, 80); //Muda posição
      
        JButton b12 = new JButton();
        b12.setBounds(260, 180, 80, 80); //Muda posição
      
        JButton b13 = new JButton();
        b13.setBounds(20, 260, 80, 80); //Muda posição
     
        JButton b14 = new JButton();
        b14.setBounds(100, 260, 80, 80); //Muda posição
     
        JButton b15 = new JButton();
        b15.setBounds(180, 260, 80, 80); //Muda posição
        //b15.setBackground(Color.green); //Muda a cor do botão
      
        JButton b16 = new JButton();
        b16.setBounds(260, 260, 80, 80); //Muda posição
      
        panel.setLayout(null);
        panel.add(b1);
        //panel.add(lbl);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 500);
        frame.setVisible(true);
        
        lista.adiciona("1");
        lista.adiciona("1");
        lista.adiciona("1");
        lista.adiciona("2");
        lista.adiciona("3");
        lista.adiciona("1");
        lista.adiciona("2");
        lista.adiciona("3");

        
        System.out.println(lista);
        
 /*       while(lista.tamanho()==4){
            for (int i = 0; i<4; i++){
                int n = lista.pega(max());
                for (int j=0; j<16; j++){
                   if(lista.pega(i)+1 == lista.pega(i+1)){
                       System.out.println("Cheque! Tente Novamente!");
                   }
                   else if(lista.pega(i+4) == lista.pega(i+1)){
                       System.out.println("Cheque! Tente Novamente!");
                   }
                }
                
            }
        }
    
*/  for (int i=2; i<8 ;i=+1){
        for (int p = 0; p<4; p=p+2){
            if (lista.pega(0) == p ){ //compara com a linha 1-4 
                if (lista.pega(i) == "1"){ //verifica se está na mesma linha 1 
                    JLabel lbl = new JLabel("Cheque! Tente Novamente!"); 
                    lbl.setBounds(100, 400, 200, 20); 
                    panel.add(lbl);
                }
                if (lista.pega(i) == "3"){
                    JLabel lbl = new JLabel("Cheque! Tente Novamente!"); //Colocar no if do Vetor
                    lbl.setBounds(100, 400, 200, 80); 
                    panel.add(lbl);
                }
                if (lista.pega(i) == "4"){
                    JLabel lbl = new JLabel("Cheque! Tente Novamente!"); //Colocar no if do Vetor
                    lbl.setBounds(100, 400, 200, 80); 
                    panel.add(lbl);
                }
            }
    }
                for (int a = 1; a<8; a = a+2){
                for (int j = 3; j<8; j = j+2){
                    for(int imp = 1; imp<8; imp = imp imp+2){
                    if (lista.pega(a)== imp){ //compara com a coluna 11
                        if (lista.pega(i) == "1"){
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80); 
                            panel.add(lbl);
                        }
                    if (lista.pega(a)== "2"){ //compara com a coluna 12
                        if (lista.pega(i) == "1"){
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!"); //Colocar no if do Vetor
                            lbl.setBounds(100, 400, 200, 80); 
                            panel.add(lbl);
                        }
                        if (lista.pega(a)== "3"){ //compara com a coluna 13
                            if (lista.pega(i) == "1"){
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!"); //Colocar no if do Vetor
                            lbl.setBounds(100, 400, 200, 80); 
                            panel.add(lbl);
                        }
                        if (lista.pega(a)== "4"){ //compara com a coluna 14
                            if (lista.pega(i) == "4"){
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!"); //Colocar no if do Vetor
                            lbl.setBounds(100, 400, 200, 80); 
                            panel.add(lbl);
                        }
                    }
                }
                }         
                }                
                }
                }
            }
    }
        
        System.out.println(lista);
    }
}

/* 
    Tabuleiro vai de JP1---JP2, embaixo JP3---JP4
     JLabel Q1, Q2, Q3, Q4 tem que ficar dentro das dimensões de JL1, JL2, JL3 e JL4
*/