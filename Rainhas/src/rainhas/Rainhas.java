/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rainhas;



public class Rainhas {
    
    public static void main(String[] args) {
        VetorD lista = new VetorD();
        tabuleiro board = new tabuleiro();
        
        //System.out.println(board.getValueof(Q1Position));
        
        board.setVisible(true);
    }
}

/* 
    Tabuleiro vai de JL1---JL2, embaixo JL3---JL4
     JLabel Q1, Q2, Q3, Q4 tem que ficar dentro das dimensões de JL1, JL2, JL3 e JL4
*/