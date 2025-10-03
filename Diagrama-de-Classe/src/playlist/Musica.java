/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author carlos
 */
public class Musica {
    private String[] nomemusica = new String[4];
    private int[] duracao = new int[4];
    
    public void CadasrarMusica(String[] musica, int[] duracao){
        this.nomemusica = musica;
        this.duracao = duracao;
    }
    
    public String[] getNome(){
        return nomemusica;
    }
    public int[] getDuracao(){
        return duracao;
    }
}
