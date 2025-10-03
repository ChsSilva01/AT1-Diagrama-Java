/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @author carlos
 */
public class main {
    public static void main(String[] args){
       filme fil = new filme();
       fil.cadastrarFilme("Matilda", "1:30");
       
       sala sa = new sala();
       sa.cadastrarSala(50, 1);
       
       String salvatitulo = fil.getTitulo();
       int salvanumero = sa.getNumero();
       String salvaduracao = fil.getDuracao();
       
       sessao ses = new sessao();
       ses.cadastrarFilme("10:30", salvatitulo);
       ses.exibirFilme(salvaduracao, salvanumero);
       
       
    }
}
