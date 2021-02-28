package tictacteo;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
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
import model.database.History;
import model.database.HistoryModel;
import model.database.Player;
import model.database.PlayerModel;
import model.database.Room;
import model.database.RoomModel;

public class OnLineGamePage extends AnchorPane {

    List<String> record = new ArrayList<String>();
    List<String> position = new ArrayList<String>();
    boolean friendTurn = false;
    Random random = new Random();
    String first;
    String userChar;
    static String commingData = "";
    int num = 0;
    int score = 0;
    String status = "";
    ClientSide curruntClient;
    int drawCounter = 0;
    int id;
    boolean xSelected;
    Thread thread;
    static boolean stopThread = true;
    Player currentPlayer;
    Room room;
    boolean firstTurn;
    String userName;
    History newUserHistory = new History();
    protected final DropShadow ds;
    protected final ImageView logoImageView;
    protected final DropShadow logoDropShadow;
    protected final Label titleLabel;
    protected final DropShadow titleDropShadow;
    protected final Line line;
    protected final Label scoreLabel;
    protected final DropShadow scoreLabelShadow;
    protected final ImageView scoreImage;
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
    protected final Label xTurnLabel;
    protected final DropShadow looserDropShadow;
    protected final ImageView vsImageView;
    protected final Label oTurnLabel;
    protected final DropShadow dropShadow3;
    protected final DropShadow dropShadow4;
    protected final Pane backPane;

    protected final Pane endGamePane;
    protected final ImageView endGameImageView;
    protected final ImageView xIcone;
    protected final ImageView yIcone;
    protected final ImageView vsIcon;
    protected final Button playAgainEnd;
    protected final InnerShadow innerShadow;
    protected final Button watchVideoEndGame;
    protected final InnerShadow innerShadow0;
    protected final Label playerNameLabel;
    protected final Label playerCharacter;
    protected final Label playerNameEndGameLabel;
    protected final Label characterEndGameLable;
    volatile static int player2 = -1;

    public OnLineGamePage(Stage primary, Player currentPlayer, boolean xSelected, Thread thread, Room room) {
        curruntClient = new ClientSide();
        stopThread = true;
        this.room = room;
//        System.out.println(this.room.get_roomId());
        this.currentPlayer = currentPlayer;
        this.id = currentPlayer.getUserID();
        this.userName = currentPlayer.getUserName();
        this.thread = thread;
        newUserHistory.setVsPlayer("Computer");
        newUserHistory.setPlayerId(id);
        this.xSelected = xSelected;
        ds = new DropShadow(20, Color.AQUA);
        logoImageView = new ImageView();
        logoDropShadow = new DropShadow();

        titleLabel = new Label();
        titleDropShadow = new DropShadow();
        line = new Line();

        scoreLabel = new Label();
        scoreLabelShadow = new DropShadow();
        scoreImage = new ImageView();

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
        xTurnLabel = new Label();
        looserDropShadow = new DropShadow();
        vsImageView = new ImageView();
        oTurnLabel = new Label();
        dropShadow3 = new DropShadow();
        dropShadow4 = new DropShadow();
        backPane = new Pane();

        endGamePane = new Pane();
        endGameImageView = new ImageView();
        xIcone = new ImageView();
        yIcone = new ImageView();
        vsIcon = new ImageView();
        playAgainEnd = new Button();
        innerShadow = new InnerShadow();
        watchVideoEndGame = new Button();
        innerShadow0 = new InnerShadow();
        playerNameLabel = new Label();
        playerCharacter = new Label();
        playerNameEndGameLabel = new Label();
        characterEndGameLable = new Label();

        setDesignProperty();
        checkIfPlayersEnter();
        endGameDesign();
        userChar();
        firstTurn();
        setActionsPage(primary);
        setButtonsAction();

    }

