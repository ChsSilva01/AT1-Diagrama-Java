/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author carlos
 */
public class Playlist {
    private String nomedocriador;
    private String titulo;
    private String datadecriacao;
    private String[] artistadaplaylist = new String[4];
    private String[] musicadaplaylist = new String[4];
    
    public void CriarPlaylist(String nomedocriador, String titulo, String datadecriacao, String[] artistadaplaylist, String[] musicadaplaylist){
        this.nomedocriador = nomedocriador;
        this.titulo = titulo;
        this.datadecriacao = datadecriacao;
        this.artistadaplaylist = artistadaplaylist;
        this.musicadaplaylist = musicadaplaylist;
    }
    
    public void MostrarPlaylist(String[] musica, int[] tempo){
        System.out.println(
                "Criador: "+nomedocriador+" \n"
                +"Titulo: "+titulo+ " \n"
                +"Data de Criacao: "+datadecriacao+ " \n");
          
        System.out.println("Músicas: ");
        for(int i = 0; i < musica.length; i++){
            for(int j = 0; j < this.musicadaplaylist.length; j++){
                if(musicadaplaylist[j] == musica[i]){
                    System.out.println(musicadaplaylist[j]);
                }
            }
        }
        System.out.println();
        int duracaoplaylist = 0;
        System.out.println("Duração: ");
        for(int k = 0; k < tempo.length; k++){
            duracaoplaylist += tempo[k];   
        }
        System.out.println(duracaoplaylist + " minutos");
    }
    
    
}
