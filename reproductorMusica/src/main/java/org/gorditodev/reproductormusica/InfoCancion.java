package org.gorditodev.reproductormusica;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class InfoCancion extends VBox {
    private static Label etTitulo, etArtista, etAlbum;
    private static ImageView imagenCaratula;

    public InfoCancion() {
        etTitulo = new  Label("No disponible");
        etArtista = new  Label("No disponible");
        etAlbum = new  Label("No disponible");

        etTitulo.setFont(new Font("Arial", 18));
        etArtista.setFont(new Font("Arial", 18));
        etAlbum.setFont(new Font("Arial", 18));

        imagenCaratula = new  ImageView();

        imagenCaratula.setFitWidth(150);
        imagenCaratula.setFitHeight(150);
        imagenCaratula.setPreserveRatio(true);

        setAlignment(Pos.CENTER);
        setPadding(new Insets(20));
        this.setSpacing(10);

        getChildren().addAll(etTitulo,etArtista,etAlbum,imagenCaratula);


    }

    public static void actualizarInformacion( String titulo, String artista, String album, Image caratula){
        etTitulo.setText("" +(titulo != null ? titulo :"No disponible"));
        etArtista.setText("" +(artista != null ? artista :"No disponible"));
        etAlbum.setText("" +(album != null ? album : "No disponible"));
        imagenCaratula.setImage(caratula != null ? caratula : new Image("file:src/main/java/org/img/defecto.png"));
    }
}
