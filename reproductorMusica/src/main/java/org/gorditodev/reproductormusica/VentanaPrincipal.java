package org.gorditodev.reproductormusica;

import javafx.scene.layout.BorderPane;

public class VentanaPrincipal extends BorderPane {
    public VentanaPrincipal() {
        setTop(new BarraSuperior());
        setCenter(new InfoCancion());
        setBottom(new BarraInferior());
    }
}
