/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author carlos
 */
public class aluno {
    private String nome;
    
    public void cadastrarAluno(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
}
