/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama.de.classe.playlist;

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
    
    public void MostrarPlaylist(){
        System.out.println(
                "Criador: "+nomedocriador+" \n"
                +"Titulo: "+titulo+ " \n"
                +"Data de Criacao: "+datadecriacao+ " \n");
        
        Musica mus = new Musica();
        String[] musica = mus.getNome();
        
        
        System.out.println("Músicas: ");
        for(int i = 0; i < 2; i++){
            if(musicadaplaylist[i] == musica[i]){
                System.out.println(musica[i]);
            }
        }
    }
    
    
}