    public void setDesignProperty() {
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

        scoreLabel.setLayoutX(423.0);
        scoreLabel.setLayoutY(21.0);
        scoreLabel.setPrefHeight(25.0);
        scoreLabel.setPrefWidth(65.0);
        scoreLabel.setText("Score : 0");
        scoreLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        scoreLabel.setFont(new Font("SansSerif Regular", 12.0));

        scoreLabelShadow.setColor(javafx.scene.paint.Color.BLACK);
        scoreLabel.setEffect(scoreLabelShadow);

        scoreImage.setFitHeight(25.0);
        scoreImage.setFitWidth(25.0);
        scoreImage.setLayoutX(388.0);
        scoreImage.setLayoutY(21.0);
        scoreImage.setPickOnBounds(true);
        scoreImage.setPreserveRatio(true);
        scoreImage.setImage(new Image(getClass().getResource("../view/images/myDashboard/star.png").toExternalForm()));

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

        xTurnLabel.setLayoutX(22.0);
        xTurnLabel.setLayoutY(254.0);
        xTurnLabel.setPrefHeight(26.0);
        xTurnLabel.setPrefWidth(72.0);
        xTurnLabel.setText("Your Turn");
        xTurnLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        xTurnLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        xTurnLabel.setFont(new Font("SansSerif Bold", 15.0));

        xTurnLabel.setEffect(looserDropShadow);
        xTurnLabel.setStyle("visibility: false;");

        vsImageView.setFitHeight(78.0);
        vsImageView.setFitWidth(83.0);
        vsImageView.setLayoutX(209.0);
        vsImageView.setLayoutY(70.0);
        vsImageView.setImage(new Image(getClass().getResource("../view/images/gameMessages/vs.png").toExternalForm()));

        oTurnLabel.setLayoutX(398.0);
        oTurnLabel.setLayoutY(254.0);
        oTurnLabel.setPrefHeight(26.0);
        oTurnLabel.setPrefWidth(72.0);
        oTurnLabel.setText("Your Turn");
        oTurnLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        oTurnLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        oTurnLabel.setFont(new Font("SansSerif Bold", 15.0));
        xImageView.setEffect(null);
        oImageView.setEffect(null);
        dropShadow3.setColor(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        oTurnLabel.setEffect(dropShadow3);
        oTurnLabel.setStyle("visibility: false;");

        backPane.setLayoutX(0.0);
        backPane.setLayoutY(69.0);
        backPane.setOpacity(0.7);
        backPane.setPrefHeight(360.0);
        backPane.setPrefWidth(500.0);
        backPane.setStyle("-fx-background-color: #0c0721;");

        setEffect(dropShadow4);

        getChildren().add(logoImageView);

        getChildren().add(titleLabel);
        getChildren().add(line);
        getChildren().add(exitButton);
        getChildren().add(playAginButton);
        getChildren().add(scoreLabel);
        getChildren().add(scoreImage);
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
        getChildren().add(xTurnLabel);
        getChildren().add(vsImageView);
        getChildren().add(oTurnLabel);
    }

    public void endGameDesign() {
        backPane.setLayoutX(0.0);
        backPane.setLayoutY(69.0);
        backPane.setOpacity(0.7);
        backPane.setPrefHeight(360.0);
        backPane.setPrefWidth(500.0);
        backPane.setStyle("-fx-background-color: #0c0721; visibility: false;");

        endGamePane.setLayoutX(78.0);
        endGamePane.setLayoutY(132.0);
        endGamePane.setPrefHeight(224.0);
        endGamePane.setPrefWidth(344.0);
        endGamePane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

        endGameImageView.setFitHeight(168.0);
        endGameImageView.setFitWidth(335.0);
        endGameImageView.setLayoutX(5.0);
        endGameImageView.setLayoutY(4.0);

        xIcone.setFitHeight(45.0);
        xIcone.setFitWidth(72.0);
        xIcone.setLayoutX(107.0);
        xIcone.setLayoutY(-30.0);
        xIcone.setImage(new Image(getClass().getResource("../view/images/gameMessages/x.png").toExternalForm()));

        yIcone.setFitHeight(45.0);
        yIcone.setFitWidth(88.0);
        yIcone.setLayoutX(167.0);
        yIcone.setLayoutY(-29.0);
        yIcone.setImage(new Image(getClass().getResource("../view/images/gameMessages/o.png").toExternalForm()));

        vsIcon.setFitHeight(45.0);
        vsIcon.setFitWidth(45.0);
        vsIcon.setLayoutX(148.0);
        vsIcon.setLayoutY(-8.0);
        vsIcon.setImage(new Image(getClass().getResource("../view/images/gameMessages/vs.png").toExternalForm()));

        playAgainEnd.setLayoutX(35.0);
        playAgainEnd.setLayoutY(185.0);
        playAgainEnd.setMnemonicParsing(false);
        playAgainEnd.setPrefHeight(17.0);
        playAgainEnd.setPrefWidth(100.0);
        playAgainEnd.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        playAgainEnd.getStyleClass().add("play-btn");
        playAgainEnd.setText("Play Again");
        playAgainEnd.setTextFill(javafx.scene.paint.Color.WHITE);

        playAgainEnd.setEffect(innerShadow);

        watchVideoEndGame.setLayoutX(190.0);
        watchVideoEndGame.setLayoutY(185.0);
        watchVideoEndGame.setMnemonicParsing(false);
        watchVideoEndGame.setPrefHeight(17.0);
        watchVideoEndGame.setPrefWidth(100.0);
        watchVideoEndGame.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        watchVideoEndGame.getStyleClass().add("play-btn");
        watchVideoEndGame.setText("Wach Video");
        watchVideoEndGame.setTextFill(javafx.scene.paint.Color.WHITE);

        watchVideoEndGame.setEffect(innerShadow0);

        playerNameLabel.setLayoutX(40.0);
        playerNameLabel.setLayoutY(150.0);
        playerNameLabel.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerNameLabel.setText("Player:");
        playerNameLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerNameLabel.setFont(new Font(15.0));

        playerCharacter.setLayoutX(195.0);
        playerCharacter.setLayoutY(150.0);
        playerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerCharacter.setText("Character:");
        playerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerCharacter.setFont(new Font(15.0));

        playerNameEndGameLabel.setLayoutX(100.0);
        playerNameEndGameLabel.setText(currentPlayer.getUserName());
        playerNameEndGameLabel.setLayoutY(150.0);
        playerNameEndGameLabel.setPrefHeight(21.0);
        playerNameEndGameLabel.setPrefWidth(80.0);
        playerNameEndGameLabel.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerNameEndGameLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerNameEndGameLabel.setFont(new Font(13.0));

        characterEndGameLable.setLayoutX(275.0);
        characterEndGameLable.setLayoutY(150.0);
        characterEndGameLable.setPrefHeight(21.0);
        characterEndGameLable.setPrefWidth(50.0);
        characterEndGameLable.setText(userChar);
        characterEndGameLable.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        characterEndGameLable.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        characterEndGameLable.setFont(new Font(13.0));

        getChildren().add(backPane);
        endGamePane.getChildren().add(endGameImageView);
        endGamePane.getChildren().add(xIcone);
        endGamePane.getChildren().add(yIcone);
        endGamePane.getChildren().add(vsIcon);
        endGamePane.getChildren().add(playAgainEnd);
        endGamePane.getChildren().add(watchVideoEndGame);
        endGamePane.getChildren().add(playerNameLabel);
        endGamePane.getChildren().add(playerCharacter);
        endGamePane.getChildren().add(playerNameEndGameLabel);
        endGamePane.getChildren().add(characterEndGameLable);
        getChildren().add(endGamePane);

    }

    public void setActionsPage(Stage primary) {
        playAginButton.setOnAction(e -> resetAll());

        exitButton.setOnAction(e -> {
            PlayerModel.updatePlayerScore(id, score);
            deleteRoom(primary);
            primary.setScene(new Scene(new OnlineOfflinePage(primary, currentPlayer, xSelected, thread)));
        });

        playAgainEnd.setOnAction(e -> {
            resetAll();
            backPane.setStyle("-fx-background-color: #0c0721; visibility: false;");
            endGamePane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");
        });

        watchVideoEndGame.setOnAction(e -> primary.setScene(new Scene(new RecordPage(primary, currentPlayer, record, position, thread, "localFriend"))));
    }

    public void setButtonsAction() {
        button00.setOnAction(e -> changeButtonStatus(button00, "00"));
        button01.setOnAction(e -> changeButtonStatus(button01, "01"));
        button02.setOnAction(e -> changeButtonStatus(button02, "02"));
        button10.setOnAction(e -> changeButtonStatus(button10, "10"));
        button11.setOnAction(e -> changeButtonStatus(button11, "11"));
        button12.setOnAction(e -> changeButtonStatus(button12, "12"));
        button20.setOnAction(e -> changeButtonStatus(button20, "20"));
        button21.setOnAction(e -> changeButtonStatus(button21, "21"));
        button22.setOnAction(e -> changeButtonStatus(button22, "22"));
    }

    public void checkStatus() {

        String b1 = button00.getText();
        String b2 = button01.getText();
        String b3 = button02.getText();
        String b4 = button10.getText();
        String b5 = button11.getText();
        String b6 = button12.getText();
        String b7 = button20.getText();
        String b8 = button21.getText();
        String b9 = button22.getText();

        if (b1 == "X" && b2 == "X" && b3 == "X") {
            changeButtonsColor(button00, button01, button02);
            userXWin();
        } else if (b4 == "X" && b5 == "X" && b6 == "X") {
            changeButtonsColor(button10, button11, button12);
            userXWin();
        } else if (b7 == "X" && b8 == "X" && b9 == "X") {
            changeButtonsColor(button20, button21, button22);
            userXWin();
        } else if (b1 == "X" && b4 == "X" && b7 == "X") {
            changeButtonsColor(button00, button10, button20);
            userXWin();
        } else if (b2 == "X" && b5 == "X" && b8 == "X") {
            changeButtonsColor(button01, button11, button21);
            userXWin();
        } else if (b3 == "X" && b6 == "X" && b9 == "X") {
            changeButtonsColor(button02, button12, button22);
            userXWin();
        } else if (b1 == "X" && b5 == "X" && b9 == "X") {
            changeButtonsColor(button00, button11, button22);
            userXWin();
        } else if (b3 == "X" && b5 == "X" && b7 == "X") {
            changeButtonsColor(button02, button11, button20);
            userXWin();
        } else if (b1 == "O" && b2 == "O" && b3 == "O") {
            changeButtonsColor(button00, button01, button02);
            userOWin();
        } else if (b4 == "O" && b5 == "O" && b6 == "O") {
            changeButtonsColor(button10, button11, button12);
            userOWin();
        } else if (b7 == "O" && b8 == "O" && b9 == "O") {
            changeButtonsColor(button20, button21, button22);
            userOWin();
        } else if (b1 == "O" && b4 == "O" && b7 == "O") {
            changeButtonsColor(button00, button10, button20);
            userOWin();
        } else if (b2 == "O" && b5 == "O" && b8 == "O") {
            changeButtonsColor(button01, button11, button21);
            userOWin();
        } else if (b3 == "O" && b6 == "O" && b9 == "O") {
            changeButtonsColor(button02, button12, button22);
            userOWin();
        } else if (b1 == "O" && b5 == "O" && b9 == "O") {
            changeButtonsColor(button00, button11, button22);
            userOWin();
        } else if (b3 == "O" && b5 == "O" && b7 == "O") {
            changeButtonsColor(button02, button11, button20);
            userOWin();
        } else if (drawCounter >= 9) {
            updatePlayerHistory();

        }

    }

    public void userEqual() {
        status = "draw";
        displayEndGame("../view/images/gameMessages/drawc.jpg");
        updatePlayerHistory();
    }

    public String userChar() {
        if (xSelected) {
            userChar = "X";
            return userChar;
        } else {
            userChar = "O";
            return userChar;
        }

    }

    public String firstTurn() {
        if (room.get_player1_Char() == "X") {
            first = "X";
            xImageView.setEffect(ds);
            oImageView.setEffect(null);
            xTurnLabel.setStyle("visibility: true;");
            oTurnLabel.setStyle("visibility: false;");
        } else {
            first = "O";
            oImageView.setEffect(ds);
            xImageView.setEffect(null);
            oTurnLabel.setStyle("visibility: true;");
            xTurnLabel.setStyle("visibility: false;");
        }
        return first;

    }

    public String switchTurns() {
        if (first == "O") {
            oImageView.setEffect(null);
            xImageView.setEffect(ds);
            first = "X";
            oTurnLabel.setStyle("visibility: false;");
            xTurnLabel.setStyle("visibility: true;");
            return first;
        } else if (first == "X") {
            oImageView.setEffect(ds);
            xImageView.setEffect(null);
            xTurnLabel.setStyle("visibility: false;");
            oTurnLabel.setStyle("visibility: true;");
            first = "O";
            return first;
        }
        return null;
    }

    public void userXWin() {
        if (userChar == "X") {
            score++;
            status = "winner";
            oImageView.setEffect(null);
            xImageView.setEffect(null);
            scoreLabel.setText("Score :" + score);
            displayEndGame("../view/images/gameMessages/win.png");
            updatePlayerHistory();

//            gif.setStyle("visibility: true;");
        } else {
            score--;
            status = "looser";
            scoreLabel.setText("Score :" + score);
            oImageView.setEffect(null);
            xImageView.setEffect(null);
            displayEndGame("../view/images/gameMessages/loos.png");
            updatePlayerHistory();

        }
    }

    public void userOWin() {
        if (userChar == "O") {
            score++;
            status = "winner";
            scoreLabel.setText("Score :" + score);
            oImageView.setEffect(null);
            xImageView.setEffect(null);
            displayEndGame("../view/images/gameMessages/win.png");
            updatePlayerHistory();
//            gif.setStyle("visibility: true;");

        } else {
            score--;
            status = "loose";
            scoreLabel.setText("Score :" + score);
            oImageView.setEffect(null);
            xImageView.setEffect(null);
            displayEndGame("../view/images/gameMessages/loos.png");
            updatePlayerHistory();

        }
    }

    public void displayEndGame(String img) {
        thread = new Thread(new Runnable() {

            @Override
            public void run() {
                while (stopThread) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            backPane.setStyle("-fx-background-color: #0c0721; visibility: true;");
                            endGameImageView.setImage(new Image(getClass().getResource(img).toExternalForm()));
                            endGamePane.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: true;");
                            stopThread = false;
                        }
                    });

                }

            }

        });
        thread.start();
    }

    public void changeButtonsColor(Button btn1, Button btn2, Button btn3) {
        btn1.setStyle("-fx-background-color: blue; ");
        btn2.setStyle("-fx-background-color: blue; ");
        btn3.setStyle("-fx-background-color: blue; ");
    }

    public void changeButtonStatus(Button button, String symbol) {
        if (button.getText() == "" && player2 != -1) {
            drawCounter += 1;
            button.setText(first);
            button.setFont(new Font("SansSerif Bold", 15.0));
            if (player2 == currentPlayer.getUserID()) {
                curruntClient.playerPrintStream.println(first + "," + symbol + "," + room.get_player1_Id());
            } else {
                curruntClient.playerPrintStream.println(first + "," + symbol + "," + player2);
            }

            String[] splitMessage = commingData.split(",");
            for (int i = 0; i < splitMessage.length; i++) {
                System.out.println(splitMessage[i]);
            }
            record.add(first);
            position.add(symbol);
            switchTurns();
            checkStatus();
        }
    }

    public void resetAll() {
        record.clear();
        position.clear();
        xImageView.setEffect(null);
        oImageView.setEffect(null);
        drawCounter = 0;
        stopThread = true;
        oTurnLabel.setStyle("visibility: false;");
        xTurnLabel.setStyle("visibility: false;");
        first = firstTurn();
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
    }

    public void deleteRoom(Stage primary) {
        RoomModel.DeleteRoom(room.get_roomId());
        primary.setScene(new Scene(new OnlineOfflinePage(primary, currentPlayer, xSelected, thread)));
    }

    public void checkIfPlayersEnter() {
        thread = new Thread(new Runnable() {

            @Override
            public void run() {
                while (player2 == -1) {

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    }

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            int curruntPlayer2 = RoomModel.showRoom(room.get_roomId());

                            if (curruntPlayer2 != -1) {
                                player2 = curruntPlayer2;
                            }
                        }
                    });
                }
            }
        });
        thread.start();
    }

    public void updatePlayerHistory() {
        playerNameEndGameLabel.setText(userName);
        characterEndGameLable.setText(userChar);
        newUserHistory.setStatus(status);
        HistoryModel.addHistory(newUserHistory);

    }

    public static void messageFromeServer(String msg) {
        commingData = msg;
    }
}
