/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author carlos
 */
public class Artista {
    private String[] nomeartista = new String[4];
    
    public Artista(String[] artista){
        this.nomeartista = artista;
    }
    
    public String[] getNome(){
        return nomeartista;
    }
}
