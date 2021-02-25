package tictacteo;

import java.awt.AWTException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OptionPage extends AnchorPane {
    protected final Button BackButton;
    protected final InnerShadow innerShadow0;
    protected final Line line;
    protected final ImageView logoImageView;
    protected final DropShadow logoDropShadow;
    protected final StackPane computerStackPane;
    protected final ImageView computerImageView;
    protected final DropShadow computerDropShadow;
    protected final ImageView frindImageView;
    protected final DropShadow frindDropShadow;
    protected final ImageView xImageView;
    protected final DropShadow xDropShadow;
    protected final ImageView oImageView;
    protected final DropShadow oDropShadow;
    protected final RadioButton computerRadioButton;
    protected final ToggleGroup plAgainst;
    protected final DropShadow computerRadioDropShadow;
    protected final RadioButton frindRadioButton;
    protected final DropShadow frindRadioDropShadow;
    protected final RadioButton xRadioButton;
    protected final ToggleGroup xoChar;
    protected final DropShadow xRadioDropShadow;
    protected final RadioButton oRadioButton;
    protected final DropShadow oRadioDropShadow;
    protected final Text logoText;
    protected final DropShadow logoTextDropShadow;
    protected final Text platAgainstText;
    protected final DropShadow platAgainstDropShadow;
    protected final Text yourCharcterText;
    protected final DropShadow yourCharcterDropShadow;
    protected final Button playButton;
    protected final InnerShadow playInnerShadow;
    protected final DropShadow anchorDropShadow;


    public OptionPage(Stage primary, int id , Thread thread) {
          
        line = new Line();
        logoImageView = new ImageView();
        logoDropShadow = new DropShadow();
        computerStackPane = new StackPane();
        computerImageView = new ImageView();
        computerDropShadow = new DropShadow();
        frindImageView = new ImageView();
        frindDropShadow = new DropShadow();
        xImageView = new ImageView();
        xDropShadow = new DropShadow();
        oImageView = new ImageView();
        oDropShadow = new DropShadow();
        computerRadioButton = new RadioButton();
        plAgainst = new ToggleGroup();
        computerRadioDropShadow = new DropShadow();
        frindRadioButton = new RadioButton();
        frindRadioDropShadow = new DropShadow();
        xRadioButton = new RadioButton();
        xoChar = new ToggleGroup();
        xRadioDropShadow = new DropShadow();
        oRadioButton = new RadioButton();
        oRadioDropShadow = new DropShadow();
        logoText = new Text();
        logoTextDropShadow = new DropShadow();
        platAgainstText = new Text();
        platAgainstDropShadow = new DropShadow();
        yourCharcterText = new Text();
        yourCharcterDropShadow = new DropShadow();
        playButton = new Button();
        playInnerShadow = new InnerShadow();
        anchorDropShadow = new DropShadow();
        BackButton = new Button();
        innerShadow0 = new InnerShadow();
        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/view/styles/fxml.css");

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
        logoImageView.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        logoImageView.setEffect(logoDropShadow);

        computerStackPane.setLayoutX(134.0);
        computerStackPane.setLayoutY(86.0);
        computerStackPane.setPrefHeight(106.0);
        computerStackPane.setPrefWidth(111.0);
        computerStackPane.setStyle("-fx-background-color: black;");

        computerImageView.setFitHeight(80.0);
        computerImageView.setFitWidth(104.0);
        computerImageView.setPickOnBounds(true);
        computerImageView.setPreserveRatio(true);
        computerImageView.setImage(new Image(getClass().getResource("../view/images/options/computer.jpg").toExternalForm()));

        computerImageView.setEffect(computerDropShadow);

        frindImageView.setFitHeight(106.0);
        frindImageView.setFitWidth(141.0);
        frindImageView.setLayoutX(331.0);
        frindImageView.setLayoutY(86.0);
        frindImageView.setPickOnBounds(true);
        frindImageView.setPreserveRatio(true);
        frindImageView.setImage(new Image(getClass().getResource("../view/images/options/frind.jpg").toExternalForm()));

        frindImageView.setEffect(frindDropShadow);

        xImageView.setFitHeight(106.0);
        xImageView.setFitWidth(141.0);
        xImageView.setLayoutX(137.0);
        xImageView.setLayoutY(236.0);
        xImageView.setPickOnBounds(true);
        xImageView.setPreserveRatio(true);
        xImageView.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));

        xImageView.setEffect(xDropShadow);

        oImageView.setFitHeight(106.0);
        oImageView.setFitWidth(141.0);
        oImageView.setLayoutX(331.0);
        oImageView.setLayoutY(236.0);
        oImageView.setPickOnBounds(true);
        oImageView.setPreserveRatio(true);
        oImageView.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));

        oImageView.setEffect(oDropShadow);

        computerRadioButton.setLayoutX(140.0);
        computerRadioButton.setLayoutY(196.0);
        computerRadioButton.setMnemonicParsing(false);
        computerRadioButton.setStyle("-fx-text-fill: white;");
        computerRadioButton.setText("Computer");
        computerRadioButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));

        computerRadioButton.setToggleGroup(plAgainst);
        computerRadioButton.setFont(new Font(16.0));

        computerRadioButton.setEffect(computerRadioDropShadow);

        frindRadioButton.setLayoutX(355.0);
        frindRadioButton.setLayoutY(196.0);
        frindRadioButton.setMnemonicParsing(false);
        frindRadioButton.setStyle("-fx-text-fill: white;");
        frindRadioButton.setText("Friend");
        frindRadioButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcf9f9"));
        frindRadioButton.setToggleGroup(plAgainst);
        frindRadioButton.setFont(new Font(16.0));

        frindRadioButton.setEffect(frindRadioDropShadow);

        xRadioButton.setLayoutX(171.0);
        xRadioButton.setLayoutY(343.0);
        xRadioButton.setMnemonicParsing(false);
        xRadioButton.setStyle("-fx-text-fill: white;");
        xRadioButton.setText("X");
        xRadioButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f6f6"));
        xRadioButton.setFont(new Font(16.0));

        xRadioButton.setToggleGroup(xoChar);

        xRadioButton.setEffect(xRadioDropShadow);

        oRadioButton.setLayoutX(363.0);
        oRadioButton.setLayoutY(343.0);
        oRadioButton.setMnemonicParsing(false);
        oRadioButton.setStyle("-fx-text-fill: white;");
        oRadioButton.setText("O");
        oRadioButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f6f6"));
        oRadioButton.setToggleGroup(xoChar);
        oRadioButton.setFont(new Font(16.0));

        oRadioButton.setEffect(oRadioDropShadow);

        logoText.setFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
        logoText.setLayoutX(83.0);
        logoText.setLayoutY(39.0);
        logoText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        logoText.setStrokeWidth(0.0);
        logoText.setText("Tic Tac Teo");
        logoText.setFont(new Font("System Bold", 15.0));

        logoText.setEffect(logoTextDropShadow);

        platAgainstText.setFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        platAgainstText.setLayoutX(11.0);
        platAgainstText.setLayoutY(127.0);
        platAgainstText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        platAgainstText.setStrokeWidth(0.0);
        platAgainstText.setStyle("-fx-font-weight: bold;");
        platAgainstText.setText(" Play Against :");
        platAgainstText.setWrappingWidth(110.99999667424709);
        platAgainstText.setFont(new Font(16.0));

        platAgainstText.setEffect(platAgainstDropShadow);

        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                boolean xSelected=false;
                if ((xRadioButton.isSelected() || oRadioButton.isSelected()) && (frindRadioButton.isSelected() || computerRadioButton.isSelected())) {
                    if((xRadioButton.isSelected()) && (computerRadioButton.isSelected() || frindRadioButton.isSelected())){
                        xSelected=true;                       
                    }
                    else if((oRadioButton.isSelected()) && (computerRadioButton.isSelected() || frindRadioButton.isSelected())){
                        xSelected=false;
                    }

                    if(computerRadioButton.isSelected())
                        primary.setScene(new Scene(new GamePage(primary, id, xSelected, thread)));
                    else if(frindRadioButton.isSelected())
                        primary.setScene(new Scene(new OnlineOfflinePage(primary, id, xSelected, thread)));
                } else {
                    Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                    a.setHeaderText(null);
                    a.setContentText("You must choose your charcter and vs player");
                    a.show();

                }
            }

        });

        BackButton.setLayoutX(125.0);
        BackButton.setLayoutY(377.0);
        BackButton.setMnemonicParsing(false);
        BackButton.setPrefHeight(26.0);
        BackButton.setPrefWidth(130.0);
        BackButton.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        BackButton.getStyleClass().add("mainFxmlClass");
        BackButton.setText("Back");
        BackButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        BackButton.setEffect(innerShadow0);
        BackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {

                primary.setScene(new Scene(new MyDashboardPage(primary, id , thread)));
            }
        });

        yourCharcterText.setFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        yourCharcterText.setLayoutX(11.0);
        yourCharcterText.setLayoutY(283.0);
        yourCharcterText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        yourCharcterText.setStrokeWidth(0.0);
        yourCharcterText.setStyle("-fx-font-weight: bold;");
        yourCharcterText.setText("Your Charcter :");
        yourCharcterText.setWrappingWidth(123.2548828125);
        yourCharcterText.setFont(new Font(16.0));

        yourCharcterText.setEffect(yourCharcterDropShadow);

        playButton.setLayoutX(322.0);
        playButton.setLayoutY(377.0);
        playButton.setMnemonicParsing(false);
        playButton.setPrefHeight(26.0);
        playButton.setPrefWidth(130.0);
        playButton.setStyle("-fx-background-radius: 15px; -fx-background-color: #3065b5; -fx-color: white;");
        playButton.getStyleClass().add("mainFxmlClass");
        playButton.setText("Play Now");
        playButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));

        playButton.setEffect(playInnerShadow);

        setEffect(anchorDropShadow);

        getChildren().add(line);
        getChildren().add(logoImageView);
        computerStackPane.getChildren().add(computerImageView);
        getChildren().add(computerStackPane);
        getChildren().add(frindImageView);
        getChildren().add(xImageView);
        getChildren().add(oImageView);
        getChildren().add(computerRadioButton);
        getChildren().add(frindRadioButton);
        getChildren().add(xRadioButton);
        getChildren().add(oRadioButton);
        getChildren().add(logoText);
        getChildren().add(platAgainstText);
        getChildren().add(yourCharcterText);
        getChildren().add(playButton);
        getChildren().add(BackButton);

    }
}
