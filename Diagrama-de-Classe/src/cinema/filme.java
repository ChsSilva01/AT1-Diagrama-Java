/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @author carlos
 */
public class filme {
    private String titulo;
    private String duracao;
    
    public void cadastrarFilme(String titulo, String duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getDuracao(){
        return duracao;
    }
}
