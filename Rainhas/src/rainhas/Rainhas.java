/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rainhas;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;

/**
 *
 * @author aevan
 */
public class Rainhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        JFrame tabuleiro = new JFrame();
        tabuleiro.setBounds(10, 10, 512, 512);
        //tabuleiro.setUndecorated(true); //Tira a borda da janela
        
        JPanel p = new JPanel(){
            public void paint(Graphics g){
                boolean white = true;
                for(int y = 0; y<4; y++){
                    for(int x = 0; x<4; x++){
                        if(white){
                            g.setColor(Color.white);
                        }else{
                            g.setColor(Color.black);
                        }
                        g.fillRect(x*128, y*128, 128, 128); // Altera tamanho tabuleiro
                        white=!white;
                    }
                    white=!white;
                }
                        
            }
        };
        tabuleiro.add(p);
        tabuleiro.setDefaultCloseOperation(3);
        tabuleiro.setVisible(true);
    }
    
}
