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
import javax.swing.JOptionPane;

public class Rainhas {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        
        VetorD lista = new VetorD();
        Fila f = new Fila();
        
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
                lista.adiciona("1");
                lista.adiciona("1");
                System.out.println(lista);
            }
        });
      
        JButton b2 = new JButton();
        b2.setBounds(100, 20, 80, 80); //Muda posição
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b2 = new JButton(new ImageIcon(img2));
                lista.adiciona("1");
                lista.adiciona("2");
                System.out.println(lista);
            }
        });
     
        JButton b3 = new JButton();
        b3.setBounds(180, 20, 80, 80); //Muda posição
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b3 = new JButton(new ImageIcon(img2));
                lista.adiciona("1");
                lista.adiciona("3");
                System.out.println(lista);
            }
        });
      
        JButton b4 = new JButton();
        b4.setBounds(260, 20, 80, 80); //Muda posição
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b4 = new JButton(new ImageIcon(img2));
                lista.adiciona("1");
                lista.adiciona("4");
                System.out.println(lista);
            }
        });
      
        JButton b5 = new JButton();
        b5.setBounds(20, 100, 80, 80); //Muda posição
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b5 = new JButton(new ImageIcon(img2));
                lista.adiciona("2");
                lista.adiciona("1");
                System.out.println(lista);
            }
        });
     
        JButton b6 = new JButton();
        b6.setBounds(100, 100, 80, 80); //Muda posição
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b6 = new JButton(new ImageIcon(img2));
                lista.adiciona("2");
                lista.adiciona("2");
                System.out.println(lista);
            }
        });
     
        JButton b7 = new JButton();
        b7.setBounds(180, 100, 80, 80); //Muda posição
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b7 = new JButton(new ImageIcon(img2));
                lista.adiciona("2");
                lista.adiciona("3");
                System.out.println(lista);
            }
        });
      
        JButton b8 = new JButton();
        b8.setBounds(260, 100, 80, 80); //Muda posição
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b8 = new JButton(new ImageIcon(img2));
                lista.adiciona("2");
                lista.adiciona("4");
                System.out.println(lista);
            }
        });
    
        JButton b9 = new JButton();
        b9.setBounds(20, 180, 80, 80); //Muda posição
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b9 = new JButton(new ImageIcon(img2));
                lista.adiciona("3");
                lista.adiciona("1");
                System.out.println(lista);
            }
        });
    
        JButton b10 = new JButton();
        b10.setBounds(100, 180, 80, 80); //Muda posição
        b10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b10 = new JButton(new ImageIcon(img2));
                lista.adiciona("3");
                lista.adiciona("2");
                System.out.println(lista);
            }
        });
     
        JButton b11 = new JButton();
        b11.setBounds(180, 180, 80, 80); //Muda posição
        b11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b11 = new JButton(new ImageIcon(img2));
                lista.adiciona("3");
                lista.adiciona("3");
                System.out.println(lista);
            }
        });
      
        JButton b12 = new JButton();
        b12.setBounds(260, 180, 80, 80); //Muda posição
        b12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b12 = new JButton(new ImageIcon(img2));
                lista.adiciona("3");
                lista.adiciona("4");
                System.out.println(lista);
            }
        });
      
        JButton b13 = new JButton();
        b13.setBounds(20, 260, 80, 80); //Muda posição
        b13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b13 = new JButton(new ImageIcon(img2));
                lista.adiciona("4");
                lista.adiciona("1");
                System.out.println(lista);
            }
        });
     
        JButton b14 = new JButton();
        b14.setBounds(100, 260, 80, 80); //Muda posição
        b14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b14 = new JButton(new ImageIcon(img2));
                lista.adiciona("4");
                lista.adiciona("2");
                System.out.println(lista);
            }
        });
     
        JButton b15 = new JButton();
        b15.setBounds(180, 260, 80, 80); //Muda posição
        b15.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b15 = new JButton(new ImageIcon(img2));
                lista.adiciona("4");
                lista.adiciona("3");
                System.out.println(lista);
            }
        });
      
        JButton b16 = new JButton();
        b16.setBounds(260, 260, 80, 80); //Muda posição
        b16.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b16 = new JButton(new ImageIcon(img2));
                lista.adiciona("4");
                lista.adiciona("4");
                System.out.println(lista);
            }
        });
        
        JButton bO = new JButton("Verificar");
        bO.setBounds(200, 420, 100, 20); //Muda posição
        bO.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Ok");
            }
        });
      
        panel.setLayout(null);
        panel.add(b1);
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
        panel.add(bO);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 500);
        frame.setVisible(true);
        
        
        System.out.println(lista);
        
        lista.adiciona("1");
        lista.adiciona("1");
        lista.adiciona("2");
        lista.adiciona("1");
        lista.adiciona("1");
        lista.adiciona("3");
        lista.adiciona("2");
        lista.adiciona("3");
        
        
        
        
        
        
        
        if (lista.tamanho() == 8) {

            for (int imp = 3; imp < 8; imp = imp + 2) {
                for (int p = 2; p < 8; p = p + 2) {
                    if (lista.pega(0) == "1") { //compara com a linha 1 
                        if (lista.pega(p) == "1") { //verifica se está na mesma linha 1 
                            JOptionPane.showMessageDialog(null, "Cheque! Tente Novamente!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        if (lista.pega(1) == "1") { //Diagonal 11
                            if (lista.pega(p) == "2") { //Verifica se possui algo em 22
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Diagonal Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;

                                }
                            }
                            if (lista.pega(p) == "3") { //Verifica se possui algo em 33
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") { //Verifica se possui algo em 44
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "2") { //Diagonal 12
                            if (lista.pega(p) == "2") { //Verifica se possui algo em 23
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "1") { // Verifica se há algo em 21
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") { //Verifica se possui algo em 34
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "3") { //Diagonal 13
                            if (lista.pega(p) == "2") { //Verifica se possui algo em 24
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "2") { // Verifica se há algo em 21
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") { //Verifica se possui algo em 31
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "4") { //Diagonal 14
                            if (lista.pega(p) == "2") { //Verifica se possui algo em 23
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") { //Verifica se possui algo em 32
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") { //Verifica se possui algo em 41
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }

                    }
                    if (lista.pega(0) == "2") { //compara com a linha 2
                        if (lista.pega(1) == "1") {//Verifica se possui algo em 21
                            if (lista.pega(p) == "3") {//Verifica se possui algo em 32
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") {//Verifica se possui algo em 43
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "1") {//Verifica se possui algo em 12
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }

                        }
                        if (lista.pega(1) == "2") {//Verifica se possui algo em 22
                            if (lista.pega(p) == "3") {//Verifica se possui algo em 33
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") {//Verifica se possui algo em 44
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "1") {//Verifica se possui algo em 11
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 20);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(p) == "2") {
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80);
                            panel.add(lbl);
                            break;
                        }
                        if (lista.pega(1) == "3") { //Diagonal 23
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") {
                                if (lista.pega(p + 1) == "41") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "4") { //Diagonal 24
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p) == "4") {
                                    if (lista.pega(p + 1) == "2") {
                                        JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                        lbl.setBounds(100, 400, 200, 80);
                                        panel.add(lbl);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (lista.pega(0) == "3") { //compara com a linha 3
                        if (lista.pega(p) == "3") {
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80);
                            panel.add(lbl);
                            break;
                        }
                        if (lista.pega(1) == "1") { //Diagonal 31
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "2") { //Diagonal 31
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") { //Diagonal 31
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "2") { //Diagonal 32
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "3") { //Diagonal 33
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "3") { //Diagonal 34
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "4") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                    }
                    if (lista.pega(0) == "4") { //compara com a linha 4
                        if (lista.pega(p) == "4") {
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80);
                            panel.add(lbl);
                            break;
                        }
                        if (lista.pega(1) == "1") { //Diagonal 41
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "2") { //Diagonal 42
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") {
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "3") { //Diagonal 43
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                                if (lista.pega(p + 1) == "4") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                        if (lista.pega(1) == "4") { //Diagonal 44
                            if (lista.pega(p) == "1") {
                                if (lista.pega(p + 1) == "1") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "2") {
                                if (lista.pega(p + 1) == "2") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                            if (lista.pega(p) == "3") {
                                if (lista.pega(p + 1) == "3") {
                                    JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                                    lbl.setBounds(100, 400, 200, 80);
                                    panel.add(lbl);
                                    break;
                                }
                            }
                        }
                    }
                    if (lista.pega(1) == "1") { //compara com a coluna 1 
                        if (lista.pega(imp) == "1") { //verifica se está na mesma coluna 1 
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 20);
                            panel.add(lbl);
                            break;
                        }
                    }
                    if (lista.pega(1) == "2") { //compara com a coluna 2
                        if (lista.pega(imp) == "2") {
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80);
                            panel.add(lbl);
                            break;
                        }
                    }
                    if (lista.pega(1) == "3") { //compara com a coluna 3
                        if (lista.pega(imp) == "3") {
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80);
                            panel.add(lbl);
                            break;
                        }
                    }
                    if (lista.pega(1) == "4") { //compara com a coluna 4
                        if (lista.pega(imp) == "4") {
                            JLabel lbl = new JLabel("Cheque! Tente Novamente!");
                            lbl.setBounds(100, 400, 200, 80);
                            panel.add(lbl);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(lista);

    }
}
