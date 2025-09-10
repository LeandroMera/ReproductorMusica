package org.gorditodev.reproductormusica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        Scene scene = new Scene(new VentanaPrincipal(), 600, 450);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }
}
