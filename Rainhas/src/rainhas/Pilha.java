/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rainhas;

/**
 *
 * @author Icaro
 */
public class Pilha {
    private VetorD lista = new VetorD();
    
    public void push(Object objeto){
        this.lista.adiciona(objeto);
    }
    
    public boolean pEmpty(){
        return this.lista.vazia();
    }
    
    public Object pop(){
        if(!pEmpty()){
            Object objeto = this.lista.pega(lista.tamanho()-1);
            this.lista.remove(lista.tamanho()-1);
            return objeto;
        } else {
            return null;
        }        
    } 
    
}
