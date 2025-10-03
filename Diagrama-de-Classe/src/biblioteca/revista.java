/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author carlos
 */
public class revista {
    private String titulo;
    private String periodicidade;
    
    public void cadastrarRevista(String titulo, String periodicidade){
        this.titulo = titulo;
        this.periodicidade = periodicidade;
    }
    
    public String getTitulo(){
        return titulo;
    }
}
