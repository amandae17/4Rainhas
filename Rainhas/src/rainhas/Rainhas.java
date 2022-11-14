/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rainhas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Rainhas {
    
    public static void main(String[] args) throws IOException {
        LinkedList<Pecas> ps=new LinkedList<>();
        BufferedImage all=ImageIO.read(new File("D://chess.png"));
        Image imgs[]=new Image[12];
       int ind=0;
        for(int y=0;y<400;y+=200){
        for(int x=0;x<1200;x+=200){
            imgs[ind]=all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
       ind++;
        }    
        }
        Pecas brook=new Pecas(0, 0, false, "rook", ps);
        Pecas bkinght=new Pecas(1, 0, false, "knight", ps);
        
        Pecas wrook=new Pecas(0, 7, true, "rook", ps);
        Pecas wkinght=new Pecas(1, 7, true, "knight", ps);
        Pecas wbishop=new Pecas(2, 7, true, "bishop", ps);
        Pecas wqueen=new Pecas(3, 7, true, "queen", ps);
        
                
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);
        JPanel pn=new JPanel(){
            @Override
            public void paint(Graphics g) {
            boolean white=true;
                for(int y= 0;y<8;y++){
            for(int x= 0;x<8;x++){
                if(white){
                    g.setColor(new Color(235,235, 208));
                }else{
                    g.setColor(new Color(119, 148, 85));
                    
                }
                g.fillRect(x*64, y*64, 64, 64);
           white=!white;
            }
            white=!white;
            }
                for(Pecas p: ps){
                    int ind=0;
                    if(p.name.equalsIgnoreCase("king")){
                        ind=0;
                    }
                    if(p.name.equalsIgnoreCase("queen")){
                        ind=1;
                    }
                    if(p.name.equalsIgnoreCase("bishop")){
                        ind=2;
                    }
                    if(p.name.equalsIgnoreCase("knight")){
                        ind=3;
                    }
                    if(p.name.equalsIgnoreCase("rook")){
                        ind=4;
                    }
                    if(p.name.equalsIgnoreCase("pawn")){
                        ind=5;
                    }
                    if(!p.isWhite){
                        ind+=6;
                    }
                    g.drawImage(imgs[ind], p.xp*64, p.yp*64, this);
                }
            }
            
        };
        frame.add(pn);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}

