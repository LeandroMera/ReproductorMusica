package org.gorditodev.reproductormusica;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;

public class Botones extends HBox {

    private Button play, pause, stop;
    private Slider controladorVolumen;
    private Label etVolumen;

    public Botones(){
        this.setAlignment(Pos.CENTER);
        play = new Button();
        pause = new Button();
        stop = new Button();
        estiloBoton(play, "play");
        estiloBoton(pause, "pause");
        estiloBoton(stop, "stop");

        controladorVolumen = new Slider(0,100,50);
        controladorVolumen.setPrefWidth(120);
        controladorVolumen.setPadding(new Insets(0,10,0,10));

        etVolumen = new Label("Vol : 50%");

        ponerEnAccion();

        montarBotones();
    }

    private void ponerEnAccion() {
        play.setOnAction(e->Cancion.play());
        pause.setOnAction(e->Cancion.pause());
        stop.setOnAction(e->Cancion.stop());

        controladorVolumen.valueProperty().addListener((observable, oldValue, newValue) -> {
            double volumen = newValue.doubleValue() / 100;
            Cancion.setVolumen(volumen);
            etVolumen.setText("Vol: " + newValue.intValue() + "%");
        });
    }

    private void montarBotones() {
        getChildren().addAll(stop, play, pause, etVolumen, controladorVolumen);
    }

    private void estiloBoton(Button boton, String nombre){
        setMargin(boton, new Insets(20));
        boton.setMinHeight(80);
        boton.setMinWidth(80);
        boton.setStyle("-fx-background-color: transparent;" +
                       "-fx-background-image: url('file:src/main/java/org/img/" + nombre + ".png');" +
                       "-fx-background-size: cover; "
        );

        boton.setOnMousePressed(e -> boton.setOpacity(0.4));
        boton.setOnMouseReleased(e -> boton.setOpacity(1.0));
    }
}
