package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import models.Filme;
import utils.DataManager;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private FlowPane filmesPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarFilmes();
    }

    private void carregarFilmes() {
        List<Filme> filmes = DataManager.getFilmes();

        for (Filme filme : filmes) {
            StackPane card = criarCardFilme(filme);
            filmesPane.getChildren().add(card);
        }
    }

    private StackPane criarCardFilme(Filme filme) {
        StackPane card = new StackPane();
        card.setPrefSize(180, 280);
        card.setStyle(
                "-fx-background-radius: 16;" +
                        "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.8), 16, 0.3, 0, 6);"
        );

        // Criar a imagem do cartaz com bordas arredondadas
        ImageView capa = new ImageView();
        String caminho = "/imagens/" + filme.getImagem();
        InputStream input = getClass().getResourceAsStream(caminho);
        if (input != null) {
            capa.setImage(new Image(input));
        }
        capa.setFitWidth(180);
        capa.setFitHeight(280);
        capa.setPreserveRatio(false);
        capa.setSmooth(true);

        // Criando bordas arredondadas na imagem
        Rectangle clip = new Rectangle(180, 280);
        clip.setArcWidth(16);
        clip.setArcHeight(16);
        capa.setClip(clip);

        // Criando a sobreposição para a descrição (AGORA IGUAL À IMAGEM)
        VBox descricaoBox = new VBox();
        descricaoBox.setAlignment(Pos.BOTTOM_LEFT);
        descricaoBox.setStyle(
                "-fx-background-color: rgba(255,255,255,0.85); " + // Fundo branco semi-transparente
                        "-fx-padding: 15; -fx-background-radius: 16;"
        );
        descricaoBox.setPrefSize(180, 280); // Agora cobre toda a imagem
        descricaoBox.setOpacity(0); // Inicialmente invisível

        Label titulo = new Label(filme.getTitulo());
        titulo.setStyle("-fx-text-fill: #000000; -fx-font-size: 16px; -fx-font-weight: bold;");

        Label duracao = new Label(filme.getGenero() + filme.getDuracao() + " min.");
        duracao.setStyle("-fx-text-fill: #333333; -fx-font-size: 14px;");

        descricaoBox.getChildren().addAll(titulo, duracao);

        // Animação de fade ao passar o mouse
        card.setOnMouseEntered(event -> descricaoBox.setOpacity(1));
        card.setOnMouseExited(event -> descricaoBox.setOpacity(0));

        // Adiciona imagem e descrição ao StackPane (Imagem ao fundo, descrição sobreposta)
        card.getChildren().addAll(capa, descricaoBox);

        return card;
    }







}
