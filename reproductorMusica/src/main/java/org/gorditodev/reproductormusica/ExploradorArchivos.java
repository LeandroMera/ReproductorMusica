package org.gorditodev.reproductormusica;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ExploradorArchivos {

    private static Stage escenario;
    private static FileChooser explorador;

    static{
        escenario = new Stage();
        explorador = new FileChooser();
        explorador.setTitle("Selecciona la cancion, mijin");
        FileChooser.ExtensionFilter filtro = new FileChooser.ExtensionFilter("Audio (mp3, wav, aac)", "*.mp3", "*.wav", "*.aac");
        explorador.getExtensionFilters().add(filtro);
    }

    public static void seleccionarArchivo(){
        try{
            File archivo = explorador.showOpenDialog(escenario);
            Media archivoSonido = new Media(archivo.toURI().toString());
            new Cancion(archivoSonido);
            //MediaPlayer reproductor = new MediaPlayer(archivoSonido);
            //reproductor.play();
        } catch(NullPointerException e){
            System.out.println("No se puede seleccionar el archivo");
        }

    }


}
