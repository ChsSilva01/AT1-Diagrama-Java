/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author carlos
 */
public class livro {
    private String titulo;
    private int isbn;
    
    public void cadastrarLivro(String titulo, int isbn){
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    public String getTitulo(){
        return titulo;
    }
}
