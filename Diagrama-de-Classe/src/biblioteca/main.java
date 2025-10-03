/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author carlos
 */
public class main {
    public static void main(String[] args){
        livro li = new livro();
        li.cadastrarLivro("Diario de um Banana", 15);
        String titulo = li.getTitulo();
        
        revista rev = new revista();
        rev.cadastrarRevista("Veja", " ");
        
        aluno al = new aluno();
        al.cadastrarAluno("Carlos");
        String nome = al.getNome();
        
        ficha fic = new ficha();
        fic.cadastrarFicha(" ", titulo);
        fic.exibirFicha(nome);
    }
}
