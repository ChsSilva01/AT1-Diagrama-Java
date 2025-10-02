/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama.de.classe.playlist;

/**
 *
 * @author carlos
 */
public class main {
    public static void main(String[] args){
        
        String[] artistasteste = {"Bayonce","Gustavo Lindo","Luan Pilantra","Tiririca"};
        String[] musicateste = {"Fire","Tchecerete","Eu você o mar e ela","La Bamba"};
        int[] duracaoteste = {1,2,5,100};
        Artista art = new Artista(artistasteste);
        Musica mus = new Musica();
        mus.CadasrarMusica(musicateste,duracaoteste);
        
        Playlist play = new Playlist();
        String[] artistastesteplay = {"Bayonce","Gustavo Lindo","Luan Pilantra","Tiririca"};
        String[] musicatesteplay = {"Fire","Tchecerete"};
        play.CriarPlaylist("Carlos", "Minhas Musicas", "2025-10-02" , artistastesteplay, musicatesteplay);
        play.MostrarPlaylist();
    }
}
