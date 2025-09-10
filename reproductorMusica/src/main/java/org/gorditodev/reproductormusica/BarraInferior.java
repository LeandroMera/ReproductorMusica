package org.gorditodev.reproductormusica;

import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.VBox;

public class BarraInferior extends VBox {
        public BarraInferior(){

            getChildren().addAll(BarraTiempo.getBarra(), new Botones());
        }


}
