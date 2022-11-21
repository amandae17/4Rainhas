/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rainhas;

/**
 *
 * @author Icaro
 */
public class Teste2 {

    public static void main(String[] args) {
        boolean[][] tabuleiro = new boolean[4][4];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = false;
            }
        }
        
        tabuleiro[1][0] = true;
        tabuleiro[3][1] = true;
        tabuleiro[2][3] = true;
        tabuleiro[0][2] = true;   
        
        boolean isRainhaEmCheque = false;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j]){
                    
                    //Verificar Colunas                    
                    int posx = i+1;                    
                    while(posx< tabuleiro.length ){
                      if(tabuleiro[posx][j]){
                        isRainhaEmCheque = true; 
                        break;
                      }
                      posx++;                                                
                    }                    
                    //Verificar linhas
                    int posy = j+1;
                    while(posy< tabuleiro.length ){
                      if(tabuleiro[i][posy]){
                        isRainhaEmCheque = true; 
                        break;
                      }
                      posy++;                                                
                    }                     
                    //Diagonal direita-baixo
                    posx = i+1;
                    posy= j+1;
                    while(posx<tabuleiro.length && posy<tabuleiro.length){
                       if(tabuleiro[posx][posy]){
                         isRainhaEmCheque = true;
                         break;
                       }
                       posx++;
                       posy++;
                }
                    
                    //Diagonal esquerda-baixo
                    posx = i+1;
                    posy = j-1;
                    while(posx<tabuleiro.length && posy>0){
                       if(tabuleiro[posx][posy]){
                         isRainhaEmCheque = true; 
                         break;
                       }
                       posx++;
                       posy--;
                }
                    
                }
            }
        }
        
        if(isRainhaEmCheque){
            System.out.println("Uma rainha esta em cheque");
        } else{
            System.out.println("Nenhuma rainha esta em cheque");
        }
        
    }

}


