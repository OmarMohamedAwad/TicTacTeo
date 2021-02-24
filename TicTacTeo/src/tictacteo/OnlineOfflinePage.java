package tictacteo;

import java.net.URL;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class OnlineOfflinePage extends AnchorPane {

    protected final Line line;
    protected final ImageView logoImageView;
    protected final DropShadow dropShadow;
    protected final Text text;
    protected final DropShadow dropShadow0;
    protected final StackPane stackPane;
    protected final ImageView imageView0;
    protected final DropShadow dropShadow1;
    protected final ImageView imageView1;
    protected final DropShadow dropShadow2;
    protected final Button button;
    protected final InnerShadow innerShadow;
    protected final Button button0;
    protected final InnerShadow innerShadow0;
    protected final TextField textField;
    protected final DropShadow dropShadow3;

    public OnlineOfflinePage() {

        line = new Line();
        logoImageView = new ImageView();
        dropShadow = new DropShadow();
        text = new Text();
        dropShadow0 = new DropShadow();
        stackPane = new StackPane();
        imageView0 = new ImageView();
        dropShadow1 = new DropShadow();
        imageView1 = new ImageView();
        dropShadow2 = new DropShadow();
        button = new Button();
        innerShadow = new InnerShadow();
        button0 = new Button();
        innerShadow0 = new InnerShadow();
        textField = new TextField();
        dropShadow3 = new DropShadow();

        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/view/fxm/fxml.css");

        line.setEndX(400.0);
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);
        line.setStyle("-fx-stroke: #6b6b6b;");

        logoImageView.setFitHeight(45.0);
        logoImageView.setFitWidth(45.0);
        logoImageView.setLayoutX(14.0);
        logoImageView.setLayoutY(11.0);
        logoImageView.setPickOnBounds(true);
        logoImageView.setPreserveRatio(true);
        logoImageView.setImage(new Image(getClass().getResource("../images/options/tic-tac-toe-game.jpg").toExternalForm()));

        logoImageView.setEffect(dropShadow);

        text.setFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        text.setLayoutX(83.0);
        text.setLayoutY(39.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Teo");
        text.setFont(new Font("System Bold", 15.0));

        text.setEffect(dropShadow0);

        stackPane.setLayoutX(51.0);
        stackPane.setLayoutY(155.0);
        stackPane.setPrefHeight(106.0);
        stackPane.setPrefWidth(106.0);

        imageView0.setFitHeight(110.0);
        imageView0.setFitWidth(109.0);
        imageView0.setImage(new Image(getClass().getResource("../images/onlineOffline/online.jpg").toExternalForm()));

        imageView0.setEffect(dropShadow1);

        imageView1.setFitHeight(106.0);
        imageView1.setFitWidth(141.0);
        imageView1.setLayoutX(353.0);
        imageView1.setLayoutY(156.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("../images/onlineOffline/offline.jpg").toExternalForm()));

        imageView1.setEffect(dropShadow2);

        button.setLayoutX(47.0);
        button.setLayoutY(323.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(26.0);
        button.setPrefWidth(114.0);
        button.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        button.getStyleClass().add("mainFxmlClass");
        button.setText("Play Online");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        button.setEffect(innerShadow);

        button0.setLayoutX(349.0);
        button0.setLayoutY(323.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(26.0);
        button0.setPrefWidth(114.0);
        button0.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        button0.getStyleClass().add("mainFxmlClass");
        button0.setText("Play Offline");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        button0.setEffect(innerShadow0);

        textField.setLayoutX(48.0);
        textField.setLayoutY(280.0);
        textField.setPrefHeight(26.0);
        textField.setPrefWidth(114.0);
        textField.setStyle("-fx-border-radius: 10;");

        setEffect(dropShadow3);

        getChildren().add(line);
        getChildren().add(logoImageView);
        getChildren().add(text);
        stackPane.getChildren().add(imageView0);
        getChildren().add(stackPane);
        getChildren().add(imageView1);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(textField);

    }
}
