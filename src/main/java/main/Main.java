package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720); // Definindo tamanho fixo

        // Adiciona os estilos BootstrapFX
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        // Configurar tamanho fixo
        stage.setResizable(false);  // Impede o usuário de redimensionar
        stage.setTitle("CMS - Cinema Management System");

        // Centralizar a janela na tela
        stage.centerOnScreen();

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
