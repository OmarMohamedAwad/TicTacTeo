package tictacteo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class GamePage extends AnchorPane {
    protected final Pane backPane;
    protected final ImageView logoImage;
    protected final DropShadow logoShadowImage;
    protected final Label gameName;
    protected final DropShadow gameNameShadow;
    protected final Line line;
    protected final Label scoreLabel;
    protected final DropShadow scoreLabelShadow;
    protected final ImageView scoreImage;
    protected final Button easyButton;
    protected final Glow easyButtonEffect;
    protected final Button middleButton;
    protected final Glow middleButtonEffect;
    protected final Button hardButton;
    protected final Glow hardButtonEffect;
    protected final ImageView xImage;
    protected final ImageView oImage;
    protected final Button exitButton;
    protected final InnerShadow exitButtonShadow;
    protected final Button playAgainButton;
    protected final InnerShadow playAgainButtonShadow;
    protected final Pane xOPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnGridPaneConstraints1;
    protected final ColumnConstraints columnGridPaneConstrains2;
    protected final ColumnConstraints columnGridPaneConstrains3;
    protected final RowConstraints rowGridPaneConstrains1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowGridPaneConstrains3;
    protected final ListView cell01;
    protected final ListView cell00;
    protected final ListView cell02;
    protected final ListView cell12;
    protected final ListView cell11;
    protected final ListView cell10;
    protected final ListView cell20;
    protected final ListView cell21;
    protected final ListView cell22;
    protected final DropShadow anchorPaneShadow;
     protected final Pane winner;
    
    protected final DropShadow dropShadow;
    protected final ImageView winnerMessage;
    protected final ImageView xIcone;
    protected final ImageView yIcone;
    protected final ImageView vsIcon;
    protected final Button platAgainWinner;
    protected final InnerShadow innerShadow;
    protected final Button watchVideoWinner;
    protected final InnerShadow innerShadow0;
    protected final Label playerNameLabel;
    protected final Label playerCharacter;
    protected final Label labelWinnerPlayerName;
    protected final Label labelWinnerCharacter;
    
    protected final Pane draw;
    
    protected final DropShadow dropShadow0;
    protected final ImageView drawMessage;
    protected final ImageView xIconDraw;
    protected final ImageView yIconDraw;
    protected final ImageView vsIconDraw;
    protected final Button playAgainDraw;
    protected final InnerShadow innerShadow1;
    protected final Button watchVideoDraw;
    protected final InnerShadow innerShadow2;
    protected final Label drawPlayerName;
    protected final Label drawPlayerCharacter;
    protected final Label labelDrawPlayerName;
    protected final Label labelDrawPlayerCharater;
    protected final Label drawLabel;
    protected final DropShadow dropShadow1;
    
    protected final Pane looser;
    
    protected final DropShadow dropShadow2;
    protected final ImageView looseMessage;
    protected final ImageView xIconeLooser;
    protected final ImageView yIconLooser;
    protected final ImageView vsIconLooser;
    protected final Button playAgainLooser;
    protected final InnerShadow innerShadow3;
    protected final Button watchVideoLooser;
    protected final InnerShadow innerShadow4;
    protected final Label looserPlayerName;
    protected final Label looserPlayerCharacter;
    protected final Label labelLooserPlayerName;
    protected final Label labelLooserPlayerCharacter;
    protected final Label looseLabel;
    protected final DropShadow dropShadow3;

    public GamePage(Stage primary , int id) {
        backPane = new Pane();
        logoImage = new ImageView();
        logoShadowImage = new DropShadow();
        gameName = new Label();
        gameNameShadow = new DropShadow();
        line = new Line();
        scoreLabel = new Label();
        scoreLabelShadow = new DropShadow();
        scoreImage = new ImageView();
        easyButton = new Button();
        easyButtonEffect = new Glow();
        middleButton = new Button();
        middleButtonEffect = new Glow();
        hardButton = new Button();
        hardButtonEffect = new Glow();
        xImage = new ImageView();
        oImage = new ImageView();
        exitButton = new Button();
        exitButtonShadow = new InnerShadow();
        playAgainButton = new Button();
        playAgainButtonShadow = new InnerShadow();
        xOPane = new Pane();
        gridPane = new GridPane();
        columnGridPaneConstraints1 = new ColumnConstraints();
        columnGridPaneConstrains2 = new ColumnConstraints();
        columnGridPaneConstrains3 = new ColumnConstraints();
        rowGridPaneConstrains1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowGridPaneConstrains3 = new RowConstraints();
        cell01 = new ListView();
        cell00 = new ListView();
        cell02 = new ListView();
        cell12 = new ListView();
        cell11 = new ListView();
        cell10 = new ListView();
        cell20 = new ListView();
        cell21 = new ListView();
        cell22 = new ListView();
        anchorPaneShadow = new DropShadow();

       
        winner = new Pane();
        dropShadow = new DropShadow();
        winnerMessage = new ImageView();
        xIcone = new ImageView();
        yIcone = new ImageView();
        vsIcon = new ImageView();
        platAgainWinner = new Button();
        innerShadow = new InnerShadow();
        watchVideoWinner = new Button();
        innerShadow0 = new InnerShadow();
        playerNameLabel = new Label();
        playerCharacter = new Label();
        labelWinnerPlayerName = new Label();
        labelWinnerCharacter = new Label();
        
        draw = new Pane();
        dropShadow0 = new DropShadow();
        drawMessage = new ImageView();
        xIconDraw = new ImageView();
        yIconDraw = new ImageView();
        vsIconDraw = new ImageView();
        playAgainDraw = new Button();
        innerShadow1 = new InnerShadow();
        watchVideoDraw = new Button();
        innerShadow2 = new InnerShadow();
        drawPlayerName = new Label();
        drawPlayerCharacter = new Label();
        labelDrawPlayerName = new Label();
        labelDrawPlayerCharater = new Label();
        drawLabel = new Label();
        dropShadow1 = new DropShadow();
        
        looser = new Pane();
        dropShadow2 = new DropShadow();
        looseMessage = new ImageView();
        xIconeLooser = new ImageView();
        yIconLooser = new ImageView();
        vsIconLooser = new ImageView();
        playAgainLooser = new Button();
        innerShadow3 = new InnerShadow();
        watchVideoLooser = new Button();
        innerShadow4 = new InnerShadow();
        looserPlayerName = new Label();
        looserPlayerCharacter = new Label();
        labelLooserPlayerName = new Label();
        labelLooserPlayerCharacter = new Label();
        looseLabel = new Label();
        dropShadow3 = new DropShadow();
        
        
        
        setId("AnchorPane");
        setPrefHeight(417.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #343F4B;");

        backPane.setLayoutX(0.0);
        backPane.setLayoutY(69.0);
        backPane.setOpacity(0.7);
        backPane.setPrefHeight(360.0);
        backPane.setPrefWidth(500.0);
        backPane.setStyle("-fx-background-color: #0c0721;");
        
        logoImage.setFitHeight(45.0);
        logoImage.setFitWidth(45.0);
        logoImage.setLayoutX(14.0);
        logoImage.setLayoutY(11.0);
        logoImage.setPickOnBounds(true);
        logoImage.setPreserveRatio(true);
        logoImage.setImage(new Image(getClass().getResource("../view/images/tic-tac-toe.jpg").toExternalForm()));

        logoImage.setEffect(logoShadowImage);

        gameName.setLayoutX(85.0);
        gameName.setLayoutY(23.0);
        gameName.setPrefHeight(25.0);
        gameName.setPrefWidth(84.0);
        gameName.setText("Tic Tac Teo");
        gameName.setTextFill(javafx.scene.paint.Color.WHITE);
        gameName.setFont(new Font("SansSerif Bold", 15.0));

        gameNameShadow.setColor(javafx.scene.paint.Color.BLACK);
        gameName.setEffect(gameNameShadow);

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
        scoreLabel.setText("Score : 60");
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

        easyButton.setLayoutX(413.0);
        easyButton.setLayoutY(166.0);
        easyButton.setMnemonicParsing(false);
        easyButton.setPrefHeight(30.0);
        easyButton.setPrefWidth(75.0);
        easyButton.setStyle("-fx-background-color: green;");
        easyButton.setText("Easy");
        easyButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        easyButton.setFont(new Font("System Bold", 14.0));

        easyButton.setEffect(easyButtonEffect);

        middleButton.setLayoutX(413.0);
        middleButton.setLayoutY(231.0);
        middleButton.setMnemonicParsing(false);
        middleButton.setPrefHeight(30.0);
        middleButton.setPrefWidth(75.0);
        middleButton.setStyle("-fx-background-color: grey;");
        middleButton.setText("Middle");
        middleButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        middleButton.setFont(new Font("System Bold", 14.0));

        middleButton.setEffect(middleButtonEffect);

        hardButton.setLayoutX(413.0);
        hardButton.setLayoutY(288.0);
        hardButton.setMnemonicParsing(false);
        hardButton.setPrefHeight(30.0);
        hardButton.setPrefWidth(75.0);
        hardButton.setStyle("-fx-background-color: red;");
        hardButton.setText("Hard");
        hardButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        hardButton.setFont(new Font("System Bold", 14.0));

        hardButton.setEffect(hardButtonEffect);

        xImage.setFitHeight(55.0);
        xImage.setFitWidth(55.0);
        xImage.setLayoutX(155.0);
        xImage.setLayoutY(89.0);
        xImage.setPickOnBounds(true);
        xImage.setPreserveRatio(true);
        xImage.setImage(new Image(getClass().getResource("../view/images/options/x.jpg").toExternalForm()));

        oImage.setFitHeight(55.0);
        oImage.setFitWidth(55.0);
        oImage.setLayoutX(269.0);
        oImage.setLayoutY(89.0);
        oImage.setPickOnBounds(true);
        oImage.setPreserveRatio(true);
        oImage.setImage(new Image(getClass().getResource("../view/images/options/o.jpg").toExternalForm()));

        exitButton.setLayoutX(127.0);
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
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                primary.setScene(new Scene(new OptionPage(primary , id)));
            }
        });     
        
        
        
        
        exitButton.setEffect(exitButtonShadow);

        playAgainButton.setLayoutX(251.0);
        playAgainButton.setLayoutY(353.0);
        playAgainButton.setMaxHeight(37.0);
        playAgainButton.setMaxWidth(129.0);
        playAgainButton.setMnemonicParsing(false);
        playAgainButton.setPrefHeight(25.0);
        playAgainButton.setPrefWidth(103.0);
        playAgainButton.setStyle("-fx-background-color: #3065b5; -fx-background-radius: 15px;");
        playAgainButton.setText("Play again");
        playAgainButton.setTextFill(javafx.scene.paint.Color.valueOf("#f8f7f7"));
        playAgainButton.setFont(new Font(16.0));

        playAgainButton.setEffect(playAgainButtonShadow);

        xOPane.setLayoutX(120.0);
        xOPane.setLayoutY(166.0);
        xOPane.setPrefHeight(160.0);
        xOPane.setPrefWidth(246.0);
        xOPane.setStyle("-fx-background-color: white;");

        gridPane.setLayoutX(-5.0);
        gridPane.setLayoutY(-6.0);
        gridPane.setPrefHeight(167.0);
        gridPane.setPrefWidth(253.0);

        columnGridPaneConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnGridPaneConstraints1.setMinWidth(10.0);
        columnGridPaneConstraints1.setPrefWidth(100.0);

        columnGridPaneConstrains2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnGridPaneConstrains2.setMinWidth(10.0);
        columnGridPaneConstrains2.setPrefWidth(100.0);

        columnGridPaneConstrains3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnGridPaneConstrains3.setMinWidth(10.0);
        columnGridPaneConstrains3.setPrefWidth(100.0);

        rowGridPaneConstrains1.setMaxHeight(50.0);
        rowGridPaneConstrains1.setMinHeight(10.0);
        rowGridPaneConstrains1.setPrefHeight(50.0);
        rowGridPaneConstrains1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(69.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(52.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowGridPaneConstrains3.setMaxHeight(68.0);
        rowGridPaneConstrains3.setMinHeight(10.0);
        rowGridPaneConstrains3.setPrefHeight(54.0);
        rowGridPaneConstrains3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(cell01, 1);
        cell01.setPrefHeight(200.0);
        cell01.setPrefWidth(200.0);

        cell00.setPrefHeight(41.0);
        cell00.setPrefWidth(100.0);

        GridPane.setRowIndex(cell02, 2);
        cell02.setPrefHeight(200.0);
        cell02.setPrefWidth(200.0);

        GridPane.setColumnIndex(cell12, 1);
        GridPane.setRowIndex(cell12, 2);
        cell12.setPrefHeight(200.0);
        cell12.setPrefWidth(200.0);

        GridPane.setColumnIndex(cell11, 1);
        GridPane.setRowIndex(cell11, 1);
        cell11.setPrefHeight(200.0);
        cell11.setPrefWidth(200.0);

        GridPane.setColumnIndex(cell10, 1);
        cell10.setPrefHeight(200.0);
        cell10.setPrefWidth(200.0);

        GridPane.setColumnIndex(cell20, 2);
        cell20.setPrefHeight(200.0);
        cell20.setPrefWidth(200.0);

        GridPane.setColumnIndex(cell21, 2);
        GridPane.setRowIndex(cell21, 1);
        cell21.setPrefHeight(200.0);
        cell21.setPrefWidth(200.0);

        GridPane.setColumnIndex(cell22, 2);
        GridPane.setRowIndex(cell22, 2);
        cell22.setPrefHeight(200.0);
        cell22.setPrefWidth(200.0);

        setEffect(anchorPaneShadow);
        
        
        
        
        
       
        
        
        
        getChildren().add(logoImage);
        getChildren().add(gameName);
        getChildren().add(line);
        getChildren().add(scoreLabel);
        getChildren().add(scoreImage);
        getChildren().add(easyButton);
        getChildren().add(middleButton);
        getChildren().add(hardButton);
        getChildren().add(xImage);
        getChildren().add(oImage);
        getChildren().add(exitButton);
        getChildren().add(playAgainButton);
        gridPane.getColumnConstraints().add(columnGridPaneConstraints1);
        gridPane.getColumnConstraints().add(columnGridPaneConstrains2);
        gridPane.getColumnConstraints().add(columnGridPaneConstrains3);
        gridPane.getRowConstraints().add(rowGridPaneConstrains1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowGridPaneConstrains3);
        gridPane.getChildren().add(cell01);
        gridPane.getChildren().add(cell00);
        gridPane.getChildren().add(cell02);
        gridPane.getChildren().add(cell12);
        gridPane.getChildren().add(cell11);
        gridPane.getChildren().add(cell10);
        gridPane.getChildren().add(cell20);
        gridPane.getChildren().add(cell21);
        gridPane.getChildren().add(cell22);
        xOPane.getChildren().add(gridPane);
        getChildren().add(xOPane);
        
        
  winner.setLayoutX(78.0);
        winner.setLayoutY(132.0);
        winner.setPrefHeight(224.0);
        winner.setPrefWidth(344.0);
        winner.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

        winner.setEffect(dropShadow);

        winnerMessage.setFitHeight(168.0);
        winnerMessage.setFitWidth(335.0);
        winnerMessage.setLayoutX(5.0);
        winnerMessage.setLayoutY(4.0);
        winnerMessage.setImage(new Image(getClass().getResource("../view/images/gameMessages/win.png").toExternalForm()));

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

        platAgainWinner.setLayoutX(46.0);
        platAgainWinner.setLayoutY(193.0);
        platAgainWinner.setMnemonicParsing(false);
        platAgainWinner.setPrefHeight(17.0);
        platAgainWinner.setPrefWidth(88.0);
        platAgainWinner.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        platAgainWinner.getStyleClass().add("play-btn");
        platAgainWinner.setText("Play Again");
        platAgainWinner.setTextFill(javafx.scene.paint.Color.WHITE);

        platAgainWinner.setEffect(innerShadow);

        watchVideoWinner.setLayoutX(201.0);
        watchVideoWinner.setLayoutY(193.0);
        watchVideoWinner.setMnemonicParsing(false);
        watchVideoWinner.setPrefHeight(17.0);
        watchVideoWinner.setPrefWidth(88.0);
        watchVideoWinner.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        watchVideoWinner.getStyleClass().add("play-btn");
        watchVideoWinner.setText("Wach Video");
        watchVideoWinner.setTextFill(javafx.scene.paint.Color.WHITE);

        watchVideoWinner.setEffect(innerShadow0);

        playerNameLabel.setLayoutX(58.0);
        playerNameLabel.setLayoutY(158.0);
        playerNameLabel.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerNameLabel.setText("Player:");
        playerNameLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerNameLabel.setFont(new Font(15.0));

        playerCharacter.setLayoutX(204.0);
        playerCharacter.setLayoutY(158.0);
        playerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        playerCharacter.setText("Character:");
        playerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        playerCharacter.setFont(new Font(15.0));

        labelWinnerPlayerName.setLayoutX(123.0);
        labelWinnerPlayerName.setLayoutY(159.0);
        labelWinnerPlayerName.setPrefHeight(21.0);
        labelWinnerPlayerName.setPrefWidth(32.0);
        labelWinnerPlayerName.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        labelWinnerPlayerName.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        labelWinnerPlayerName.setFont(new Font(15.0));

        labelWinnerCharacter.setLayoutX(293.0);
        labelWinnerCharacter.setLayoutY(160.0);
        labelWinnerCharacter.setPrefHeight(21.0);
        labelWinnerCharacter.setPrefWidth(23.0);
        labelWinnerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        labelWinnerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        labelWinnerCharacter.setFont(new Font(15.0));

        draw.setLayoutX(68.0);
        draw.setLayoutY(144.0);
        draw.setPrefHeight(224.0);
        draw.setPrefWidth(344.0);
        draw.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: false;");

        draw.setEffect(dropShadow0);

        drawMessage.setFitHeight(186.0);
        drawMessage.setFitWidth(335.0);
        drawMessage.setLayoutX(5.0);
        drawMessage.setLayoutY(6.0);
        drawMessage.setImage(new Image(getClass().getResource("../view/images/gameMessages/drawc.jpg").toExternalForm()));

        xIconDraw.setFitHeight(45.0);
        xIconDraw.setFitWidth(72.0);
        xIconDraw.setLayoutX(107.0);
        xIconDraw.setLayoutY(-30.0);
        xIconDraw.setImage(new Image(getClass().getResource("../view/images/gameMessages/x.png").toExternalForm()));

        yIconDraw.setFitHeight(45.0);
        yIconDraw.setFitWidth(88.0);
        yIconDraw.setLayoutX(167.0);
        yIconDraw.setLayoutY(-29.0);
        yIconDraw.setImage(new Image(getClass().getResource("../view/images/gameMessages/o.png").toExternalForm()));

        vsIconDraw.setFitHeight(45.0);
        vsIconDraw.setFitWidth(45.0);
        vsIconDraw.setLayoutX(148.0);
        vsIconDraw.setLayoutY(-8.0);
        vsIconDraw.setImage(new Image(getClass().getResource("../view/images/gameMessages/vs.png").toExternalForm()));

        playAgainDraw.setLayoutX(46.0);
        playAgainDraw.setLayoutY(193.0);
        playAgainDraw.setMnemonicParsing(false);
        playAgainDraw.setPrefHeight(17.0);
        playAgainDraw.setPrefWidth(88.0);
        playAgainDraw.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        playAgainDraw.getStyleClass().add("play-btn");
        playAgainDraw.setText("Play Again");
        playAgainDraw.setTextFill(javafx.scene.paint.Color.WHITE);

        playAgainDraw.setEffect(innerShadow1);

        watchVideoDraw.setLayoutX(201.0);
        watchVideoDraw.setLayoutY(193.0);
        watchVideoDraw.setMnemonicParsing(false);
        watchVideoDraw.setPrefHeight(17.0);
        watchVideoDraw.setPrefWidth(88.0);
        watchVideoDraw.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        watchVideoDraw.getStyleClass().add("play-btn");
        watchVideoDraw.setText("Wach Video");
        watchVideoDraw.setTextFill(javafx.scene.paint.Color.WHITE);

        watchVideoDraw.setEffect(innerShadow2);

        drawPlayerName.setLayoutX(58.0);
        drawPlayerName.setLayoutY(158.0);
        drawPlayerName.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        drawPlayerName.setText("Player:");
        drawPlayerName.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        drawPlayerName.setFont(new Font(15.0));

        drawPlayerCharacter.setLayoutX(204.0);
        drawPlayerCharacter.setLayoutY(158.0);
        drawPlayerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        drawPlayerCharacter.setText("Character:");
        drawPlayerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        drawPlayerCharacter.setFont(new Font(15.0));

        labelDrawPlayerName.setLayoutX(123.0);
        labelDrawPlayerName.setLayoutY(159.0);
        labelDrawPlayerName.setPrefHeight(21.0);
        labelDrawPlayerName.setPrefWidth(32.0);
        labelDrawPlayerName.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        labelDrawPlayerName.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        labelDrawPlayerName.setFont(new Font(15.0));

        labelDrawPlayerCharater.setLayoutX(293.0);
        labelDrawPlayerCharater.setLayoutY(160.0);
        labelDrawPlayerCharater.setPrefHeight(21.0);
        labelDrawPlayerCharater.setPrefWidth(23.0);
        labelDrawPlayerCharater.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        labelDrawPlayerCharater.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        labelDrawPlayerCharater.setFont(new Font(15.0));

        drawLabel.setLayoutX(116.0);
        drawLabel.setLayoutY(26.0);
        drawLabel.setStyle("-fx-font-weight: bolder;");
        drawLabel.setText("DRAW");
        drawLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d300b4"));

        drawLabel.setEffect(dropShadow1);
        drawLabel.setFont(new Font("Microsoft Sans Serif", 37.0));

        looser.setLayoutX(71.0);
        looser.setLayoutY(150.0);
        looser.setPrefHeight(224.0);
        looser.setPrefWidth(344.0);
        looser.setStyle("-fx-border-color: #A500C2; -fx-border-width: 4px; -fx-background-color: #0c0721; visibility: true;");

        looser.setEffect(dropShadow2);

        looseMessage.setFitHeight(168.0);
        looseMessage.setFitWidth(335.0);
        looseMessage.setLayoutX(5.0);
        looseMessage.setLayoutY(19.0);
        looseMessage.setImage(new Image(getClass().getResource("../view/images/gameMessages/loos.png").toExternalForm()));

        xIconeLooser.setFitHeight(45.0);
        xIconeLooser.setFitWidth(72.0);
        xIconeLooser.setLayoutX(107.0);
        xIconeLooser.setLayoutY(-30.0);
        xIconeLooser.setImage(new Image(getClass().getResource("../view/images/gameMessages/x.png").toExternalForm()));

        yIconLooser.setFitHeight(45.0);
        yIconLooser.setFitWidth(88.0);
        yIconLooser.setLayoutX(167.0);
        yIconLooser.setLayoutY(-29.0);
        yIconLooser.setImage(new Image(getClass().getResource("../view/images/gameMessages/o.png").toExternalForm()));

        vsIconLooser.setFitHeight(45.0);
        vsIconLooser.setFitWidth(45.0);
        vsIconLooser.setLayoutX(148.0);
        vsIconLooser.setLayoutY(-8.0);
        vsIconLooser.setImage(new Image(getClass().getResource("../view/images/gameMessages/vs.png").toExternalForm()));

        playAgainLooser.setLayoutX(46.0);
        playAgainLooser.setLayoutY(193.0);
        playAgainLooser.setMnemonicParsing(false);
        playAgainLooser.setPrefHeight(17.0);
        playAgainLooser.setPrefWidth(88.0);
        playAgainLooser.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        playAgainLooser.getStyleClass().add("play-btn");
        playAgainLooser.setText("Play Again");
        playAgainLooser.setTextFill(javafx.scene.paint.Color.WHITE);

        playAgainLooser.setEffect(innerShadow3);

        watchVideoLooser.setLayoutX(201.0);
        watchVideoLooser.setLayoutY(193.0);
        watchVideoLooser.setMnemonicParsing(false);
        watchVideoLooser.setPrefHeight(17.0);
        watchVideoLooser.setPrefWidth(88.0);
        watchVideoLooser.setStyle("-fx-background-radius: 15; -fx-background-color: #006fb2;");
        watchVideoLooser.getStyleClass().add("play-btn");
        watchVideoLooser.setText("Wach Video");
        watchVideoLooser.setTextFill(javafx.scene.paint.Color.WHITE);

        watchVideoLooser.setEffect(innerShadow4);

        looserPlayerName.setLayoutX(58.0);
        looserPlayerName.setLayoutY(158.0);
        looserPlayerName.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        looserPlayerName.setText("Player:");
        looserPlayerName.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        looserPlayerName.setFont(new Font(15.0));

        looserPlayerCharacter.setLayoutX(204.0);
        looserPlayerCharacter.setLayoutY(158.0);
        looserPlayerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        looserPlayerCharacter.setText("Character:");
        looserPlayerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        looserPlayerCharacter.setFont(new Font(15.0));

        labelLooserPlayerName.setLayoutX(123.0);
        labelLooserPlayerName.setLayoutY(159.0);
        labelLooserPlayerName.setPrefHeight(21.0);
        labelLooserPlayerName.setPrefWidth(32.0);
        labelLooserPlayerName.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        labelLooserPlayerName.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        labelLooserPlayerName.setFont(new Font(15.0));

        labelLooserPlayerCharacter.setLayoutX(293.0);
        labelLooserPlayerCharacter.setLayoutY(160.0);
        labelLooserPlayerCharacter.setPrefHeight(21.0);
        labelLooserPlayerCharacter.setPrefWidth(23.0);
        labelLooserPlayerCharacter.setStyle("-fx-font-family: sans serif; -fx-font-weight: bold;");
        labelLooserPlayerCharacter.setTextFill(javafx.scene.paint.Color.valueOf("#d955eb"));
        labelLooserPlayerCharacter.setFont(new Font(15.0));

        looseLabel.setLayoutX(116.0);
        looseLabel.setLayoutY(26.0);
        looseLabel.setStyle("-fx-font-weight: bolder;");
        looseLabel.setText("Looser");
        looseLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d300b4"));

        looseLabel.setEffect(dropShadow3);
        looseLabel.setFont(new Font("Microsoft Sans Serif", 37.0));
        getChildren().add(backPane);
        winner.getChildren().add(winnerMessage);
        winner.getChildren().add(xIcone);
        winner.getChildren().add(yIcone);
        winner.getChildren().add(vsIcon);
        winner.getChildren().add(platAgainWinner);
        winner.getChildren().add(watchVideoWinner);
        winner.getChildren().add(playerNameLabel);
        winner.getChildren().add(playerCharacter);
        winner.getChildren().add(labelWinnerPlayerName);
        winner.getChildren().add(labelWinnerCharacter);
        getChildren().add(winner);
        draw.getChildren().add(drawMessage);
        draw.getChildren().add(xIconDraw);
        draw.getChildren().add(yIconDraw);
        draw.getChildren().add(vsIconDraw);
        draw.getChildren().add(playAgainDraw);
        draw.getChildren().add(watchVideoDraw);
        draw.getChildren().add(drawPlayerName);
        draw.getChildren().add(drawPlayerCharacter);
        draw.getChildren().add(labelDrawPlayerName);
        draw.getChildren().add(labelDrawPlayerCharater);
        draw.getChildren().add(drawLabel);
        getChildren().add(draw);
        looser.getChildren().add(looseMessage);
        looser.getChildren().add(xIconeLooser);
        looser.getChildren().add(yIconLooser);
        looser.getChildren().add(vsIconLooser);
        looser.getChildren().add(playAgainLooser);
        looser.getChildren().add(watchVideoLooser);
        looser.getChildren().add(looserPlayerName);
        looser.getChildren().add(looserPlayerCharacter);
        looser.getChildren().add(labelLooserPlayerName);
        looser.getChildren().add(labelLooserPlayerCharacter);
        looser.getChildren().add(looseLabel);
        getChildren().add(looser);
        
        

    }

  

    
}
