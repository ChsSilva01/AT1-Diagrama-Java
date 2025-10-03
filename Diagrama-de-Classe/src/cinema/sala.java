/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @author carlos
 */
public class sala {
    private int capacidade;
    private int numero;
    
    public void cadastrarSala(int capacidade, int numero){
        this.capacidade = capacidade;
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
}
