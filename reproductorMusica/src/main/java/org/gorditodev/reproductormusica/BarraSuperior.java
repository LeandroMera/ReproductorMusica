package org.gorditodev.reproductormusica;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class BarraSuperior extends MenuBar {

    private Menu menuArchivo;
    private MenuItem iAbrir, iSalir;

    public BarraSuperior() {
        menuArchivo = new Menu("Archivo");
        iAbrir = new MenuItem("Abrir");
        iSalir = new MenuItem("Salir");
        prepararListener();
        prepararMenus();

    }

    private void prepararListener() {
        iAbrir.setOnAction(e -> ExploradorArchivos.seleccionarArchivo());
        iSalir.setOnAction(e -> Main.getStage().close());

    }

    private void prepararMenus() {
       // menuArchivo.setDisable(true);
        menuArchivo.getItems().addAll(iAbrir, iSalir);
        getMenus().add(menuArchivo);
    }
}
