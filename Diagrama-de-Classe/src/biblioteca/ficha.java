/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author carlos
 */
public class ficha {
    private String cota;
    private String titulo;
    
    public void cadastrarFicha(String cota, String titulo){
        this.cota = cota;
        this.titulo = titulo;
    }
    
    public void exibirFicha(String nome){
        System.out.println(
                "Livro: "+ titulo + " \n"
                +"Aluno: "+ nome + " \n");
    }
}
