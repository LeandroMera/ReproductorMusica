package org.gorditodev.reproductormusica;

import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Cancion {
    private static Media archivo;
    private static MediaPlayer reproductor;
    private String titulo, album, artista;

    public Cancion(Media archivo) {
        this.archivo = archivo;
        reproductor = new MediaPlayer(archivo);
        BarraTiempo.setCancion(reproductor);
        reproductor.setOnReady(() ->{
            titulo = (String) archivo.getMetadata().get("title");
            album = (String) archivo.getMetadata().get("album");
            artista = (String) archivo.getMetadata().get("artist");
            Image caratula = (Image) archivo.getMetadata().get("image");
            InfoCancion.actualizarInformacion(titulo, album, artista, caratula);
        });
        reproductor.setOnEndOfMedia(() -> reproductor.stop());
    }

    public static void play(){
        if (archivo != null) {
            reproductor.play();
        }
    }

    public static void pause(){
        if (archivo != null && reproductor.getStatus() == MediaPlayer.Status.PLAYING) {
            reproductor.seek(reproductor.getCurrentTime()); //sirve para desa parecer el retraso en la pasua, guarda el tiempo exactode la cancion
            reproductor.pause();
        }
    }

    public static void stop(){
        if (archivo != null && (reproductor.getStatus() == MediaPlayer.Status.PLAYING
                            || reproductor.getStatus() == MediaPlayer.Status.PAUSED)) {
            reproductor.stop();
        }
    }

    public static void setVolumen(double volumen){
        reproductor.setVolume(volumen);
    }
}
