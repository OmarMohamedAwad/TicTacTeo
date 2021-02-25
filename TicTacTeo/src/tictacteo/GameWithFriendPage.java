package tictacteo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameWithFriendPage extends AnchorPane {

    List<String> record = new ArrayList<String>();
    List<String> position = new ArrayList<String>();
    boolean friendTurn = false;
    Random random = new Random();
    Random rand = new Random();
    String first;
    String userChar;
    int num = 0;
    int score = 0;
    protected final DropShadow ds;
    protected final ImageView logoImageView;
    protected final DropShadow logoDropShadow;
    protected final Label titleLabel;
    protected final DropShadow titleDropShadow;
    protected final Line line;
    protected final Button exitButton;
    protected final InnerShadow exitButtonInnerShadow;
    protected final Button playAginButton;
    protected final InnerShadow playAgininnerShadow;
    protected final Pane containerPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints firstColumnConstraints;
    protected final ColumnConstraints secondColumnConstraints;
    protected final ColumnConstraints thirdColumnConstraints;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button00;
    protected final Button button01;
    protected final Button button02;
    protected final Button button10;
    protected final Button button11;
    protected final Button button12;
    protected final Button button20;
    protected final Button button21;
    protected final Button button22;
    protected final ImageView xImageView;
    protected final ImageView oImageView;
    protected final Label oTurnLabel;
    protected final DropShadow dropShadow2;
    protected final ImageView vsImageView;
    protected final Label xTurnLabel;
    protected final DropShadow dropShadow3;
    protected final DropShadow dropShadow4;
    int id; 
    boolean xSelected;
    
    public GameWithFriendPage(Stage primary, int id, boolean xSelected) {
        this.id = id;
        this.xSelected = xSelected;
        ds = new DropShadow(20, Color.AQUA);
        logoImageView = new ImageView();
        logoDropShadow = new DropShadow();
        
        titleLabel = new Label();
        titleDropShadow = new DropShadow();
        line = new Line();
        exitButton = new Button();
        exitButtonInnerShadow = new InnerShadow();
        playAginButton = new Button();
        playAgininnerShadow = new InnerShadow();
        containerPane = new Pane();
        gridPane = new GridPane();
        firstColumnConstraints = new ColumnConstraints();
        secondColumnConstraints = new ColumnConstraints();
        thirdColumnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        button00 = new Button();
        button01 = new Button();
        button02 = new Button();
        button10 = new Button();
        button11 = new Button();
        button12 = new Button();
        button20 = new Button();
        button21 = new Button();
        button22 = new Button();
        xImageView = new ImageView();
        oImageView = new ImageView();
        oTurnLabel = new Label();
        dropShadow2 = new DropShadow();
        vsImageView = new ImageView();
        xTurnLabel = new Label();
        dropShadow3 = new DropShadow();
        dropShadow4 = new DropShadow();
        
        setDesignProperty();
        setActionsPage(primary);
        first = firstTurn(xSelected);
        userChar = userChar(xSelected);
    }
    
    public void setDesignProperty(){
        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");

        logoImageView.setFitHeight(45.0);
        logoImageView.setFitWidth(45.0);
        logoImageView.setLayoutX(14.0);
        logoImageView.setLayoutY(11.0);
        logoImageView.setPickOnBounds(true);
        logoImageView.setPreserveRatio(true);
        logoImageView.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        logoImageView.setEffect(logoDropShadow);

       
        titleLabel.setLayoutX(85.0);
        titleLabel.setLayoutY(23.0);
        titleLabel.setPrefHeight(25.0);
        titleLabel.setPrefWidth(84.0);
        titleLabel.setText("Tic Tac Teo");
        titleLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        titleLabel.setFont(new Font("SansSerif Bold", 15.0));

        titleDropShadow.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        titleLabel.setEffect(titleDropShadow);

        line.setEndX(400.0);
        line.setLayoutX(101.0);
        line.setLayoutY(68.0);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#6b6b6b"));
        line.setStrokeWidth(2.0);

        exitButton.setLayoutX(143.0);
        exitButton.setLayoutY(353.0);
        exitButton.setMaxHeight(37.0);
        exitButton.setMaxWidth(129.0);
        exitButton.setMnemonicParsing(false);
        exitButton.setPrefHeight(25.0);
        exitButton.setPrefWidth(103.0);
        exitButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        exitButton.setText("Exit");
        exitButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        exitButton.setFont(new Font(16.0));

        exitButton.setEffect(exitButtonInnerShadow);

        playAginButton.setLayoutX(257.0);
        playAginButton.setLayoutY(353.0);
        playAginButton.setMaxHeight(37.0);
        playAginButton.setMaxWidth(129.0);
        playAginButton.setMnemonicParsing(false);
        playAginButton.setPrefHeight(25.0);
        playAginButton.setPrefWidth(103.0);
        playAginButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        playAginButton.setText("Play again");
        playAginButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        playAginButton.setFont(new Font(16.0));

        playAginButton.setEffect(playAgininnerShadow);

        containerPane.setLayoutX(141.0);
        containerPane.setLayoutY(158.0);
        containerPane.setPrefHeight(159.0);
        containerPane.setPrefWidth(218.0);
        containerPane.setStyle("-fx-background-color: #343F4B;");

        gridPane.setLayoutX(5.0);
        gridPane.setLayoutY(-8.0);
        gridPane.setPrefHeight(178.0);
        gridPane.setPrefWidth(221.0);
        gridPane.setStyle("-fx-background-color: #343F4B;");

        firstColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        firstColumnConstraints.setMinWidth(10.0);
        firstColumnConstraints.setPrefWidth(100.0);

        secondColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        secondColumnConstraints.setMinWidth(10.0);
        secondColumnConstraints.setPrefWidth(100.0);

        thirdColumnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        thirdColumnConstraints.setMinWidth(10.0);
        thirdColumnConstraints.setPrefWidth(100.0);

        rowConstraints.setMaxHeight(59.200006103515626);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(59.200006103515626);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(69.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(56.799993896484374);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(69.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(52.19998779296874);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        button00.setLayoutX(178.0);
        button00.setLayoutY(11.0);
        button00.setMnemonicParsing(false);
        button00.setPrefHeight(48.0);
        button00.setPrefWidth(60.0);

        GridPane.setRowIndex(button01, 1);
        button01.setLayoutX(10.0);
        button01.setLayoutY(118.0);
        button01.setMnemonicParsing(false);
        button01.setPrefHeight(48.0);
        button01.setPrefWidth(60.0);

        GridPane.setRowIndex(button02, 2);
        button02.setLayoutX(10.0);
        button02.setLayoutY(11.0);
        button02.setMnemonicParsing(false);
        button02.setPrefHeight(48.0);
        button02.setPrefWidth(60.0);

        GridPane.setColumnIndex(button10, 1);
        button10.setLayoutX(10.0);
        button10.setLayoutY(63.0);
        button10.setMnemonicParsing(false);
        button10.setPrefHeight(48.0);
        button10.setPrefWidth(60.0);

        GridPane.setColumnIndex(button11, 1);
        GridPane.setRowIndex(button11, 1);
        button11.setLayoutX(94.0);
        button11.setLayoutY(11.0);
        button11.setMnemonicParsing(false);
        button11.setPrefHeight(48.0);
        button11.setPrefWidth(60.0);

        GridPane.setColumnIndex(button12, 1);
        GridPane.setRowIndex(button12, 2);
        button12.setLayoutX(94.0);
        button12.setLayoutY(63.0);
        button12.setMnemonicParsing(false);
        button12.setPrefHeight(48.0);
        button12.setPrefWidth(60.0);

        GridPane.setColumnIndex(button20, 2);
        button20.setMnemonicParsing(false);
        button20.setPrefHeight(48.0);
        button20.setPrefWidth(60.0);

        GridPane.setColumnIndex(button21, 2);
        GridPane.setRowIndex(button21, 1);
        button21.setLayoutX(178.0);
        button21.setLayoutY(11.0);
        button21.setMnemonicParsing(false);
        button21.setPrefHeight(48.0);
        button21.setPrefWidth(60.0);

        GridPane.setColumnIndex(button22, 2);
        GridPane.setRowIndex(button22, 2);
        button22.setLayoutX(178.0);
        button22.setLayoutY(11.0);
        button22.setMnemonicParsing(false);
        button22.setPrefHeight(48.0);
        button22.setPrefWidth(60.0);

        xImageView.setFitHeight(84.0);
        xImageView.setFitWidth(88.0);
        xImageView.setLayoutX(16.0);
        xImageView.setLayoutY(160.0);
        xImageView.setPickOnBounds(true);
        xImageView.setPreserveRatio(true);
        xImageView.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));

        oImageView.setFitHeight(84.0);
        oImageView.setFitWidth(88.0);
        oImageView.setLayoutX(392.0);
        oImageView.setLayoutY(160.0);
        oImageView.setPickOnBounds(true);
        oImageView.setPreserveRatio(true);
        oImageView.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));

        oTurnLabel.setLayoutX(22.0);
        oTurnLabel.setLayoutY(254.0);
        oTurnLabel.setPrefHeight(26.0);
        oTurnLabel.setPrefWidth(72.0);
        oTurnLabel.setText("Your Turn");
        oTurnLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        oTurnLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        oTurnLabel.setFont(new Font("SansSerif Bold", 15.0));

        dropShadow2.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        oTurnLabel.setEffect(dropShadow2);

        vsImageView.setFitHeight(78.0);
        vsImageView.setFitWidth(83.0);
        vsImageView.setLayoutX(209.0);
        vsImageView.setLayoutY(70.0);
        vsImageView.setImage(new Image(getClass().getResource("../view/images/gameMessages/vs.png").toExternalForm()));

        xTurnLabel.setLayoutX(398.0);
        xTurnLabel.setLayoutY(254.0);
        xTurnLabel.setPrefHeight(26.0);
        xTurnLabel.setPrefWidth(72.0);
        xTurnLabel.setText("Your Turn");
        xTurnLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        xTurnLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        xTurnLabel.setFont(new Font("SansSerif Bold", 15.0));

        dropShadow3.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        xTurnLabel.setEffect(dropShadow3);

        setEffect(dropShadow4);

        getChildren().add(logoImageView);
        
        getChildren().add(titleLabel);
        getChildren().add(line);
        getChildren().add(exitButton);
        getChildren().add(playAginButton);
        gridPane.getColumnConstraints().add(firstColumnConstraints);
        gridPane.getColumnConstraints().add(secondColumnConstraints);
        gridPane.getColumnConstraints().add(thirdColumnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button00);
        gridPane.getChildren().add(button01);
        gridPane.getChildren().add(button02);
        gridPane.getChildren().add(button10);
        gridPane.getChildren().add(button11);
        gridPane.getChildren().add(button12);
        gridPane.getChildren().add(button20);
        gridPane.getChildren().add(button21);
        gridPane.getChildren().add(button22);
        containerPane.getChildren().add(gridPane);
        getChildren().add(containerPane);
        getChildren().add(xImageView);
        getChildren().add(oImageView);
        getChildren().add(oTurnLabel);
        getChildren().add(vsImageView);
        getChildren().add(xTurnLabel);
    }
    
    public void setWinDesignProperty(){
    }
    
    public void setActionsPage(Stage primary) {

        playAginButton.setOnAction(e
                -> {
                        xImageView.setEffect(null);
                        oImageView.setEffect(null);
                        first = firstTurn(xSelected);
                        button00.setText("");
                        button01.setText("");
                        button02.setText("");
                        button10.setText("");
                        button11.setText("");
                        button12.setText("");
                        button20.setText("");
                        button21.setText("");
                        button22.setText("");
                        button00.setStyle("-fx-background-color: #ececec;");
                        button01.setStyle("-fx-background-color: #ececec;");
                        button02.setStyle("-fx-background-color: #ececec;");
                        button10.setStyle("-fx-background-color: #ececec;");
                        button11.setStyle("-fx-background-color: #ececec;");
                        button12.setStyle("-fx-background-color: #ececec;");
                        button20.setStyle("-fx-background-color: #ececec;");
                        button21.setStyle("-fx-background-color: #ececec;");
                        button22.setStyle("-fx-background-color: #ececec;");
        });

        exitButton.setOnAction(e
                -> primary.setScene(new Scene(new OnlineOfflinePage(primary, id, xSelected)))
            
        );
    }
    
    public String firstTurn(boolean xSelected) {
        String first = "";
        if (random.nextInt(2) == 0) {
            friendTurn = true;
            if (xSelected) {
                oImageView.setEffect(ds);
                return first;
            } else {
                xImageView.setEffect(ds);
                first = "X";
                return first;
            }
        } else {
            friendTurn = false;
            if (xSelected) {
                xImageView.setEffect(ds);
                first = "X";
                return first;
            } else {
                oImageView.setEffect(ds);
                first = "O";
                return first;
            }
        }

    }
    
    public String userChar(boolean xSelected) {
        String userChar;
        if (xSelected) {
            userChar = "X";
            return userChar;
        } else {
            userChar = "O";
            return userChar;
        }

    }
}
