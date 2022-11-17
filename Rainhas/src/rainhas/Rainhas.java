/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rainhas;



public class Rainhas {
    
    public static void main(String[] args) {
        VetorD lista = new VetorD();
        tabuleiro board = new tabuleiro();
        
        System.out.println(board.getLocation());
        
        board.setVisible(true);
    }
}

/* 
    Tabuleiro vai de JP1---JP2, embaixo JP3---JP4
     JLabel Q1, Q2, Q3, Q4 tem que ficar dentro das dimensões de JL1, JL2, JL3 e JL4
*/