/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @author carlos
 */
public class sessao {
    private String horarios;
    private String filmes;
    
    public void cadastrarFilme(String horarios, String titulo){
        this.filmes = titulo;
        this.horarios = horarios;
    }
    public void exibirFilme(String duracao, int numero){
        System.out.println(
            "Filme: "+filmes+" \n"
            +"Horario: "+horarios+" \n"
            +"Duracao: "+duracao+" \n"
            +"Sala: "+numero);
    }
}
